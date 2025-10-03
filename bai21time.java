import java.util.Calendar;
public class bai21time {
public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal);
    int nam =cal.get(Calendar.YEAR);
    int thang =cal.get(Calendar.MONTH);
    int ngay =cal.get(Calendar.DAY_OF_MONTH);
    System.out.println(nam);
    System.out.println(thang+1);
    System.out.println(ngay);
    //Đặt theo ngày sinh nhật
    cal.set(Calendar.YEAR,2007);
    cal.set(Calendar.MONTH,11);
    cal.set(Calendar.DAY_OF_MONTH,14);
     int namSinh =cal.get(Calendar.YEAR);
    int thangSinh =cal.get(Calendar.MONTH);
    int ngaySinh =cal.get(Calendar.DAY_OF_MONTH);
    System.out.println("Ngày tháng năm sinh là: "
    +ngaySinh+"/"
    +thangSinh+"/"
    +namSinh); 
}
}
