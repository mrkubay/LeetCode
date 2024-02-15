import java.util.Arrays;

/*
*
* https://leetcode.com/problems/longest-common-prefix/description/
* 14. Longest Common Prefix
* */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                stringBuilder.append(first.charAt(i));
            } else {
                break;
            }
        }

        return stringBuilder.toString();
    }

}