import java.util.Scanner;

public class MineSweeper {
    private final int ROWS;
    private final int COLS;
    private final int[][] mines;
    private final char[][] board;
    private int minesCount;
    private boolean gameOver;

    public MineSweeper(int rows, int cols) {
        this.ROWS = rows;
        this.COLS = cols;
        this.mines = new int[ROWS][COLS];
        this.board = new char[ROWS][COLS];
        this.minesCount = ROWS * COLS / 4;
        this.gameOver = false;
    }

    public void initialize() {
        // Initialize the board with '-'
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = '-';
            }
        }
        // Place mines randomly
        int count = 0;
        while (count < minesCount) {
            int randRow = (int) (Math.random() * ROWS);
            int randCol = (int) (Math.random() * COLS);
            if (mines[randRow][randCol] == 0) {
                mines[randRow][randCol] = 1;
                count++;
            }
        }
    }

    public void printBoard() {
        System.out.println("===========================");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        initialize();
        printBoard();

        while (!gameOver) {
            System.out.print("Satır Giriniz : ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = scanner.nextInt();

            if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
                System.out.println("Geçersiz koordinatlar! Lütfen tekrar girin.");
                continue;
            }

            if (board[row][col] != '-') {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (mines[row][col] == 1) {
                System.out.println("Game Over!!");
                gameOver = true;
                revealMines();
            } else {
                int count = countAdjacentMines(row, col);
                board[row][col] = (char) (count + '0');
                if (count == 0) {
                    // If no adjacent mines, reveal neighbors
                    revealNeighbors(row, col);
                }
                printBoard();
                if (isGameWon()) {
                    System.out.println("Oyunu Kazandınız !");
                    gameOver = true;
                }
            }
        }
        scanner.close();
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < ROWS && j >= 0 && j < COLS && mines[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void revealNeighbors(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < ROWS && j >= 0 && j < COLS && board[i][j] == '-') {
                    int count = countAdjacentMines(i, j);
                    board[i][j] = (char) (count + '0');
                    if (count == 0) {
                        revealNeighbors(i, j);
                    }
                }
            }
        }
    }

    private void revealMines() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (mines[i][j] == 1) {
                    board[i][j] = '*';
                }
            }
        }
        printBoard();
    }

    private boolean isGameWon() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == '-' && mines[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MineSweeper game = new MineSweeper(3, 3);
        game.play();
    }
}