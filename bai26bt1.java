public class bai26bt1{
    public static void main (String[]args){
        String s1 = "abcdefghjklwqo123@";
        char[] mang2 = s1.toCharArray();
        for (int i=0;i<mang2.length;i++){
            System.out.println(mang2[i]);
        }
        String s2 = "123456789 nồuB";
        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();
        String s3 = sb.toString();
        System.out.println(s3);


    }
}