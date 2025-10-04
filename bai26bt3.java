import java.util.Scanner;
public class bai26bt3{
    public static void main (String[]args){
         String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
        String[] parts = str1.split(" ");
        for (String pt: parts){
            System.out.println(pt);
            try{
                int num = Integer.parseInt(pt);
                sum+=num;
                count++;
            } catch ( NumberFormatException e){
            }
        }
        double tbc = (double) sum/count;
        System.out.println("Tổng các số trong chuỗi là: "+sum);
        System.out.println("Tổng trung bình cộng trong chuỗi là: "+tbc);


    }
}