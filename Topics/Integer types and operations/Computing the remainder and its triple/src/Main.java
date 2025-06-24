import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int temp = input%2;
        System.out.println(temp);
        int temp1 = temp*3;
        System.out.println(temp1);


        scanner.close();
    }
}