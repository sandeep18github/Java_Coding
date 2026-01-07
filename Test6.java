import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        String str ="the java is amazing";

        List<Integer> list = Arrays.stream(str.split(" ")).map(word -> word.length()).collect(Collectors.toList());
        System.out.println(list);
    }
}
