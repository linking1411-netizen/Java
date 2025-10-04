import java.util.Scanner;
public class bai26bt2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một chuỗi: ");
        String s = sc.nextLine();
        int demSo = 0;
        int demInthuong = 0;
        int demInhoa = 0;
        int demSpace = 0;
        for (int i = 0; i<s.length();i++){
        char c = s.charAt(i);
        if (Character.isLowerCase(c)){
            demInthuong++;
        } else if (Character.isUpperCase(c)){
            demInhoa++;
        } else if (Character.isDigit(c)){
            demSo++;
        } else if (Character.isWhitespace(c)){
            demSpace++;
        }
    }
        System.out.println("Số kí tự thường là: "+demInthuong);
        System.out.println("Số kí tự hoa là: "+demInhoa);
        System.out.println("Số là: "+demSo);
        System.out.println("Số dấu cách là: "+demSpace);
        

    }
}