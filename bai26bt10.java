
public class bai26bt10 {
    public static void main (String[]args){     
        String input = " gÀ   LẠI   lậP    tRìNh";
        System.out.println(chuanHoa(input));
    }
    public static String chuanHoa (String input){
        input = input.trim();
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length;i++){
            words[i]=words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ",words);
    }
}