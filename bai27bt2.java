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
            int ngauNhien = rd.nextInt(5);
            M[i] = ngauNhien;
        }
        System.out.println("Số mảng ngẫu nhiên vừa tạo ra là: ");
        System.out.println(Arrays.toString(M));

        for (int i = 0, j = n-1; i<j; i++, j--){
            int temp = M[i];
            M[i] = M[j];
            M[j] = temp;
        }
            System.out.println("Mảng sau khi đổi là: ");
            System.out.println(Arrays.toString(M));

            Arrays.sort(M);
            System.out.println("Mảng sx theo thứ tự tăng dần  là: ");
            System.out.println(Arrays.toString(M));


            int tong=0;
            for (int pt: M){
                tong+=pt;
            }
            System.out.println("Tổng các số pt trong mảng là: "+tong);

            System.out.println("Xin mời nhập vào một số: ");
            int so = sc.nextInt();
            boolean ktra = false;
    }
}