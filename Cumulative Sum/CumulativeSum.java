
public class CumulativeSum{
    public static void main(String[] args) {

        System.out.println("Cumulative Sum: " + cumulativeSum(5,2));
        
    }

    static int cumulativeSum(int... nums){
        
        int sumOfAll = 0;   //variable for sum

        
        for(int num:nums){  //loop through the list of numbers
            for(int x = num ; x > 0; x--){  //loop to descent through the number ex. 4,3,2,1
                sumOfAll += x;
            }
            System.out.println();
        }

        return sumOfAll;
    }
}