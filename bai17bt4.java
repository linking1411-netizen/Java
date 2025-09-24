import java.util.Scanner;
public class bai17bt4 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int m=1;
        int tong=0;
        for(int i=1;i<=10;i++){
            m=i*m;
            tong+=m;
            
        }
        System.out.println(m);
    
    }
}