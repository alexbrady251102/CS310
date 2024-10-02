public class palindrome {
    public static void main(String[] args) {

        String str = "racecar", reverseStr = "";
        String str2 = "mauler", reverseStr2 = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }

        int str2Length = str2.length();

        for (int i = (str2Length - 1); i >=0; --i) {
            reverseStr2 = reverseStr2 + str.charAt(i);
        }

        if (str2.toLowerCase().equals(reverseStr2.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str2 + " is not a Palindrome String.");
        }
    }
}
