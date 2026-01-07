import java.util.Stack;
//Find the Strings are balanced or not balanced "[({})]", "{(})"
public class Test9 {


        public static boolean isBalanced(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) return false;

                    char top = stack.pop();
                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            System.out.println(isBalanced("[({})]")); // true
            System.out.println(isBalanced("{(})"));   // false
        }
    }



