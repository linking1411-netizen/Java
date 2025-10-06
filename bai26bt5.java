import java.util.Scanner;
public class bai26bt5{
    public static void main (String[]args){
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tin nhắn cần mã hóa: ");
        String input = sc.nextLine();
        String output ="";
        for (int i=0;i < input.length();i++){
            char c = input.charAt(i);
            int index = a.indexOf(c);
            if (index ==-1){
                output+=c;
            } else {
                output+=b.charAt(index);
            }
        }
        System.out.println("Tin nhắn sau mã hóa là: "+output);
    }
}