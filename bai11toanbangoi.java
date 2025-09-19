import java.util.Scanner;

public class bai11toanbangoi {
    public static void main (String[] args) {
    System.out.println("Xin mời nhập điểm trung bình: ");
    Scanner sc = new Scanner (System.in);
        float d = sc.nextFloat();
        String diem_a = (d>=8)?"giỏi":(d>=6.5 && d<8)?"khá":(d<6.5 && d>=5)?"trung binh":"yếu";
        System.out.println("Điểm "+d+" của bạn thuộc loại "+diem_a);


    }
}