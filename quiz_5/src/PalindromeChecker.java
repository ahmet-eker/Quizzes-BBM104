import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleanedInput.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}