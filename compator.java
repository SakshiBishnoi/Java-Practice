import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class compator {
    public static void main(String[] args) {
        //List<Integer>  list1 = List.of(4, 2, 9);
        List<Integer> nums = new ArrayList<>() ;
        
        //nums.addAll(List.of(3,5,-7));
        nums.add(2);
        nums.add(2112);
        nums.add(21);
        nums.add(9);
        nums.add(0);

        Collections.sort(nums);
        System.out.println(nums);


    }
    
}
