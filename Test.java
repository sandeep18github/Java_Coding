import javax.naming.PartialResultException;
import java.util.*;


public class Test {
    public static void main(String[] args) {

        int[] num ={0,1,2,0,5,0};

       /* List<Integer> list = new ArrayList<>();

        for (int n :num){
            list.add(n);
        }

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);*/
      /* int index = 0;
       for (int i =0; i< num.length;i++){
           if(num[i] != 0){
               num[index++] = num[i];
           }

           }
       while(index < num.length-1){

           num[index++] = 0;
       }*/

        int index = num.length-1;
        for (int i =num.length-1; i>=0;i--){
            if (num[i] !=0){
                num[index--]=num[i];
            }
        }
        while(index >=0){
            num[index--]=0;


        }


        System.out.println(Arrays.toString(num));
       }
    }

