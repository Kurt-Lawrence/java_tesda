import java.util.Scanner;

public class oddOrEven{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = in.nextInt();

        String sign;
        String odd_or_even;
        String zero;

        if(x == 0){
            zero = "zero";
        }else{
            zero = "";
        }

        if(x%2==0){
            odd_or_even ="even";
        }else{
            odd_or_even = "odd";
        }

        if(x >= 0){
            sign = "positive";
        }else{
            sign = "negative";
        }

        if(zero == "zero"){
            System.out.println("The number is 0");
        }else{
            System.out.println(x + " is a " + sign + " " + odd_or_even + " number");
        }

        


    }//main end
}//class end