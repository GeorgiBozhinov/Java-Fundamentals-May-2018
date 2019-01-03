import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parentheses = scanner.nextLine().split("");

        if (parentheses.length % 2 != 0) {
            System.out.println("NO");
        } else {
            ArrayDeque<String> deque = new ArrayDeque<>();
            Collections.addAll(deque, parentheses);

            while (true) {
                if (deque.isEmpty()) {
                    break;
                }
                String first = deque.removeFirst();
                String second = deque.removeLast();

                if (!isValidParentheses(first + second)) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }

    public static boolean isValidParentheses(String parentheses) {
        return "{}".equals(parentheses) || "()".equals(parentheses) || "[]".equals(parentheses);
    }
}
