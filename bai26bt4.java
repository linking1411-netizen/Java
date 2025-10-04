import java.util.Scanner;

public class bai26bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập mật khẩu với điều kiện:");
        System.out.println("- Có ít nhất 6 ký tự trở lên");
        System.out.println("- Chứa ít nhất một chữ cái và một số");
        int count = 0;
        while (true){
        System.out.print("Vui lòng nhập mật khẩu: ");
        
        String password = sc.nextLine();

        if (checkPassword(password)) {
            System.out.println("Đã cài đặt mật khẩu thành công!"); break;
        } else  { count++;
            System.out.println("(Sai lần " + count + ")Xin vui lòng nhập lại!");
        
        } if (count == 5){
            System.out.println("Nhập sai 5 lần, máy bạn bị khóa trong vòng 5 phút!"); break;   
        }
        

        
        }
    } 

    
    public static boolean checkPassword(String password) {
        if (password.length() < 6) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasLetter && hasDigit;
    } // <-- kết thúc checkPassword
} // <-- kết thúc class

        



