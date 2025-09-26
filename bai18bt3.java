public class bai18bt3 {
    public static void main (String[]args){
 for (int i=1; i<=7; i++){
            for (int j=1; j<=4; j++) {
                if (i==1 && (j>=2 && j<=4 )){
                    System.out.print("\t");
                } else if (i==2 && (j>=3 && j<=4)) {
                    System.out.print("\t");

                } else if (i==3 && j==4) {
                    System.out.print("\t");
                } else if (i==5 && j==1) {
                    System.out.print("\t");
                } else if (i==6 && (j>=1 && j<=2)) {
                    System.out.print("\t");
                } else if (i==7 && (j>=1 && j<=3)) {
                    System.out.print("\t");
                } else if (j==2 && (i>=3 && i<=4)) {
                    System.out.print("\t");
                } else if (j==3 && (i>=4 && i <=5)) {
                    System.out.print("\t");
                } else
                    System.out.print(i+""+j+"\t");
            }
            System.out.println("\t");
        }
    }
}