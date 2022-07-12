import java.util.Scanner;

public class InputUtil {
    private static Scanner reader = new Scanner(System.in);
    
    public void welcome() {
        System.out.println("Welcome to TicTacToe!");
    }

    public void sayTurn(int turn) {
        if (turn % 2 == 0) {
            System.out.print("It is Player 1's turn!\n");
        }
        else {
            System.out.print("It is Player 2's turn!\n");
        }
    }

    public int askForBoardSize() {
        System.out.print("How big do you want the board to be?: ");
        int size = reader.nextInt();
        return size;
    }

    public int askForConsec() {
        System.out.print("How many consecutive pieces for a win?: ");
        int consec = reader.nextInt();
        return consec;
    }

    public int askForRow() {
        System.out.print("Input row number: ");
        int row = reader.nextInt();
        return row - 1;
    }

    public int askForCol() {
        System.out.print("Input column number: ");
        int col = reader.nextInt();
        return col - 1;
    }

    public void playerWon(int player) {
        System.out.printf("Player %d has won!\n", player);
    }

    public boolean playAgain() {
        System.out.print("Play again? (Y/N): ");
        boolean again = "Y".equals(reader.next());
        return again;
    }
}
