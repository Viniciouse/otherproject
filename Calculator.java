

/* 
1 gallon = 3.785411784
*/

public class Calculator {

    private static final double litr = 3.785411784;

    public static double multiply(double a, double litr) {
        return a * litr;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.multiply(5.0, litr);
        System.out.println(result);  
    }
}




