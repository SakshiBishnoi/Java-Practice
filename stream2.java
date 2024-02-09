import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class stream2 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 3, 5, 7, 9, -4, 10,23,46,28,30,46,58,64,72,86,94,100);

        Stream<Integer> s1 = num.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==1);
        Stream<Integer> s3 = s2.map(n -> n*2);
        //int result  = s3.reduce(0, (x, y) -> x + y);
        
       //Predicate<Integer> p1 = n -> n % 2 == 0;

        // public boolean test(Integer n) {
          //  return n % 2 == 0;
        //     if(n%2==0) 
        //         return true;
        //     else
        //         return false;
        
        
       //Function<Integer, Integer> f1 = new Function<Integer,Integer>() {
       // Function<Integer, Integer> f1 = n -> n*4;

            // public Integer apply(Integer n) {
            //     return n * 4;


         int result = num.stream()
                         .filter( n -> n % 2 == 0 /*p1*/)
                         .map(n -> n*2/*f1*/)
                         .reduce(0, (x, y) -> x + y);


        System.out.println("result = "  + result);                

        //s1.forEach(n -> System.out.println(n));
        //s2.forEach(n -> System.out.println(n));
        //s3.forEach(n -> System.out.println(n));
    }
}
