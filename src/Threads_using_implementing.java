class Mythread3 implements Runnable{
    @Override
    public void run(){
        int j = 0;
        while(j <= 40000){
            System.out.println("I am runnning the Thread");
            System.out.println("Thread 1................");
        j++;
        }
    }
}

class Mythread4 implements Runnable{
    @Override
    public void run(){
        int j = 1;
        while(j <= 40000){
            System.out.println("I am Jogging the Thread");
            System.out.println("Thread 2................");
            j++;
        }
    }
}

public class Threads_using_implementing {
    public static void main(String args[]){
        Mythread3 bullet1 = new Mythread3();
        Thread gun1 = new Thread(bullet1);
        Mythread4 bullet2 = new Mythread4();
        Thread gun2 = new Thread(bullet2);

        gun1.run();
        gun2.run();
    }
}
