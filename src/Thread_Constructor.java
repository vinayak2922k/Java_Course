class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am running the thread");
    }
}

class Mythr2 implements Runnable {
    private String names; // Store the name here

    public Mythr2(String names) {
        this.names = names; // Assign the parameter to the instance variable
    }
    @Override
    public void run() {
        System.out.println("The Thread is running");
    }
}


    public class Thread_Constructor {

        //By extending the thread class

        public static void main(String args[]) {
            Mythr t1 = new Mythr("Vinayak");
            Mythr t2 = new Mythr("Golu");
            t1.start();
            t2.start();
            System.out.println("The ID of the thread t1 is " + t1.getId());
            System.out.println("The name of the Thread is " + t1.getName());
            System.out.println("The ID of the thread t2 is " + t2.getId());
            System.out.println("The name of the Thread is " + t2.getName());

            //By Implementing the Runnable
            Mythr2 bullet1 = new Mythr2("Sharma ji");
            Thread gun1 = new Thread(bullet1, "Sharma ji");
            gun1.start();
            System.out.println("The id of the Thread is " + gun1.getId());
            System.out.println("The name of the Thread is " + gun1.getName());
        }
    }
