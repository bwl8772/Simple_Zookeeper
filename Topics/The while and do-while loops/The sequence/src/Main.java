import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxDivisibleBy4 = 0;

        while (n > 0) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > maxDivisibleBy4) {
                maxDivisibleBy4 = number;
            }
            n--;
        }

        System.out.println(maxDivisibleBy4);
    }
}