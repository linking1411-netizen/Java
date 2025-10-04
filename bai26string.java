
public class bai26string {
    public static void main (String[]args){
        String s = "Tâm hồn tôi là một vườn hoa lá"+
                "\nVì một nụ cười mà rộn rã tiếng chim.";
            System.out.println(s);
        StringBuilder chuoi = new StringBuilder();
        chuoi.append("Xin chào, ");
        chuoi.append("mình mới học lập trình");
        System.out.println(chuoi);
        chuoi.insert(3," được");
        System.out.println(chuoi);
        chuoi.delete(2,7);
        System.out.println(chuoi);
        System.out.println(chuoi.length());    


    }
}