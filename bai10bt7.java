 import java.util.Scanner;

public class bai10bt7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
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
            double x= -(b/(2*a));
            System.out.println("Phương trình (1) có nghiệm kép x1=x2 = "+x);
        }
        else if(delta>0){
            double x1 = (-b + (Math.sqrt(delta)))/(2*a);
            double x2 = (-b - (Math.sqrt(delta)))/(2*a);
            System.out.println("Phương trình (1) có 2 nghiệm phân biệt sau:" );
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }

    }
}