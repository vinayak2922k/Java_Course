  abstract class parent2{
   public parent2() {
        System.out.println("Hi I am Constructor of the Abs Class");
    }
     public void Wish() {
         System.out.println("Good morning Vinayak Sharma");
     }
     abstract public void greet();
     abstract public void greet2();
}

class child extends parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

abstract class child2 extends parent2{
    public void sayGood(){
        System.out.println("Hi i am good");
    }
}

public class Abstract_Class {
    public static void main(String[] args){
       // parent2 p = new parent2();  // --->error
        //  child2 c2 = new child2(); //---->error
        child c1 = new child();
        c1.greet();
        c1.greet2();
        c1.Wish();
    }
}
