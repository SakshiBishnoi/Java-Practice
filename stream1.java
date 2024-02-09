import java.util.Arrays;
import java.util.List;

public class stream1 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,3,4,5,7,0,2,46,567);

        int sum = 0;
        for (int n : num){
            if(n % 2 == 0) {
                n= n*2;
                sum = sum + n;
            } else 
            System.out.println("Woops, " + n + " is an odd number");
        } 
        System.out.println();
    System.out.println("Sum of even numbers is " +sum);
    }
}
