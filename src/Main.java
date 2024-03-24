public class Main {
    public static void main(String[] args) {
        int[][] sudoku = sudokuTabel();
        printSudoku(sudoku);
    }

    public static int[][] sudokuTabel() {
        int[][] tabel = {
                {4, 5, 0, 0, 0, 0},
                {3, 0, 0, 0, 0, 6},
                {0, 4, 0, 1, 0, 0},
                {0, 0, 1, 0, 5, 0},
                {2, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 2, 5}
        };
        return tabel;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println("------+-------");
            }
            for (int j = 0; j < sudoku[i].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}