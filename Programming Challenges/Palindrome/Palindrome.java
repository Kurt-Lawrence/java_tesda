import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter string: ");
        String word = in.nextLine();

        in.close();

        StringBuilder sb_word = new StringBuilder(word);
        
        if(word.equals(sb_word.reverse().toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        

    }//main end
}//class end