import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int cups = scanner.nextInt();           // number of peanut butter cups
        boolean isWeekend = scanner.nextBoolean();  // true if it's the weekend

        boolean isSuccessful;

        if (isWeekend) {
            // Weekend: 15–25 inclusive
            isSuccessful = cups >= 15 && cups <= 25;
        } else {
            // Weekday: 10–20 inclusive
            isSuccessful = cups >= 10 && cups <= 20;
        }

        System.out.println(isSuccessful);

    }
}