interface Mycamera{
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

interface Mywifi{
   String[] networks();
   void getnetworks(String networks);
}

class MycellPhone{
    public void Name(String name){
        System.out.println("The name of the caller is " + name);
    }
   public void calling(int number){
       System.out.println("The number who is calling " + number);
   }
}

class MySmartphone extends MycellPhone implements Mycamera,Mywifi{
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

public class Default_method {
    public static void main(String[] args){
    MySmartphone sp = new MySmartphone();
    String[] ar = sp.networks();
    for (String item: ar){
        System.out.println("The networks in the list are " + item);
    }
    sp.getnetworks("hemant");
    sp.potrait();
    //sp.darkmode(); ---> Throws the error
    }
}
