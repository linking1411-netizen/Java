import java.util.Scanner;

public class bai10bt8 {
    public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Vui  lòng nhập tháng: ");
        int thang = sc.nextInt();
        if (thang < 1 || thang > 12){
            System.out.println("Tháng không hợp lệ! Vui lòng nhập lại");
        }
        else if (thang >= 1 && thang <=3){
            System.out.println("Tháng " +thang+ " thuộc quý 1");
        }
        else if (thang >= 4 && thang <=6){
            System.out.println("Tháng " +thang+ " thuộc quý 2");
        }
        else if (thang >= 7 && thang <=9){
            System.out.println("Tháng " +thang+ " thuộc quý 3");
        }
        else 
            System.out.println("Tháng " +thang+ " thuộc quý 4");
        
    }
}