class ThreadPriority extends Thread{
    public ThreadPriority(String name){
        super(name);
    }
    public void run(){
        while(true) {
            System.out.println("This is the priority Thread sequence " + getName());
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args){
        ThreadPriority t1 = new ThreadPriority("Vinayak...");
        ThreadPriority t2 = new ThreadPriority("Vinayak1");
        ThreadPriority t3 = new ThreadPriority("Vinayak2");
        ThreadPriority t4 = new ThreadPriority("Vinayak3");
        ThreadPriority t5 = new ThreadPriority("Vinayak4");
        ThreadPriority t6 = new ThreadPriority("Vinayak5 + Most important");

        //Setting the priority of the Thread
        //Max_Prior --> 10
        //Min_Prior --> 0
        //Avg_Prior --> 5

        t6.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(5);

        //Executing the thread
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
