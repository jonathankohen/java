import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double aS = Math.pow(legA, 2);
        double bS = Math.pow(legB, 2);
        double sum = aS + bS;
        double result = Math.sqrt(sum);

        return result;
    }
}
