public class Inheritance {

    static class Base{
       public int x;

       public void setX(int x){
           System.out.println("Setting thr value of the x in base class !!");
           this.x = x;
       }

       public int getX(){
           return x;
        }

        Base(){
            System.out.println("Hi I am a constructor of Base Class");
        }
    }

    static class Derived extends Base{
        int y;

        public void setY(int y){
            System.out.println("Setting the value of y in derived class!!");
            this.y = y;
        }
        public int getY(){
            return y;
        }
        Derived(){
            System.out.println("Hi I am contructor of derived class");
        }
    }


    public static void main(String[] args){
        // creating an object of the base class
        Base b = new Base();
        b.setX(14);
        System.out.println("The value of the x is: " + b.getX());

        // creating the derived class
        Derived d = new Derived();
        d.setY(90);
        System.out.println("Setting the value of y is: " + d.getY());
    }
}
