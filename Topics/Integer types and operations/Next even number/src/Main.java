import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input a number
//        System.out.println("Enter a number not greater than 10000: ");

        int number = scanner.nextInt();

        int nextEven;

        if (number % 2 == 0) {
            nextEven = number + 2;
        } else {
            nextEven = number + 1;
        }
        if (number <= 10000) {
//            System.out.println("The next even number following " + number + " is " + nextEven);
            System.out.println(nextEven);
        } else {

            System.out.println("Please enter a number not greater than 10000");
        }
    }
}