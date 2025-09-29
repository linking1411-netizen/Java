import java.util.Scanner;
public class bai20ham {
    public static void main(String[] args) {
        System.out.print("Nhập a: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("Nhập b: ");
        double b = new Scanner(System.in).nextDouble();
        System.out.print("Hãy lựa chọn dấu ( + - * / ) là: ");
        String choice = new Scanner(System.in).nextLine();
        double result=math(a,b,choice);
        System.out.println("Kết quả là "+result);
    }

    public static double math(double a, double b,String choice) {
        switch (choice) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b!=0)
                    return a / b;
                else
                    System.out.println("lỗi logic math");
            default:
                return 0;
        }
    }
}