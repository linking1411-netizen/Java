import java.util.Scanner;
public class bai14dowhile {
    public static void main(String[] args){
        int a = 6;
        int tong =0;
        do{ 
            tong+=a; 
            a++;
        }
        while (a<=5);
        System.out.println("Tổng là: "+tong);

    }
}