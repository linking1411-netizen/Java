import java.util.Scanner;

public class bai18bt5phienban2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
       System.out.println("Nhập vào số n :");
       
       int n=sc.nextInt();
       
    
        int k=(n+1)/2;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                if(j>i&&i<k) System.out.print("\t");
                else if(i>k&&i>j) System.out.print("\t");
                else System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}