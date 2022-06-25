public class View {
    
    public void drawBoard(String[][] board) {
        String divider = "-".repeat(4 * board[0].length + 1);
        System.out.println(divider);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.print("|\n");
            System.out.print(divider);
            System.out.print("\n");
        }
    }

}
