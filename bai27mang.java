import java.util.Scanner;
import java.util.Arrays;

public class bai27mang{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số pt tối đa của mảng: ");
        int n = sc.nextInt();
        int[] M= new int[n];
        System.out.println("Số mảng pt "+M.length);
        for (int i=0;i<n;i++){
            System.out.println("M["+i+"]=");//Nhập số vào cho chuỗi (Tùy chọn pt)
            M[i]=sc.nextInt();  
        }
        System.out.println("Mảng được tạo ra là: ");
        System.out.println(Arrays.toString(M));

        //Chuỗi sx tăng theo số
        int[] mang8 = {8,9,11,15,4,7,3};
        Arrays.sort(mang8);
        System.out.println("Mảng sau khi sx tăng là: ");
        System.out.println(Arrays.toString(mang8));

        
        //Chuỗi sx giảm theo số
        int [] mang9 = {1,3,5,7,9,13,20,32};
        for (int i = 0, j = mang9.length - 1; i<j ; i++, j--) {
            int temp = mang9[i];
            mang9[i]= mang9[j];
            mang9[j] = temp;
        }
        System.out.println("Mảng sau khi sx đảo ngược là: ");
        System.out.println(Arrays.toString(mang9));





    }
}