import java.util.Scanner;
public class bai9_scanner {
    public static void main (String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập mật khẩu :");
        String mk1 = sc.nextLine();
        System.out.println("Mật khẩu của bạn là: " +mk1);
        System.out.println("Xin mời nhập tên của bạn:");
        String ten = sc.nextLine();
        System.out.println("Chào mừng " + ten + " đến với Java");*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy nhập số chiều dài(cm): " );
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Chiều dài hình chữ nhật là: " +a+"cm");

        System.out.println("Hãy nhập số chiều rộng(cm): " );
        float b = new Scanner(System.in).nextFloat();
        System.out.println("Chiều rộng hình chữ nhật là: " +b+"cm");

        double dt= a * b;
        double cv= (a + b) * 2;

        System.out.println("Diện tích là : " +dt+"cm");
        System.out.println("Chu vi là : " +cv+"cm");









    }
}