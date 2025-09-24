import java.util.Scanner;
public class bai17bt2 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int n;
        int tong = 0;
        System.out.println("Mời nhập số nguyên n: ");
            n = sc.nextInt();
            if (n%2 !=0){
                for (int i=1;i>=n;i+=2){
                    if (i==3)
                    continue;
                    else
                        tong+=i;
                }
                System.out.println("Tổng các số lẻ từ 1 đến "+n+ " = " +tong);
            }

    }
}