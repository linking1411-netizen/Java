import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class bai28bt3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> quest = new ArrayList<>(List.of(
        "2 + 5 + 7 =",
        "5 * 10 =",
        "sqrt(16) =",
        "12 % 2 ="
        ));
        ArrayList<Float> traloi = new ArrayList<>(List.of(14f,50f,4f,6f));
        for (int i=0; i<quest.size();i++){
            System.out.println(quest.get(i));
            System.out.println("Nhập kết quả vào: ");
            Float kq = sc.nextFloat();
            if (kq.equals(traloi.get(i))){
            System.out.println("Chuẩn cmnr");
        } else {
            System.out.println("Chưa chính xác, đáp án chính là: "+traloi.get(i));
        }
        }
    }
}