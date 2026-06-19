import java.util.Scanner;

public class Nested_try {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index of the marks");
        int number = sc.nextInt();
        try {
            System.out.println("The try is can be used in nested try catch");
            try {
                System.out.println("Marks Index: " + marks[number]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error occured in the prgramme you input the higher index");
            }
            catch (Exception e) {
                System.out.println("Error occured !!");
            }
        }
        finally {
            System.out.println("end of the programme");
        }
    }
}
