import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the name of a city: ");
        String cityName = scanner.nextLine();

        // Convert the city name to lowercase for a case-insensitive check
        cityName = cityName.toLowerCase();

        // Check if the city name ends with "burg"
        boolean endsWithBurg = cityName.endsWith("burg");

        // Output the result
        System.out.println(endsWithBurg);

        scanner.close();


        }



}