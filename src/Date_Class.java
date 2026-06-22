import java.util.Date;

public class Date_Class {
    public static void main(String args[]){

        //Quick Quiz
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());


        //Date Class
        Date d = new Date();
        System.out.println("The Current date and time is: " + d);
        System.out.println(d.getYear());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getClass());
        System.out.println(d.getTime());
        System.out.println(d.getTimezoneOffset());
    }
}
