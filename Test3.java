import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
         int[] array1={1,2,3,4,5};
         int[] array2={1,2,3,4,4};

        System.out.println("Array_1 "+duplicate(array1));
        System.out.println("Array_2 "+duplicate(array2));


    }
    private static Boolean duplicate(int[] array){
        Set<Integer> set = new HashSet<>();
        for(int n:array){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }
}
