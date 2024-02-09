import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class campator2 {
    public static void main(String[] args /*,List<Integer> Li*/) {
        Comparator<Integer> Comp = new Comparator<Integer>() {
            public int compare (Integer i, Integer j){  
            if(i % 10 < j % 10 ) return 1;
            else return -1;
            }
        };

        //List<Integer> Li  = List.of(93,45,678,32,76);
        
        //Li = List.of(93,45,678,32,76);

        List<Integer> nums = new ArrayList<>(List.of(93,45,678,32,76));

        Collections.sort(nums ,Comp);
        System.out.println("Sorted list is : "+ nums);
    }
}   
