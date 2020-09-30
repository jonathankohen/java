import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        // printAll();
        // printOdd();
        // printSum();
        // int[] iterateArr = {1,3,5,7,9,13};
        // iterateArr(iterateArr);
        // int[] findMax = {-3, -5, -7};
        // findMax(findMax);
        // int[] findAvg = {2, 10, 3};
        // findAvg(findAvg);
        // oddArr();
        // int[] bigY = {1, 3, 5, 7};
        // bigY(bigY, 3);
        // int[] squared = {1, 5, 10, -2};
        // squared(squared);
        // int[] noNeg = {1, 5, 10, -2};
        // noNeg(noNeg);
        int[] shift = {1, 5, 10, 7, -2};
        shift(shift);
    }

    public static void printAll() {
        for (int i=1; i<=255; i++) {
            System.out.println(i);
        }
    }

    public static void printOdd() {
        for (int i=1; i<=255; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printSum() {
        int sum = 0;
        for (int i=0; i<=255; i++) {
            sum += i;
            System.out.println("New number: " + i + ", Sum: " + sum);
        }

    }
    
    public static void iterateArr(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }    
    
    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i=0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }   

    public static void findAvg(int[] arr) {
        int sum = 0;
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }

    public static void oddArr() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=0; i <= 255; i++) {
            if (i % 3 == 0) {
                y.add(i);
            }
        }
        System.out.println(y);
    }

    public static void bigY(int[] arr, int y) {
        int counter = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] > y) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void squared(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=0; i < arr.length; i++) {
            newArr.add(arr[i] * arr[i]);
        }
            System.out.println(newArr);
    }

    public static void noNeg(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            newArr.add(arr[i]);
        }
            System.out.println(newArr);
    }
    
    public static void maxMinAvg(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(max + " " + min + " " + sum/arr.length);
    }    

    public static void shift(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=1; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        newArr.add(0);
        System.out.println(newArr);
    }
}
