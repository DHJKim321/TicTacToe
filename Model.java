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

    public int getCurrPlayerInt() {
        if (this.turn % 2 == 0) {
            return 1;
        }
        else {
            return 2;
        }
    }
    
    public int getTurn() {
        return turn;
    }

    public void nextTurn() {
        this.turn++;
    }

    public void drawToken(int i, int j) {
        this.board[i][j] = getCurrPlayer();
    }

    public boolean isPlaceEmpty(int i, int j) {
        if (this.board[i][j].equals("-")) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isHorizontalConsec() {
        for (int i = 0; i < this.board.length; i++) {
            int counter = 0;
            for (int j = 0; j < this.board.length; j++) {
                if (this.board[i][j].equals(getCurrPlayer())) {
                    counter++;
                }
                if (counter == this.size) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isVerticalConsec() {
        for (int i = 0; i < this.board.length; i++) {
            int counter = 0;
            for (int j = 0; j < this.board.length; j++) {
                if (this.board[j][i].equals(getCurrPlayer())) {
                    counter++;
                }
                if (counter == this.size) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDiagConsec() {
        int counter = 0;
        for (int i = 0; i < this.board.length; i++) {
            if (this.board[i][i].equals(getCurrPlayer())) {
                counter++;
            }
            if (counter == this.size) {
                return true;
            }
        }
        counter = 0;
        for (int i = 0; i < this.board.length; i++) {
            if (this.board[i][this.board.length - 1 - i].equals(getCurrPlayer())) {
                counter++;
            }
            if (counter == this.size) {
                return true;
            }
        }
        return false;
    }

    public boolean hasGameEnded() {
        return isHorizontalConsec() || isVerticalConsec() || isDiagConsec();
    }
    
}