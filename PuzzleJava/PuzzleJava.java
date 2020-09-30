import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {
    public static void main(String[] args) {
        // int[] sumAndTen = {3,5,1,2,7,9,8,13,25,32};
        // System.out.println(firstPuzz(sumAndTen));
        // System.out.println(secondPuzz());
        // thirdPuzz();
        // System.out.println(fourthPuzz(55, 100));
        // System.out.println(fifthPuzz(55, 100));
        // System.out.println(sixthPuzz(5));
        System.out.println(seventhPuzz(5));
    }

    public static ArrayList<Integer> firstPuzz(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        return newArr;
    }

    public static ArrayList<String> secondPuzz() {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Nancy");
        arr.add("Jinichi");
        arr.add("Fujibayashi");
        arr.add("Momochi");
        arr.add("Ishikawa");

        Collections.shuffle(arr);

        ArrayList<String> fiveArr = new ArrayList<String>();

        for(String name: arr){
            System.out.println(name);
            if (name.length() > 5) {
                fiveArr.add(name);
            }
        }

        return fiveArr;
    }

    public static void thirdPuzz() {
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
        alphabet.add("I");
        alphabet.add("J");
        alphabet.add("K");
        alphabet.add("L");
        alphabet.add("M");
        alphabet.add("N");
        alphabet.add("O");
        alphabet.add("P");
        alphabet.add("Q");
        alphabet.add("R");
        alphabet.add("S");
        alphabet.add("T");
        alphabet.add("U");
        alphabet.add("V");
        alphabet.add("W");
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");

        Collections.shuffle(alphabet);

        ArrayList<String> vowels = new ArrayList<String>();
        vowels.add("A");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        vowels.add("U");
        vowels.add("Y");

        for (int i=0; i<alphabet.size(); i++) {
            System.out.println(alphabet.get(i));
            if (i == alphabet.size() - 1) {
                System.out.println(alphabet.get(i));
            }
            if (i == 0) {
                System.out.println(alphabet.get(i));
            }
            if (vowels.contains(alphabet.get(i))) {
                    System.out.println("^^^ Nice vowel!");
            }
        }
    }

	public static ArrayList<Integer> fourthPuzz(int min, int max) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
  
        for (int i=0; i<10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            newArr.add(randomNum);
        }

        return newArr;
    }
    
    public static ArrayList<Integer> fifthPuzz(int min, int max) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
  
        for (int i=0; i<10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            newArr.add(randomNum);
        }

        Collections.sort(newArr);

        System.out.println("First value:" + newArr.get(0));
        System.out.println("Last value:" + newArr.get(newArr.size() - 1));

        return newArr;
    } 
    
    public static String sixthPuzz(int num) {
        String alphabet = "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(num); 
        
        for (int i = 0; i < num; i++) { 
            int index = (int)(alphabet.length()* Math.random()); 
            sb.append(alphabet.charAt(index)); 
        } 
  
        return sb.toString();
    }

    public static ArrayList<String> seventhPuzz(int num) {
        ArrayList<String> moreStrings = new ArrayList<String>();
        String alphabet = "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(num); 
        
        for (int j=0; j<10; j++) {
            for (int i=0; i<num; i++) { 
                int index = (int)(alphabet.length()* Math.random()); 
                sb.append(alphabet.charAt(index)); 
            } 
            moreStrings.add(sb.toString());
            sb.setLength(0);
        }

        return moreStrings;   
    }
}
