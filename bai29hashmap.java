import java.util.HashMap;
import java.util.Scanner;
public class bai29hashmap{
    public static void main(String[]args){
        HashMap <String, String> users = new HashMap<>();
        users.put("binh1234","14112007");
        users.put("binh4321","14112007");
        users.put("binh1411","14112007");
        users.put("binh14","14112007");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập user name: ");
        String userName = sc.nextLine();
        System.out.println("Nhập password: ");
        String password = sc.nextLine();
        if (!users.containsKey(userName)){
            System.out.println("User không tồn tại");
        }   else if (!users.get(userName).equals(password)){
            System.out.println("Mật khẩu không chính xác");
        }   else {
            System.out.println("Đăng nhập thành công");
        }
    }
}