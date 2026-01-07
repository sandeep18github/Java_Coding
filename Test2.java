
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        String name = "SandeepKumars";

        Optional<Character> character = name.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue() ==1).map(Map.Entry::getKey).findFirst();
        System.out.println(character);
    }
}
