import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0;
        int curTemp = scanner.nextInt();
        // Initialize maximum temperature observed
        while (!(curTemp>=100)){
            maxTemperature = curTemp;
            curTemp = scanner.nextInt();
        }

        // Add your while loop or do-while loop here to process input temperatures

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}