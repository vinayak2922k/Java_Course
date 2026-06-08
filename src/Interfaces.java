interface bicycle{
    int a = 45;
     void brake(int decrement);
     void SpeedUp(int increment);
}

interface hornblow{
    void hornmovie();
    void hornmovie1();
}

class Avoncycle implements bicycle,hornblow{
    void horn(){
        System.out.println("peee peee poo poo");
    }
    public void brake(int decrement){
        System.out.println("brakes is applied !! " + decrement);
    }
    public void SpeedUp(int increment){
        System.out.println("Accelarator is applied !! " + increment);
    }
    public void hornmovie(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void hornmovie1(){
        System.out.println("Main hoon na po po po po");
    }
}

public class Interfaces {
    public static void main(String[] args){
        Avoncycle cycle = new Avoncycle();
        System.out.println("The AvonCycle is a upgraded version of the bicycle !!");
        // You can create properties in Interfaces
        cycle.brake(18);
        // cycle.a = 54; --> This cant be modified
        System.out.println(cycle.a);
        cycle.hornmovie();
        cycle.hornmovie1();
    }
}
