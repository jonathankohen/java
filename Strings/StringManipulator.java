public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String newStr = str1.trim().concat(str2.trim());

        return newStr;
    }

    public Integer getIndexOrNull(String str, char x) {
        int result = str.indexOf(x);
        if (result == -1) {
            return null;
        }
        return result;
    }

    public Integer getIndexOrNull(String str1, String str2) {
        int result = str1.indexOf(str2);
        if (result == -1) {
            return null;
        }
        return result;
    }

    public String concatSubstring(String str1, int num1, int num2, String str2) {
        String result = str1.substring(num1, num2).concat(str2);
        return result;
    }
}
