import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream2 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 3, 5, 7, 9);

        Stream<Integer> s1 = num.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);

        s1.forEach(n -> System.out.println(n));
        //s2.forEach(n -> System.out.println(n));
    }
}
