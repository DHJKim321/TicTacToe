import java.util.Scanner;

public class InputUtil {
    
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

    public void playerWon(int player) {
        System.out.printf("Player %d has won!\n", player);
    }

    public int askForBoardSize() {
        Scanner reader = new Scanner(System.in);
        System.out.print("How big do you want the board to be?: ");
        int size = reader.nextInt();
        reader.close();
        return size;
    }

    public int askForConsec() {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many consecutive pieces for a win?: ");
        int consec = reader.nextInt();
        reader.close();
        return consec;
    }

    public boolean playAgain() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Play again? (Y/N): ");
        boolean again = "Y".equals(reader.next());
        reader.close();
        return again;
    }
}
