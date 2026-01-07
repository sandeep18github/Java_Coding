import java.util.stream.IntStream;

public class Test7 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};

        for (int n :arr){

            if(isPrime(n)){
                System.out.print(n+",");
            }
        }

    }

    private static boolean isPrime(int n){
        return n>1 && IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(i->n%i ==0);
    }
}
