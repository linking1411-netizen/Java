import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
public class bai28bt5 {
    public static void main(String[]args){
            ArrayList<Integer>list = new ArrayList<>(List.of(1,9,3,14,5,27,8));
            Scanner sc = new Scanner (System.in);
            ArrayList<Integer>copy = new ArrayList<>(list);
            Collections.sort(copy);
            System.out.println("Chuỗi sau khi sx là: "+copy);
            int soLonThu2 = copy.get(copy.size()-2);
            int soNhoThu2 = copy.get(1);
            System.out.println("Số lớn thứ hai của chuỗi là: " +soLonThu2);          
            System.out.println("Số nhỏ thứ hai của chuỗi là: " +soNhoThu2);



    }
}