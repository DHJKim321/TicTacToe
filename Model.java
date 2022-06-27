public class Model {
    
    int size;
    int turn = 0;
    String[][] board = new String[size][size];
    final String player_1 = "O";
    final String player_2 = "X";

    public Model(int size) {
        this.size = size;
    }
    
    public int getTurn() {
        return turn;
    }
    
}