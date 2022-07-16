public class Controller {
    
    public void startGame() {
        InputUtil inputUtil = new InputUtil();
        View view = new View();

        inputUtil.welcome();

        int size = inputUtil.askForBoardSize();
        Model model = new Model(size, size);
        do {
            view.drawBoard(model.getBoard());
            inputUtil.sayTurn(model.getTurn());

            int row = inputUtil.askForRow();
            int col = inputUtil.askForCol();
            while (!model.isPlaceEmpty(row, col)) {
                inputUtil.placeTaken(row, col);
                row = inputUtil.askForRow();
                col = inputUtil.askForCol();
            }
            model.drawToken(row, col);

            boolean end = model.hasGameEnded();
            if (!end) {
                model.nextTurn();
            }
        } while (!model.hasGameEnded());

        view.drawBoard(model.getBoard());
        inputUtil.playerWon(model.getCurrPlayerInt());

        if (inputUtil.playAgain()) {
            startGame();
        }
        else {
            inputUtil.thank();
        }
    }

}
