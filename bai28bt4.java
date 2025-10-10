import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class bai28bt4{
    public static void main(String[]args){
        Random rd = new Random();
        ArrayList <Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử của list: "); 
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int ngauNhien = rd.nextInt(401);
            list.add(ngauNhien);
        }
        System.out.println("Danh sách ngẫu nhiên vừa được tạo là: "+list);
    int dem = 0;
    String vitri = " ";
    for(int i = 0 ; i <list.size(); i++){
        if (list.get(i)<80 ){
            dem++;
            vitri+=i+" ";
        }
    }
    if (dem == 0){
        System.out.println("Không có số bé hơn 80 trong danh sách");
    } else {
        System.out.println("Số lượng số nhỏ hơn 80 trong list là: "+dem);
        System.out.println("Vị trí index của các số đó là: "+vitri);
    }
}
}