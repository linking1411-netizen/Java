import java.util.ArrayList;
import java.util.List;
public class bai28list {
    public static void main (String[]args){
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);
        ArrayList<Integer> lst4 = new ArrayList<>();
        lst4.add(7);
        lst4.add(8);
        lst4.add(9);
        System.out.println(lst4);
    }
}