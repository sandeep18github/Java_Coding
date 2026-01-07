import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

//Find the Strings are balanced or not balanced "[({})]", "{(})"
//find top k elements frequency from array
//int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4};
//int k = 2;
public class Test8 {

    public static void main(String[] args) {


        int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4};
        int k = 2;
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet()
                .stream().sorted((a, b) -> Long.compare(b.getValue(), a.getValue())).limit(k)
                .forEach(i -> System.out.println(i.getKey()));
    }
}
