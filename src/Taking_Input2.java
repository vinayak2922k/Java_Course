
import java.util.Scanner;
public class Taking_Input2 {
    public static void main(String[] args) {
        System.out.println("Taking inputs from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the Num2");
        int num2 = sc.nextInt();
        int Sum = num1 + num2;
        System.out.println("Here is the Sum :" + Sum);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
