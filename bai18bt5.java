public class bai18bt5 {
    public static void main(String[] args) {
        for (int i=1;i<=7;i++) {
            for (int j = 1; j <= 7; j++) {
                if (i<=4 && j<=4 && i-j >= 0||i>=4 && j>=4 && i-j <= 0)
                    System.out.print(i + "" + j + "\t");
                else
                    System.out.print("" + "\t");
            }
            System.out.println("");
        }
    }
}
