import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {
        //Palindrom
//Approach -1
       /* String name = "Racecar" ;

        String reverseName="";
        int len = name.length()-1;

       for(int i = len;i >=0;i--){

           reverseName += name.charAt(i);
       }
        System.out.println(reverseName);
       if (name.equals(reverseName)){

           System.out.println("Yes palindrom");
       }else
           System.out.println("Not palindrom");*/

        //=======Approach java-8===============================================

        String name = "Racecar";

        boolean equals = Arrays.stream(name.split("")).reduce("", (a, b) -> b + a).equalsIgnoreCase(name);
        System.out.println(equals);


    }
}
