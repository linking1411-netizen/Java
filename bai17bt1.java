import java.util.Scanner;
public class bai17bt1 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Xin mời nhập vào số nguyên: ");
        int n = sc.nextInt();
        int i = 1;
        int gt = 1;
        while (i<=n){
            gt=gt*i;
            i++;

        }
        System.out.println(n+"! =" +gt);
        



         
    }
}