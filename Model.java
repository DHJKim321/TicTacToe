public class Model {
    
    private int size;
    private int turn = 0;
    private String[][] board;
    private final String P1 = "O";
    private final String P2 = "X";
    private int consec;

    public Model(int size, int consec) {
        this.size = size;
        this.board = new String[size][size];
        this.consec = consec;
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

    public void drawToken(int i, int j) {
        String token = getCurrPlayer();
        this.board[i][j] = token;
    }

    public boolean isHorizontalConsec() {
        for (int i = 0; i < this.board.length; i++) {
            int counter = 0;
            int j = 0;
            while (this.board[i][j].equals(getCurrPlayer())) {
                counter++;
                if (counter == this.consec) {
                    return true;
                }
            }
        }
        return false;
    }
    
}