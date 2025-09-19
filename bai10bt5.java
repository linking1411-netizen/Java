import java.util.Scanner;

public class bai10bt5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm dương lịch: ");
        int nam = sc.nextInt();
        boolean namnhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
        if (namnhuan) {
            System.out.println(nam + " là năm nhuận");
        } else {
            System.out.println(nam + " không phải là năm nhuận");
            sc.close();
        }
    }
}