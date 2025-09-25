public class bai18forlongnhau {
    public static void main (String[]args){
        for (int i=1;i<=7;i++){
            for (int j=1;j<=7;j++){
                System.out.println(i+ " " +j+ "\t");
            }
            System.out.println("");
        }
            System.out.println("");
            System.out.println("");
            System.out.println("");

              for (int i=1;i<=7;i++){
            for (int j=1;j<=7;j++){
                if (i==1||i==7||i==j)
                System.out.println(i+ " " +j+ "\t");
                else
                System.out.println(""+"\t");
            }
                


              System.out.println("");
            System.out.println("");
            System.out.println("");

              for (int i=1;i<=7;i++){
            for (int j=1;j<=7;j++){
                if (i==1||i==7||i==7||j==1){
                System.out.println(i+ " " +j+ "\t");
                else
                System.out.println(""+"\t");
            }

        }
              }
    }
}
}