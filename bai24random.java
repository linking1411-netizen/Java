import java.util.Random;
public class bai24random {
    public static void main (String[]args){
        Random rd = new Random();
        int soNguyen = rd.nextInt(0,51);//chạy số nguyên
        System.out.println(soNguyen);

        double x = rd.nextDouble(100);// chạy số thực
        System.out.println(x);


    }
}