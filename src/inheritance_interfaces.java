interface sample{
    void met1();
    void met2();
}

interface MyChildSample extends sample{
    void met3();
    void met4();
}

class Child implements sample{
   public void met1(){
       System.out.println("Method 1");
   }
   public void met2(){
       System.out.println("Method 2");
   }
   public void met3(){
       System.out.println("Method 3");
   }
   public void met4(){
        System.out.println("Method 4");
   }
}

public class inheritance_interfaces {
    public static void main(String[] args) {
        Child cw = new Child();
        cw.met1();
        cw.met4();
    }
}
