public class Main {
    public static final int SIZE = 5;
    //public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';
    //public static int COUNT = 'O';

    public static void main(String[] args) {

        char[][] field = new char[][]{
                {'X', 'O', 'O', '-', 'O'},
                {'O', 'X', 'O', '-', 'O'},
                {'X', 'O', 'X', '-', '-'},
                {'-', 'X', 'O', 'X', 'O'},
                {'-', '-', 'O', 'O', 'X'}
        };
        if (isWin(field, CROSS)) {
            printField(field);
            System.out.println("Победили крестики!");
        } else {
            System.out.println("Никто не победил!");
        }

        char[][] field2 = new char[][]{
                {'X', 'O', 'O', '-', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'X', 'O', 'X', '-', '-'},
                {'-', 'X', 'O', 'X', 'O'},
                {'-', '-', 'O', 'O', 'X'}
        };
        printField(field2);
        if (isWin(field2, ZERO)) {
            System.out.println("Победили нолики!");
        } else {
            System.out.println("Никто не победил!");
        }

        char[][] field3 = new char[][]{
                {'X', 'O', 'O', '-', 'X'},
                {'O', '-', 'O', 'X', 'O'},
                {'X', 'O', 'X', '-', '-'},
                {'-', 'X', 'O', 'X', 'O'},
                {'X', '-', 'O', 'O', 'X'}
        };
        if (isWin(field3, CROSS)) {
            printField(field3);
            System.out.println("Победили крестики!");
        } else {
            System.out.println("Никто не победил!");
        }

        char[][] field4 = new char[][]{
                {'X', 'O', 'O', '-', 'O'},
                {'O', 'O', '-', '-', '-'},
                {'X', 'O', 'X', '-', '-'},
                {'-', 'O', 'O', 'X', 'O'},
                {'-', 'O', 'O', 'O', 'X'}
        };
        printField(field4);
        if (isWin(field4, ZERO)) {
            System.out.println("Победили нолики!");
        } else {
            System.out.println("Никто не победил!");
        }

        char[][] field5 = new char[][]{
                {'X', 'O', 'O', '-', 'O'},
                {'O', 'O', '-', '-', '-'},
                {'X', 'O', 'X', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-'}
        };
        printField(field5);
        if (isWin(field5, ZERO)) {
            System.out.println("Победили нолики!");
        } else {
            System.out.println("Никто не победил!");
        }

    }


    //МЕТОД
    public static boolean isWin(char[][] field, char player) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == player) {
                    count++;
                } else break;
            }
            if (count == SIZE) {
                return true;
            } else count = 0;
        }

        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (field[i][j] == player) {
                    count++;
                } else break;
            }
            if (count == SIZE) {
                return true;
            } else count = 0;
        }

        for (int i = SIZE; i > 0; i--) {
            if (field[i - 1][SIZE - i] == player) {
                count++;
            } else break;
        }
        if (count == SIZE) {
            return true;
        } else count = 0;

        for (int i = 0; i < SIZE; i++) {
            if (field[i][i] == player) {
                count++;
            } else break;
        }
        return count == SIZE;
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}