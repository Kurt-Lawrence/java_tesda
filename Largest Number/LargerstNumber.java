
import java.util.*;

public class LargerstNumber {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter 3 numbers:");

        try {
            for (int i = 0; i < 3; i++) {
                nums.add(in.nextInt());
            }

            int max = Collections.max(nums);
            System.out.println("Maximum number entered: " + max);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");


        } finally {
            
                in.close();       
        }
    }
}
