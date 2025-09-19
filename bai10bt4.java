import java.util.Scanner;

public class bai10bt4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chiều cao(m) :");
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
        sc.close();
    }
}