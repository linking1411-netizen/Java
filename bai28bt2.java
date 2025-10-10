import java.util.ArrayList;
import java.util.Scanner;
public class bai28bt2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử trong list: ");
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i<n;i++){
            System.out.println("Mời nhập vào phần tử thứ: "+(i+1));
            int soNhap = sc.nextInt();
            list.add(soNhap);

        }
        System.out.println(list);
        ArrayList<Integer> binhPhuong = new ArrayList<>();
        for (int x: list){
            binhPhuong.add(x*x);
        }
        System.out.println("Danh sách mới là: ");
        System.out.println(binhPhuong);
    }
}