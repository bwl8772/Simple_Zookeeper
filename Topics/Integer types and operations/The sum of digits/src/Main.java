import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  //    System.out.print("Enter a three-digit integer (between 100 and 999): ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit integer.");
        } else {
            int hundredsDigit = number / 100;
            int remainingDigits = number % 100;
            int tensDigit = remainingDigits / 10;
            int unitsDigit = remainingDigits % 10;

            int sumOfDigits = hundredsDigit + tensDigit + unitsDigit;
            System.out.println(sumOfDigits);
       //   System.out.println("The sum of the digits is: " + sumOfDigits);
        }

        scanner.close();
    }
}



