import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream3 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 3, 58,64,72,86,94,100);
        Stream<Integer> s = num.parallelStream()
                                .filter(n-> n % 2 == 0 ) // filter out odd numbers
                                .sorted();
        s.forEach(n -> System.out.println(n));

    //System.out.println("Even Numbers: " + s);
    }

}