import java.util.Scanner;

public class bai25char{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một kí tự: ");
        String input = sc.nextLine();
        char ch4 = input.charAt(0);
        System.out.println("Kí tự vừa nhập là: "+ch4);
    }
}
