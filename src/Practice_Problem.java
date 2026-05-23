public class Practice_Problem {
   public  static void main() {
       // 1.for the star pattern

       /*
       int n = 4;
       //This for loop is for each line
       for (int i = 0; i < n; i++) {
//This for loop is to print some number of stars in one line
           for (int j = i; j<n; j++) {
               System.out.print("*");
           }
           System.out.print("\n");
       }
    }
}
*/


//2. for sum of first n even no.

/*
int n = 5;
int sum = 0;
for(int i =0 ; i < n ;i ++)
 {
 sum = sum + (2*i);
}
       System.out.print("The sum of n even number is:");
       System.out.println(sum);

 */


//3.To print the table of n

/*
int n = 10;
for (int i=0 ; i <=10 ; i++){
    System.out.printf("%d X %d = %d \n",n,i,n*i);
}
*/


//4. For the Factorial

/*
int n = 4;
int fact = 1;
for(int i = 1;i <=n ; i++){
    fact *= i;
}
       System.out.println(fact);
 */
       //5.To print the sum of table 8

       int n = 8;
       int sum = 0;
       for (int i=0 ; i <=10 ; i++){
           sum = sum + (n*i);
       }
       System.out.print("The sum of table 8:");
       System.out.println(sum);
}
}
