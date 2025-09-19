import java.util.Scanner;

public class bai10bt2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập điểm tb vào: ");
        Float a = sc.nextFloat();
        if (a>=8 && a<=10) {
            System.out.println("Bạn xếp loại giỏi");
        }   else if (a>=6 && a<8) {
            System.out.println("Bạn xếp loại khá");
        }   else {
            System.out.println("Bạn đã trượt");
        }
    }
}