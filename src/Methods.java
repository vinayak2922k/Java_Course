public class Methods {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = (x-y)*8;
        }
        else {
            z = (x+y)*8;
        }
        x = 5555; // copy hai ye value change nahi karega a ki
        return z;
    }
   public static void main() {
        int a = 10;
        int b = 15;
        Methods Calc = new Methods();

        //method innvocation
        int c ;
        c= Calc.logic(a,b);
      //  c = logic(a,b);

        int a1 = 12;
        int b1 = 18;
        int c1;
        //c1 = Calc.logic(a1,b1);
        c1 = logic(a1,b1);
       System.out.println(c);
       System.out.println(c1);
    }
}
