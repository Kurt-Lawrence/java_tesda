import java.util.Scanner;

public class ArithmeticOperation{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter first num: ");
        double x = in.nextDouble();
        System.out.println("Enter second num: ");
        double y = in.nextDouble();

        System.out.println("Sum: " + add(x,y));
        System.out.println("Difference: " + sub(x,y));
        System.out.println("Product: " + mul(x,y));
        System.out.println("Quotient: " + div(x,y));

        in.close();


    }

    static double add(double x, double y){

        double result = x + y;
        return result;
    }

    static double sub(double x, double y){

        double result = x - y;
        return result;
    }

    static double mul(double x, double y){

        double result = x * y;
        return result;
    }

    static double div(double x, double y){

        double result = x / y;
        return result;
    }

    
}