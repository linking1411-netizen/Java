import java.util.Scanner;

public class bai10bt6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một tháng bất kì: ");
        int thang = sc.nextInt();
        int soNgay = 0;
        if (thang < 1 || thang > 12){
            System.out.println("Tháng không hợp lệ! Xin mời nhập lại.");
        } else {
            switch (thang) {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                soNgay = 31;
                break;

                case 4:case 6:case 9:case 11:
                soNgay = 30;
                break;
            case 2:
            System.out.println("Nhập vào năm: ");
            int nam = sc.nextInt();
            boolean namnhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
            soNgay = namnhuan ? 29 : 28;
            }
        }
        System.out.println("Tháng " + thang + " có " + soNgay + " ngày");
        sc.close();       
    }
}