import java.sql.ResultSetMetaData;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {

        String s1 ="1,2,3,4,5";
        String s2 ="3,4,5,6,7";

       Set<Integer> set=Arrays.stream(s1.split(",")).map(Integer::parseInt).collect(Collectors.toSet());

       Arrays.stream(s2.split(",")).map(Integer::parseInt).filter(set::contains).forEach(n->System.out.print(n+" "));
    }
}
