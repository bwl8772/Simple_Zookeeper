import java.util.Scanner;

class SymmetricNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        String input = scanner.nextLine();

        if (isSymmetric(input)) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }

        scanner.close();
    }

    // Function to check if a four-digit number is symmetric
    public static boolean isSymmetric(String number) {
        if (number.length() != 4) {
            return false; // Not a four-digit number
        }

        return (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2));
    }
}
