import java.util.Scanner;

public class bai25char{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một kí tự: ");
        String input = sc.nextLine();
        char ch4 = input.charAt(0);
        System.out.println("Kí tự vừa nhập là: "+ch4);


        System.out.println(Character.compare('b','b'));
        System.out.println(Character.compare('a','b'));
        System.out.println(Character.compare('A','a'));

        char ch5 ='1';
        char ch6 ='a';
        char ch7 ='A';
        char ch8 =' ';
        System.out.println(Character.isDigit(ch5));//Kiểm tra số
        System.out.println(Character.isLetter(ch6));//Kiểm tra kí tự
        System.out.println(Character.isLowerCase(ch6));//Kiểm tra chữ viết thường
        System.out.println(Character.isUpperCase(ch7));//Kiểm tra chữ viết hoa
        System.out.println(Character.isWhitespace(ch8));//Kiểm tra có trống không

    }
}
