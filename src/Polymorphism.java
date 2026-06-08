interface Mycamera2{
    void recording();
    void recording4K();
    private void darkmode(){
        System.out.println("Clicking the picture in the dark mode camera !!");
    }
    default void potrait(){
        darkmode();
        System.out.println("Click the potrait picture");
    }
}

interface Mywifi2{
    String[] networks();
    void getnetworks(String networks);
}

class MycellPhone2{
    public void Name(String name){
        System.out.println("The name of the caller is " + name);
    }
    public void calling(int number){
        System.out.println("The number who is calling " + number);
    }
}

class MySmartphone2 extends MycellPhone2 implements Mycamera2,Mywifi2{
    public void recording(){
        System.out.println("The camera is started and recording begins");
    }
    public void recording4K(){
        System.out.println("The camera is recording in the 4k quality");
    }
    public String[] networks(){
        System.out.println("Getting the list of the networks");
        String [] networkList = {"Hemant","Avinash","Vedant"};
        return networkList;
    }
    public void getnetworks(String network){
        System.out.println("Connecting to " + network);
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // for accessing all the settings
        //MySmartphone2 SP = new MySmartphone2();

        //For accessing the camera only
        Mycamera2 cam2 = new MySmartphone2();
        cam2.recording4K();

        //For accessing the wifi only
        Mywifi2 wifi2 = new MySmartphone2();
        String[] ar = wifi2.networks();
        for(String item:ar){
            System.out.println("network names are " + item);
        }
        //wifi2.networks();
    }
}
