public class bai18bt1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= i; j++) {
                if (i == 3 && j == 2) {
                    System.out.print(" \t");  
                } else {
                    System.out.print("*\t");  
                }
            }
            System.out.println();  
        }
        System.out.println(); 
        System.out.println(); 
        System.out.println(); 
         for (int i = 4; i >=1; i--) {
        for (int j = 1; j <= i; j++) {
        if (i == 3 && j == 2) {
                    System.out.print(" \t");  
                } else {
                    System.out.print("*\t");  
                
        }
    }
    System.out.println();  
}
    }
}