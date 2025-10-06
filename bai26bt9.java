import java.util.Scanner;
public class bai26bt9{
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Xin mời nhập vào chuỗi: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String a = sb.toString();
        System.out.println(a);
        if (str.equalsIgnoreCase(a)){
        System.out.println("Đây là chuỗi panlyndrome.");
        } else {
        System.out.println("Đây không phải là chuỗi panlyndrome.");
        }
    }
}