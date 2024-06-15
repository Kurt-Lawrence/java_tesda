
import java.util.*;

public class LargerstNumber {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(in.nextInt());
        nums.add(in.nextInt());
        nums.add(in.nextInt());

        int max = Collections.max(nums);

        in.close();

        System.out.println(max);
        
    }
}
