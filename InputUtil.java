import java.util.Scanner;

public class InputUtil {
    
    public void welcome() {
        System.out.println("Welcome to TicTacToe!");
    }

    public void sayTurn(int turn) {
        if (turn == 0) {
            System.out.println("It is Player 1's turn!");
        }
        else {
            System.out.println("It is Player 2's turn!");
        }
    }

    public void playerWon(int player) {
        System.out.printf("Player %d has won!", player);
    }

    public int askForBoardSize() {
        Scanner reader = new Scanner(System.in);
        System.out.println("How big do you want the board to be?: ");
        int size = reader.nextInt();
        reader.close();
        return size;
    }

    public boolean playAgain() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Play again? (Y/N): ");
        boolean again = reader.nextBoolean();
        reader.close();
        return again;
    }
}
