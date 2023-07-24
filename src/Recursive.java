public class Recursive {
    public static void main(String[] args) {
        checkData("aaaabbccdddddddddddddeeeeeeeeee");
    }

    public static void checkData(String data){
        String[] array = data.split("(?<=(.))(?!\\1)");
        String longestArray = recArray(array, null, 0, 0);
        System.out.println(longestArray);
    }

    public static String recArray(String[] array, String character, int currentIndex, int longestArray){
        if (currentIndex >= array.length){
            return character;
        }else{
            int currentLength = array[currentIndex].length();
            if (currentLength > longestArray){
                character = String.valueOf(array[currentIndex].charAt(0));
                longestArray = currentLength;
            }
            return recArray(array, character, currentIndex + 1, longestArray);
        }
    }
}
