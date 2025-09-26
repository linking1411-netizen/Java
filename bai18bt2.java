public class bai18bt2 {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
        for (int j = 4; j >=1; j--) {
                if (i<j) {
                    System.out.print(" \t");  
                } else if (i == 3 && j == 2){
                    System.out.print(" \t"); 
                } else {
                    System.out.print("*\t");  
                }
            }
            System.out.println();  

    }
}
}
