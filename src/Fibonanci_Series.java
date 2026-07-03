public class Fibonanci_Series {
    public static int fib(int n){
        if (n<=1) {
            return n;
        }
             int last = fib(n -1);
             int SecondLast = fib(n-2);
        return last + SecondLast;
    }
    public static void main(String[] args){
        System.out.println(fib(5));
    }
}
