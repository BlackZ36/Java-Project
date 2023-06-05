import java.util.*;

public class matrixCalculator {
    private static final Scanner sc = new Scanner(System.in);

    public static int inputValue(int i, int j, int number) {
        int value;
        while (true) {
            try {
                value = sc.nextInt();
                return value;
            } catch (Exception e) {
                System.out.printf("invalid input - Re-enter Maxtrix%d[%d][%d]: ", number, i, j);
                sc.nextLine();
            }
        }
    }

    public static int[][] inputMatrix(int column, int row, int number) {
        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter Matrix%d[%d][%d]: ", number, i, j);
                matrix[i][j] = inputValue(i, j, number);
            }
        }

        return matrix;
    }

    public static void display(int[][] matrix, int column, int row) {
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.printf("[%d]", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static int inputColumn(int number) {

        while (true) {
            try {
                System.out.printf("Enter column for Matrix %d: ", number);
                int column = sc.nextInt();
                if (column < 1) {
                    throw new Exception();
                }
                return column;
            } catch (Exception e) {
                System.out.print("Invalid number of column. Re-");
                sc.nextLine();
            }
        }
    }

    public static int inputRow(int number) {
        while (true) {
            try {
                System.out.printf("Enter row for Matrix %d: ", number);
                int row = sc.nextInt();
                if (row < 1) {
                    throw new Exception();
                }
                return row;
            } catch (Exception e) {
                System.out.print("Invalid number of row. Re-");
                sc.nextLine();
            }
        }
    }

    public static void add() {
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixR;
        int number = 1;
        System.out.println("---------- Addition ----------");
        // enter column
        int columnA = inputColumn(number);
        // enter row
        int rowA = inputRow(number);
        // enter value for the matrix A
        matrixA = inputMatrix(columnA, rowA, number);
        // matrix 2
        number = 2;
        System.out.println("--------------");
        // enter column
        int columnB = inputColumn(number);
        // enter row
        int rowB = inputRow(number);
        // enter value for the matrix B
        matrixB = inputMatrix(columnB, rowB, number);

        if (rowA == rowB && columnA == columnB) {
            matrixR = new int[rowA][columnA];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    matrixR[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            System.out.println("----- Result -----");
            display(matrixA, columnA, rowA);
            System.out.println("+");
            display(matrixB, columnB, rowB);
            System.out.println("=");
            display(matrixR, columnB, rowB);
        } else
            System.out.println("-----> ADDITION FAILED. Column And Row Of The Both Matrix are NOT the same.");

    }

    public static void sub() {

        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixR;
        int number = 1;
        System.out.println("---------- Addition ----------");
        // enter column
        int columnA = inputColumn(number);
        // enter row
        int rowA = inputRow(number);
        // enter value for the matrix A
        matrixA = inputMatrix(columnA, rowA, number);
        // matrix 2
        number = 2;
        System.out.println("--------------");
        // enter column
        int columnB = inputColumn(number);
        // enter row
        int rowB = inputRow(number);
        // enter value for the matrix B
        matrixB = inputMatrix(columnB, rowB, number);

        if (rowA == rowB && columnA == columnB) {
            matrixR = new int[rowA][columnA];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    matrixR[i][j] = matrixA[i][j] - matrixB[i][j];
                }
            }
            System.out.println("----- Result -----");
            display(matrixA, columnA, rowA);
            System.out.println("-");
            display(matrixB, columnB, rowB);
            System.out.println("=");
            display(matrixR, columnB, rowB);
        } else
            System.out.println("-----> SUBTRACTION FAILED. Column And Row Of The Both Matrix are NOT the same.");

    }

    public static void multiply() {
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixR;
        int number = 1;
        System.out.println("---------- Addition ----------");
        // enter column
        int columnA = inputColumn(number);
        // enter row
        int rowA = inputRow(number);
        // enter value for the matrix A
        matrixA = inputMatrix(columnA, rowA, number);
        // matrix 2
        number = 2;
        System.out.println("--------------");
        // enter column
        int columnB = inputColumn(number);
        // enter row
        int rowB = inputRow(number);
        // enter value for the matrix B
        matrixB = inputMatrix(columnB, rowB, number);

        if (columnA == rowB) {
            matrixR = new int[rowA][columnB];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    for (int k = 0; k < columnA; k++) {
                        matrixR[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
            display(matrixA, columnA, rowA);
            System.out.println("*");
            display(matrixB, columnB, rowB);
            System.out.println("=");
            display(matrixR, columnB, rowA);
        } else
            System.out.println("MULTIPLYCATION FAILED. Matrix 1 column and Matrix 2 row are not the same.");

    }

}
