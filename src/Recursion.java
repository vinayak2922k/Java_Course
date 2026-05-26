import java.util.Scanner;

public class Recursion {

    //BY    RECURSION

    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int fact;
            fact = n * factorial(n-1);
            return fact;
        }
    }

    //BY FOR LOOP

    static int factorial_iterative(int m){
        if (m==0 || m==1){
            return 1;
        }
        else{
            int result = 1 ;
            for(int i = 1; i <= m ;i++){
                result *= i;
            }
            return result;
        }
    }


    public static void main() {
       Scanner Sc = new Scanner(System.in);
       //by recursion
        System.out.println("Enter the Value of factorial you want to calculate");
       int x = Sc.nextInt();
        System.out.println("The factorial of "+ x  +" is : " + factorial(x));

       //by for loop
        System.out.println("Enter the Value of factorial you want to calculate");
        int y = Sc.nextInt();
        System.out.println("The factorial of "+ y  +" is : " + factorial_iterative(y));
    }
}
