import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Replace with your desired value of n

        //System.out.println("Collatz sequence for n = " + n + ":");

        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                // If n is even, divide it by 2
                n /= 2;
            } else {
                // If n is odd, multiply it by 3 and add 1
                n = 3 * n + 1;
            }
        }
        // Print the final 1 in the sequence
        System.out.println(1);
    }
}