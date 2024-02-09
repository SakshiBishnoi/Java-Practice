import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class foreach {
    public static void main(String[] args) {
        List<Integer> num1 = Arrays.asList(23,24,35,45,65,56,77,76,43,14,35,55,74);
        //Consumer<Integer> cons = n -> System.out.println(n);
         num1.forEach(n -> System.out.println(n));   
    }
       
}

