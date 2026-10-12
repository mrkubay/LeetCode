import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        result(new String[] {"eat","tea","tan","ate","nat","bat"}).forEach(System.out::print);
    }

    private static List<List<String>> result(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>(strs.length);
        for (String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (result.containsKey(key)) {
                result.get(key).add(s);
            } else {
                ArrayList<String> value = new ArrayList<>();
                value.add(s);
                result.put(key, value);
            }
        }
//        result.entrySet().stream().map(entry -> entry.getValue())
        return new ArrayList<>(result.values());
    }
}