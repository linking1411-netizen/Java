import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class bai22date {
    public static void main(String[] args) {
       
        Calendar cal = Calendar.getInstance();

        
        Date d = cal.getTime();

       
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");

       
        System.out.println("Thời gian hiện tại: " + dinhDang.format(d));

        
    }
}
