import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int hour = minutes/60;
        int minute = minutes%60;
        System.out.println(hour + " hours and " + minute + " minutes");


        scanner.close();
    }
}