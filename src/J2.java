import java.util.Random;
import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        char[][] board = new char[5][5];
        initializeBoard(board);
        System.out.println("All Set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        while (true) {
            System.out.print("Enter row (1-5): ");
            int row = getValidInput(scanner);
            System.out.print("Enter column (1-5): ");
            int column = getValidInput(scanner);

            if (row - 1 == targetRow && column - 1 == targetCol) {
                board[row - 1][column - 1] = 'x';
                printBoard(board);
                System.out.println("You have won!");
                break;
            } else {
                board[row - 1][column - 1] = '*';
                printBoard(board);
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        for (char[] row : board)
            for (int j = 0; j < row.length; j++)
                row[j] = '-';
    }

    public static int getValidInput(Scanner scanner) {
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5)
                    return input;
                else
                    System.out.print("Invalid input. Please enter a number between 1 and 5: ");
            } else {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < board[i].length; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
}
