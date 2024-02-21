import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char startParanthesis : expression.toCharArray()) {
            if (startParanthesis == '(' || startParanthesis == '[' || startParanthesis == '{') { //getting first paranthesis
                stack.push(startParanthesis);
            } else if (startParanthesis == ')' || startParanthesis == ']' || startParanthesis == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char finishParanthesis = stack.pop();
                if ((startParanthesis == ')' && finishParanthesis != '(') || (startParanthesis == ']' && finishParanthesis != '[') || (startParanthesis == '}' && finishParanthesis != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();  // its okey if it is empty
    }
}