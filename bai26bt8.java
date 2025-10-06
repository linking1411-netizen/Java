
public class bai26bt8 {
    public static void main(String[]args){
        String path = "D:/galailaptring/music/remix.mp3";
        int lastSlashIndex = path.lastIndexOf('/');
        System.out.println(lastSlashIndex);
        String fileName = path.substring(lastSlashIndex+1);
        System.out.println(fileName);
        int lastDotIndex = fileName.lastIndexOf('.');
        String nameOnly = fileName.substring(0,lastDotIndex);
        System.out.println(nameOnly);




    }
}