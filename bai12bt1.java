import java.util.Scanner;

public class bai12bt1 { 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bấm phím đã chọn: ");
        System.out.println("Bấm 1: Tìm theo tên ");
        System.out.println("Bấm 2: Tìm tác giả ");
        System.out.println("Bấm 3: Tìm nhà xuất bản ");
        System.out.println("Bấm 4: Tìm theo tiêu đề ");
        int so = sc.nextInt();
        switch(so){
            case 1:
            System.out.println("Tìm theo tên");
            break;
            case 2:
            System.out.println("Tìm tác giả");
            break;
            case 3:
            System.out.println("Tìm nhà xuất bản");
            break;
            case 4:
            System.out.println("Tìm theo tiêu đề");
            break;
            default:
            System.out.println("Phím bấm không hợp lệ!");
            break;

        }
    }
}