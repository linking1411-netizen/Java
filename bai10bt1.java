import java.util.Scanner;

public class bai10bt1 {
    public static void main (String[] args) {
  Scanner sc = new Scanner(System.in);
        
        System.out.println("Mời nhập mật khẩu hiện tại của bạn: " );
        String a = sc.nextLine();
            if (a.equals("Binh1234")){
                System.out.println("Chào mừng bạn đến với Java");
            }
            else{
                System.out.println("Đăng nhập thất bại!");
            }
        }
    }

