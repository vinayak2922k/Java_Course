import java.util.Scanner;

class Myexpection extends Exception{
    @Override
    public String toString(){
        return "Enter the Correct age";
    }
    @Override
    public String getMessage(){
        return "Good Afternoon Welcome to swasthya setu";
    }
}


public class Exception_class {
public static void main(String args[]){
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age you want to check !");
    age = sc.nextInt();
            if(age < 18){
                try{
                    throw  new Myexpection();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    e.toString();
                }
                System.out.println("Verification is Finished");
            }
     }
}
