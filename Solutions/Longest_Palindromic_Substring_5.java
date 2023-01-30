package Solutions;

public class Longest_Palindromic_Substring_5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String max = "";
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length && max.length() <= chars.length / 2; i++) {
            sb.append(chars[i]);
            for (int j = i + 1; j < chars.length; j++) {
                sb.append(chars[j]);
                if (isPalindrome(sb)) {
                    if (sb.length() > max.length()) {
                        max = sb.toString();
                    }
                }
            }
            sb = new StringBuilder();
        }
        if (max.equalsIgnoreCase("")) {
            return String.valueOf(s.charAt(0));
        }
        return max;
    }


    public static boolean isPalindrome(StringBuilder s) {
        StringBuilder s1 = new StringBuilder(s);
        if (s.toString().equalsIgnoreCase(s1.reverse().toString())) {
            return true;
        }
        return false;
    }
}