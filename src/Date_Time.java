
public class Date_Time {
    public static void main(String args[]){
        System.out.println("Number of years passed since 1970 is: " + System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("Number of Months passed since 1970 is: " + System.currentTimeMillis()/1000/3600/24/30);
        System.out.println("Hours passed since 1970 is: "+ System.currentTimeMillis()/1000/3600/24);
        System.out.println("Minutes passed since 1970 is: "+ System.currentTimeMillis()/1000/3600);
        System.out.println("Seconds passed since 1970 is: "+ System.currentTimeMillis()/1000);
    }
}
