public class bai19xulingoaile{
    public static void main(String[]args){
        int a= 10;
        int b = 5;
        

        try {
            int c =a/b;
            System.out.println("c=" +c);
        }
        catch (Exception ex){
            System.out.println("Có lỗi rồi!");
            ex.printStackTrace();
        }
        System.out.println("Đoạn code phía sau");

    }
}