import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_Game {
   static class GuesstTheNumber {
       private int comp_num;
       private int user_num;
       private int chances;

       GuesstTheNumber(){
           System.out.println("Welcome to number guess game: ");
           Random r=new Random();
           comp_num=r.nextInt(100);  // 0 to 99
           chances=0;

       }
       void user_input(int x){
           user_num=x;
       }
       void correct_number(){
           if(user_num>comp_num){
               System.out.println("you slected a big number: ");
               chances++;
           }
           else if(user_num<comp_num){
               System.out.println("you slected a small number: ");
               chances++;
           }
           else{
               System.out.println("you got it right!!!");
               chances++;
               System.out.println("nNo of chances you taken: "+chances);

           }
       }

   }

    public static void main(String[] args) {
        GuesstTheNumber Guess = new GuesstTheNumber();
        while (true){
         Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = Sc.nextInt();
            Guess.user_input(n);
            Guess.correct_number();
        }
    }
}