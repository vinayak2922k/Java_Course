class pract1 extends Thread{
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Error occured");
            }
            System.out.println("Good Morning Welcome to the World of Coding");
        }
    }
}

class pract2 extends Thread{
    public void run() {
        while (true) {
            System.out.println("Welcome to Coding world");
        }
    }
}

public class Practise_Set_Thread {
    public static void main(String[] args){
       pract1 p1 = new pract1();
       pract2 p2 = new pract2();
       p1.setPriority(10);
       p2.setPriority(5);
        System.out.println("The priority is " + p1.getPriority());
        System.out.println("The priority is " + p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
       // p1.start();
       // p2.start();
    }
}
