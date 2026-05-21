import java.util.Scanner;
public class elseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the experience of the employee");
        int Job_Experience = sc.nextInt();

        switch (Job_Experience){
            case 5:
                System.out.println("Little Experience");
                break;
            case 10:
                System.out.println("Experienced");
                break;
            case 15:
                System.out.println("Experienced for Manager post");
                break;
        }



        /*
        if (Job_Experience > 5) {
            System.out.println("Experienced");
        }
        else if (Job_Experience > 10) {
                System.out.println("Eligible for Manager Post");
            } else if (Job_Experience > 15) {
                System.out.println("Ready for the retirement");
            } else {
                System.out.println("You are fresher");
            } */

        }
    }

