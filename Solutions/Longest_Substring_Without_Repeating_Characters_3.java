package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("dvdf"));
    }

    public static Integer lengthOfLongestSubstring(String s) {
        int max = 0;
        int res = 0;
        List<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (list.contains(chars[i])) {
                if (res < max) {
                    res = max;
                }
                i = i - max + 1;
                max = 1;
                list.clear();
            } else {
                max++;
            }
            if (i == chars.length - 1 && res < max) {
                res = max;
            }
            list.add(chars[i]);
        }
        return res;
    }
}