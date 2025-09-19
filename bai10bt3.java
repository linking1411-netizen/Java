import java.util.Scanner;

public class bai10bt3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tổng của hai số: " );
        float tong = sc.nextFloat();
        System.out.println("Nhập hiệu của hai số: " );
        float hieu = sc.nextFloat();
        
        float x=(tong + hieu)/2;
        float y=tong - x;

        System.out.println("X: " +x);
        System.out.println("Y: " +y);

        sc.close();
    }
}