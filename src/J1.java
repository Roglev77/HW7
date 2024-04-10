import java.util.Scanner;
import java.util.Random;

public class J1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків у двовимірному масиві: ");
        int rows = scanner.nextInt();

        System.out.print("Введіть кількість стовпців у двовимірному масиві: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        Random random = new Random();

        System.out.println("Двовимірний масив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(1001);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nОдновимірний масив з максимальними значеннями:");
        for (int i = 0; i < rows; i++) {
            int max = array[i][0];
            for (int j = 1; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
}