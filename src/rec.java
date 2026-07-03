import java.util.Scanner;

public class rec {
    public static void rec1(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("DSA");
        rec1(i+1,n);
    }

    public static void rec2(int i , int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        rec2(i-1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number !!");
        int n = sc.nextInt();
        rec1(1,n);
        rec2(n,n);
    }
}
