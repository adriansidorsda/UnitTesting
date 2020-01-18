public class StringUtils {
   public String changeToUpperCase(String str) {
       return str.toUpperCase();
   }

    public String reverseString(String str) {
      char[] array = str.toCharArray();
        char buffor;
        int arrayLength = array.length;

        for (int i = 0; i < array.length/2; i++) {
            buffor = array[i];
            array[i] = array[arrayLength - 1];
            array[arrayLength - 1] = buffor;
            arrayLength--;
        }

        return new String(array);
    }


    public String multpileString(String string, int howManyTimes) {
        String result = "";

        for (int i = 0; i < howManyTimes; i++) {
            result = result + string;
        }

        return result;

    }

    public int countCharInString(String str, char letter) {
      char[] chars = str.toCharArray();
      int result = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == letter) {
                result++;
            }
        }

        return result;
    }


}
