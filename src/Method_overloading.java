public class Method_overloading {
    static void telljoke(){
        System.out.print("Why did the coffee file a police report? \n It got mugged!");
    }

     static int change(int x){
        x =98;
        return x;
     }

     static int change2(int[] marks){
        marks[0] = 98;
        return marks[0];
     }

     static void message(){
         System.out.println("Hey Welcome Vinayak Sharma to the MNC's");
     }

     static void message(int a){
         System.out.println("The salary credited in your Account :" + a);
     }

     static void message(int a , int b){
         System.out.println("Congratulations!! you are promoted to SWE || Your EmpID:" + a +
                 ". You Are new chief executive your ID: " + b);

     }


   public static void main() {
        /*
        telljoke();
        // case 1. changing the integer;
        int a = 45;
        change(a);
       System.out.println("The value of the C is: " + a);

       //case 2. changing the array;
       //here it changes because we pass the array as a refrences so that we can apply the changes in it..
       int [] marks = {10,20,30,40,50};
       change2(marks);
       System.out.println("The marks at the index at o is: " + marks[0]);
         */


       // METHOD OVERLOADING

       message();
       message(700000);
       message(2922,12);
   }
}
