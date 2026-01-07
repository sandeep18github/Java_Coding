@FunctionalInterface
interface Calculator{
    abstract int sum(int a,int b);

    static void print(){
        System.out.println("Custom calculator functional interface");
    }
    default void description(){
        System.out.println("default method");
    }
}


public class Test5 {
    public static void main(String[] args) {

        Calculator calculate =(a, b)-> a+b;
        int result = calculate.sum(10,20);
        System.out.println(result);

    }
}
