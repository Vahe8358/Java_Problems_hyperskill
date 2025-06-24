import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i+1]){
                isAscending = false;
                break;
            }
        }

        System.out.println(isAscending);

        scanner.close();
        // put your code here
    }
}