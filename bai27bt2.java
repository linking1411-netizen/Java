import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class bai27bt2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Mời nhập vào số pt của mảng: ");
        int n = sc.nextInt();
        int[] M = new int[n];
        System.out.println(Arrays.toString(M));
        for (int i=0; i<n; i++){
            int ngauNhien = rd.nextInt(4);
            M[i] = ngauNhien;
        }
        System.out.println("Số mảng ngẫu nhiên vừa tạo ra là: ");
        System.out.println(Arrays.toString(M));
    }
}