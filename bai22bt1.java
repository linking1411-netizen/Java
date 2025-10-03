import java.util.Calendar;
import java.util.Scanner;

public class bai22bt1 {
    public static void main(String[] args) {
        /*
         Viết chương trình nhập vào ngày, tháng, năm sinh.
         Cho biết số tuổi và in ra màn hình.
        */

        int day, month, year, tuoi;

        // Nhập liệu từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.print("Mời nhập vào ngày sinh: ");
        day = input.nextInt();

        System.out.print("Mời nhập vào tháng sinh: ");
        month = input.nextInt();

        System.out.print("Mời nhập vào năm sinh: ");
        year = input.nextInt();

        // Khởi tạo Calendar và set ngày tháng năm sinh
        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month - 1, day); // tháng tính từ 0 nên phải -1

        // Xuất ngày tháng năm sinh
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        int thangSinh = birthday.get(Calendar.MONTH) + 1; // cộng 1 để ra tháng thực tế
        int namSinh = birthday.get(Calendar.YEAR);

        System.out.println("Ngày sinh của bạn: " + ngaySinh + "/" + thangSinh + "/" + namSinh);

        // Tính tuổi hiện tại
        Calendar today = Calendar.getInstance();
        int namHienTai = today.get(Calendar.YEAR);
        tuoi = namHienTai - namSinh;

        System.out.println("Tuổi của bạn là: " + tuoi + " tuổi");

        input.close();
    }
}
