public class this_super {
    static class base{
        public void met1(){
            System.out.println("Hi i am method 1");
        }
        public void met2(){
            System.out.println("Hi I am method 2 of class base");
        }
    }

    static class derived extends base{
        @Override
        public void met2(){
            System.out.println("Hi I am method 2 of class derived");
        }
        public void met3(){
            System.out.println("Method 3 of derived class");
        }
    }
    public static void main(String[] args){
        base b = new base();
        b.met2();

        derived d = new derived();
        d.met2();
    }
}
