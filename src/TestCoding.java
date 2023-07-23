 public class TestCoding {
    public static void main(String[] args) {
        checkData("aabbbbcccd");
    }

    public static void checkData(String data){
        int dataLength = data.length();
        String[] check = data.split("(?<=(.))(?!\\1)");
        int longest = 0;
        String character = null;
        for (String str : check) {
            int strLength = str.length();
            if(strLength > longest){
                character = String.valueOf(str.charAt(0));
                longest = strLength;
            }
        }
        System.out.println(character);
    }
}
