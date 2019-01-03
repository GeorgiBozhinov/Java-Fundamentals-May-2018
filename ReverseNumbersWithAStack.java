import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> deque = new ArrayDeque<>();
        Collections.addAll(deque, input);


        for (Iterator descItr = deque.descendingIterator(); descItr.hasNext(); ) {
            System.out.print(descItr.next());
            System.out.print(" ");

        }
    }
}
