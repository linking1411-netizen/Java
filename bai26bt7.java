import java.util.Scanner;
public class bai26bt7 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào chuỗi: ");
        String input = sc.nextLine();
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();
        for (int i=0;i<input.length();i++){
            char c = input.charAt(i);
        if (Character.isDigit(c)){
            so.append(c);
        } else if (Character.isLetter(c)){
            chuoi.append(c);
        }



        }
        System.out.println("Chuỗi kí tự: "+chuoi);
        System.out.println("Số kí tự: "+so);
    }
}