import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.*;


public class Advanced_Practise_Set {
    public static void main(String[] args){
         //Practise Ques 1
        ArrayList<String> std = new ArrayList<>();
        std.add("Ram");
        std.add("Shyam");
        std.add("Krishna");
        std.add("Balwan");
        std.add("Balram");
        std.add("Hanuman");
        std.add("Jagannath");
        std.add("Maa Durga");
        std.add("Shiv");
        std.add("Parvati");
        std.add("Ganesh");

        for (Object O:std){
            System.out.println(O);
        }

        //Practise que 2

        Date d = new Date();
        System.out.println("The time formate for question 2 is Hour:Minutes:Seconds");
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //Practise que 3

        Calendar cd = Calendar.getInstance();
        System.out.println(cd.get(Calendar.HOUR_OF_DAY) + ":"  + cd.get(Calendar.MINUTE) + ":" + cd.get(Calendar.SECOND));

        //Practise Que 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("H:m:s a");
        String Mydata = dt.format(df1);
        System.out.println(Mydata);

        //Practise que 5

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.add(8);

        for(Object os:hs) {
            System.out.println(os);
        }
    }
}
