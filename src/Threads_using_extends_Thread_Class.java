class Mythread1 extends Thread{
    @Override
    public void run(){
        int i = 1;
        while (i >= 40000) {
            System.out.println("I am the thread of the Mythread1");
            System.out.println("The Thread is running congrats");
            i++;
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (i <= 40000) {
            System.out.println("I am the thread of the Mythread2");
            System.out.println("The Thread is running.........");
            i++;
        }
    }
}

public class Threads_using_extends_Thread_Class {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();

        t1.start(); // Starts thread 1
        t2.start(); // Starts thread 2
    }
}
