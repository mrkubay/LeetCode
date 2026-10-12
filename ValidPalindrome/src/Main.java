public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(resultMethod("Hello world1234"));
        System.out.println(resultMethod("A man, a plan, a canal: Panama"));
        System.out.println(resultMethod("race a car"));
        System.out.println(resultMethod(""));
        System.out.println(resultMethod(" "));
    }

    private static boolean resultMethod(String input) {
        String onlySymbolsString = input.toLowerCase().replaceAll("[^a-zA-Z]", "");
        char[] charArray = onlySymbolsString.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}