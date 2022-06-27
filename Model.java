public class Model {
    
    private int size;
    private int turn = 0;
    private String[][] board;
    private final String P1 = "O";
    private final String P2 = "X";

    public Model(int size) {
        this.size = size;
        this.board = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = "-";
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }

    public String getCurrPlayer() {
        if (this.turn % 2 == 0) {
            return P1;
        }
        else {
            return P2;
        }
    }
    
    public int getTurn() {
        return turn;
    }

    public void nextTurn() {
        this.turn++;
    }
    
}