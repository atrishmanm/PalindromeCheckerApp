import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();


        PalindromeStrategy1 strategy = new StackStrategy1();

        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns");

        scanner.close();
    }
}

interface PalindromeStrategy1 {
    boolean check(String input);
}

class StackStrategy1 implements PalindromeStrategy1 {
    @Override
    public boolean check(String input) {
        if (input == null || input.isEmpty()) return true;

        String normalized = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

