package interviulucian.problema;
import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find the minimum extra chocolates required
    static int solution(int A, int B) {
        int minExtraC = Integer.MAX_VALUE;

        // Iterate over possible values for d (B + Y)
        for (int d = B; d <= 2 * B; d++) {
            int Y = d - B;  // Calculate the extra chocolates for Drake

            // Check if (A + X) can be a multiple of (B + Y)
            if (A % d == 0) {
                // If A is already a multiple of d, no extra chocolates needed for Alex
                minExtraC = Math.min(minExtraC, Y);
            } else {
                int remainder = A % d;  // Calculate remainder when A is divided by d
                int X = d - remainder;  // Calculate the extra chocolates needed for Alex

                // Update the minimum extra chocolates needed
                minExtraC = Math.min(minExtraC, X + Y);
            }
        }

        return minExtraC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Call the solution function
        int result = solution(A, B);

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
