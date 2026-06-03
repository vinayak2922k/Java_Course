import java.sql.PreparedStatement;

public class Methods_Question {

    //1.Print Multiplication table of n

 static void multiply(int n){
    for(int i=1;i<=10;i++){
        System.out.format("%d X %d = %d\n",n,i,n*i);
    }
 }


    //2.Printing star pattern

 static void Star(int n){
     for(int i = 0; i<n;i++){
         for(int j = 0;j<i+1;j++){
             System.out.print("*");
         }
         System.out.println( );
     }
 }


     //3.Sum of first n natural numbers
    static void Sum(int n){
     int sum = 0;
     for(int i = 0;i<=n;i++){
         sum = sum + i;
     }
        System.out.println("The sum of sequence is: " + sum);
    }


    //4.Fibnoncii series sum
    static int fib(int n){
     if (n==1 || n == 2){
         return n-1;
     }else{
         return fib(n-1) + fib(n-2);
     }
    }


     //5.Average of the students using VAR_ARGS
    static int Ave(int ...arr){
     int Average = 0;
     for(int element:arr){
         Average += element;
     }
     return Average/ arr.length;
    }


    public static void main(String[] args) {
        //1.Problem
        // multiply(7);

        //2.Problem
        // Star(7);

        //3.Problem
        // Sum(5);

        //4.probelem
        // int result =fib(8);
        //System.out.println("The result of fibnoncii series is: " + result);

        //5.Problem
        System.out.println("The result of the average is: " + Ave(40,55,66,77,88,99));

 }
}