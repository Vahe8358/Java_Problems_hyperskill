import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().replaceAll("\\s+","");
        String str2 = scanner.nextLine().replaceAll("\\s+","");
        System.out.println(str1.equals(str2));

        // start coding here
    }
}