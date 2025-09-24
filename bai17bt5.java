import java.util.Scanner;
public class bai17bt5 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
    
        for (int n=1;n<=1000;n++){
        
        int tong=0;
       
        for (int i=1;i<n;i++){
            if (n%i==0)
            tong+=i;
        }
        if (tong==n)
        System.out.println(n+ " ");
    }
    }
}