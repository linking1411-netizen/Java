import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class bai28bt1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử: ");
        int n = sc.nextInt();
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =  0; i<n;i++){
            int ngauNhien = rd.nextInt(1,101);
            list.add(ngauNhien);
        }
        System.out.println(list);
    }
}