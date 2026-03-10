import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: "); // Helpful prompt
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (normalized.isEmpty()) return true;

        int n = normalized.length();
        for (int i = 0; i < n / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}