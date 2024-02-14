import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/*
https://leetcode.com/problems/roman-to-integer/
13. Roman to Integer
*/
public class RomanToInteger {
    public static void main(String[] args) {

        System.out.println(romanToInteger("MCMXCIV"));
    }

    private static int romanToInteger(String s) {
        Map<Character, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put('I',1);
        stringIntegerHashMap.put('V',5);
        stringIntegerHashMap.put('X',10);
        stringIntegerHashMap.put('L',50);
        stringIntegerHashMap.put('C',100);
        stringIntegerHashMap.put('D',500);
        stringIntegerHashMap.put('M',1000);

        int result = 0;
        for(int i = 0; i < s.length()-1; i++) {
            Integer currentValue = stringIntegerHashMap.get(s.charAt(i));
            Integer nextValue = stringIntegerHashMap.get(s.charAt(i+1));
            if (currentValue < nextValue) {
                result-=currentValue;
            } else {
                result += currentValue;
            }
        }
        result += stringIntegerHashMap.get(s.charAt(s.length()-1));
        return result;
    }


}