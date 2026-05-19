import java.util.Scanner;
public class Percentage_Prog3 {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Student in 5 Subjects");
        int Maths = Sc.nextInt();
        int Science = Sc.nextInt();
        int SST = Sc.nextInt();
        int English = Sc.nextInt();
        int Hindi = Sc.nextInt();
        int Total_Marks = Maths + Science + SST + English + Hindi;
        float Percentage;
        Percentage = (Total_Marks / 500f) * 100;
        System.out.println("The Percentage Of the Student is " + Percentage);
    }
}
