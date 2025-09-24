import java.util.Scanner;
public class bai17bt6 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int a;
        System.out.println("Nhập vào một số nguyên: ");
        a = sc.nextInt();
        while (a<=0){
            System.out.println("Nhập lại a!");
        a= sc.nextInt();
        }
        System.out.println("Bạn đã nhập thành công! a của bạn là "+a);
        int demUoc=0;
        for (int i=1;i<=a;i++){
            if (a%i ==0)
            demUoc++;
        }
        if (demUoc==2)
        System.out.println(a+ " là số nguyên tố!");
        else
        System.out.println(a+ " không phải là số nguyên tố!");

    }
}