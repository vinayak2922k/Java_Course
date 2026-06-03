public class Constructor_in_java {
    static class base {
        base() {
            System.out.println("Iam base class constructor");
        }

        base(int x) {
            System.out.println("I am Base class overloaded constructor of value x: " + x);
        }
    }

    static class derivedclass extends base {
        derivedclass() {
            System.out.println("I am derived class constructor");
        }

        derivedclass(int x, int y) {
            super(x);
            System.out.println("I am derived class overloaded constructor with the value of y as: " + y);
        }
    }

        static class childofderived extends derivedclass {
                childofderived(){
                    System.out.println("I am the child of the derived class");
                }
                childofderived(int x,int y,int z){
                    super(x,y);
                    System.out.println("I am childofderived class overloaded constuctor with the value of z is: " + z);
                }
            }
            public static void main(String[] args){
                //base b = new base();
                derivedclass d = new derivedclass();
                childofderived cd = new childofderived(4,5,6);
    }
}


