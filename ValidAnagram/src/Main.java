//https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(result("anagram", "nagaram"));
        System.out.println(result("car", "rat"));
        System.out.println(result("listen", "silent"));
        System.out.println(result("earth", "heart"));
        System.out.println(result("aacc", "ccac"));
    }

    private static boolean result(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        if (sCharArray.length != t.toCharArray().length) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>(sCharArray.length);
        HashMap<Character, Integer> tMap = new HashMap<>(t.toCharArray().length);

        for (int i = 0; i < sCharArray.length; i++) {
            if (sMap.containsKey(sCharArray[i])) {
                sMap.put(sCharArray[i], sMap.get(sCharArray[i]) + 1);
            } else {
                sMap.put(sCharArray[i], 1);
            }
        }
        for (int i = 0; i < tCharArray.length; i++) {
            if (tMap.containsKey(tCharArray[i])) {
                tMap.put(tCharArray[i], tMap.get(tCharArray[i]) + 1);
            } else {
                tMap.put(tCharArray[i], 1);
            }
        }
        return tMap.equals(sMap);
    }
}