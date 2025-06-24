import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the entire line and split into words
        String[] words = scanner.nextLine().split(" ");

        boolean inOrder = true;

        // Compare each word with the next one
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i + 1]) > 0) {
                inOrder = false;
                break;
            }
        }

        // Output result
        System.out.println(inOrder);
    }
}