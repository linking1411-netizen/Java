import java.util.Scanner;
public class bai13while {
    public static void main(String[] args){
    
        /*int x =0;
        while (x<=5){
            System.out.println("x= " +x);
            x++;
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên từ 1-99: ");
        int n = sc.nextInt();
        while (n<1||n>99){
            System.out.println("Nhập lại số nguyên!");
            n = sc.nextInt();
        }
        System.out.println("Chúc mừng! Bạn đã nhập xong!");



    }
    }