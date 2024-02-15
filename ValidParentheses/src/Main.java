import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 * 20. Valid Parentheses
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("({}[]{([{}])})"));
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("]"));
        System.out.println(isValid(""));
    }

    private static boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        LinkedList<Character> characters = new LinkedList<>();
        for (char character : s.toCharArray()) {
            if(isOpenSymbol(character, brackets)) {
                characters.add(character);
            } else if (isBackSymbol(character, brackets)) {
                if (!characters.isEmpty() && brackets.get(character).equals(characters.getLast())) {
                    characters.removeLast();
                } else {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }
    private static boolean isBackSymbol(Character character,Map<Character, Character> brackets) {
        return brackets.containsKey(character);
    }
    private static boolean isOpenSymbol(Character character, Map<Character, Character> brackets) {
       return brackets.containsValue(character);
    }
}