import java.util.Scanner; // 3.1 Import necessary library

public class Main { // 3.6 Always use 'Main' as class name

    // 3.0 No method main code here, user write their own

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long fac = 1;
        // TODO: 1. Ask user for an integer 'n' using scanner.nextInt()
        if (num<2) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= num; i++) {
                fac*=i;
            }
            System.out.println(fac);
        }

        // TODO: 2. Print the factorial of 'n'

        scanner.close(); // Always close the scanner when done
    }

}