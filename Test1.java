import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        int[] num = {8,3,2,8,0,0,5,9,6,0};

       Map<Integer,Long> fre = Arrays.stream(num).boxed().collect(Collectors.groupingBy(n-> n,Collectors.counting()));

        System.out.println(fre);
    }
}
