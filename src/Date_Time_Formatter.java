import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String MyDate1 = dt.format(df1);
        String MyDate2 = dt.format(df2);

        System.out.println(MyDate1);
        System.out.println(MyDate2);
    }
}
