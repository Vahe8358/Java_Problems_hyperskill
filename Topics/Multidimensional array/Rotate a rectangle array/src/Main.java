import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int[][] rotated = new int[m][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                rotated[col][n - row - 1] = matrix[row][col];
            }
        }

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(rotated[row][col] + " ");
            }
            System.out.println();
        }
    }
}
