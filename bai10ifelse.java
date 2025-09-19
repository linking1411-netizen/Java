import java.util.Scanner;

public class bai10ifelse {
    public static void main (String[] args) {
       /*  Scanner sc = new Scanner(System.in);*/
        
        /*System.out.println("Mời nhập mật khẩu hiện tại của bạn: " );
        String a = sc.nextLine();
            if (a.equals("Binh1234")){
                System.out.println("Chào mừng bạn đến với Java");
            }
            else{
                System.out.println("Đăng nhập thất bại!");
            }*/


        /*System.out.println("Mời nhập điểm tb vào: ");
        Float a = sc.nextFloat();
        if (a>=8 && a<=10) {
            System.out.println("Bạn xếp loại giỏi");
        }   else if (a>=6 && a<8) {
            System.out.println("Bạn xếp loại khá");
        }   else {
            System.out.println("Bạn đã trượt");
        }*/
        
        /*System.out.println("Nhập tổng của hai số: " );
        float tong = sc.nextFloat();
        System.out.println("Nhập hiệu của hai số: " );
        float hieu = sc.nextFloat();
        
        float x=(tong + hieu)/2;
        float y=tong - x;

        System.out.println("X: " +x);
        System.out.println("Y: " +y);

        sc.close();*/

        /*System.out.println("Hãy nhập chiều cao(m) :");
        double a = sc.nextDouble();
        System.out.println("Hãy nhập cân nặng(kg) :");
        double b = sc.nextDouble();
        double bmi = b / (a * a);
        System.out.println("BMI của bạn là " +bmi);
        
        if (bmi<15) {
            System.out.println("Thân hình quá gầy");
        }
        else if  (bmi>=15 && bmi<16) {
            System.out.println("Thân hình gầy");
        }
         else if (bmi>=16 && bmi<18.5) {
            System.out.println("Thân hình hơi gầy");
        }
        else if  (bmi>=18.5 && bmi<25) {
            System.out.println("Thân hình bình thường");
        }
         else if (bmi>=25 && bmi<30) {
            System.out.println("Thân hình hơi béo");
        }
          else if (bmi>=25 && bmi<30) {
            System.out.println("Thân hình béo");
        }
        else {
            System.out.println("Thân hình quá béo");
        }
        sc.close();*/
         /*Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm dương lịch: ");
        int nam = sc.nextInt();
        boolean namnhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
        if (namnhuan) {
            System.out.println(nam + " là năm nhuận");
        } else {
            System.out.println(nam + " không phải là năm nhuận");
            sc.close();
        }*/
       /*  Scanner sc = new Scanner(System.in);
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
        sc.close();*/
        /*Scanner sc = new Scanner(System.in);
         System.out.println("Nhập a:");
        int a = sc.nextInt();
        System.out.println("Nhập b:");
        int b = sc.nextInt();
        System.out.println("Nhập c:");
        int c = sc.nextInt();
        double delta = (Math.pow(b,2) - 4*a*c);
        if (delta<0){
            System.out.println("Phương trình (1) vô nghiệm");
        }
        else if (delta ==0){
            double x= -(b/2*a);
            System.out.println("Phương trình (1) có nghiệm kép x1=x2 = "+x);
        }
        else if(delta>0){
            double x1 = (-b + (Math.sqrt(delta)))/(2*a);
            double x2 = (-b - (Math.sqrt(delta)))/(2*a);
            System.out.println("Phương trình (1) có 2 nghiệm phân biệt sau:" );
            System.out.println("x1= " +x1);
            System.out.println("x2= " + x2);
        }       */

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui  lòng nhập tháng: ");
        int thang = sc.nextInt();
        if (thang < 1 || thang > 12){
            System.out.println("Tháng không hợp lệ! Vui lòng nhập lại");
        }
        else if (thang >= 1 && thang <=3){
            System.out.println("Tháng " +thang+ " thuộc quý 1");
        }
        else if (thang >= 4 && thang <=6){
            System.out.println("Tháng " +thang+ " thuộc quý 2");
        }
        else if (thang >= 7 && thang <=9){
            System.out.println("Tháng " +thang+ " thuộc quý 3");
        }
        else 
            System.out.println("Tháng " +thang+ " thuộc quý 4");
        
    }
}