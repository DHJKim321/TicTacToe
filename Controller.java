public class Controller {
    Model model;
    
    public void startGame() {
        InputUtil inputUtil = new InputUtil();
        View view = new View();

        inputUtil.welcome();

        int size = inputUtil.askForBoardSize();
        Model model = new Model(size);
        while (true) {
            view.drawBoard(model.getBoard());
            inputUtil.sayPlayerTurn(model.getCurrPlayer());
            inputUtil.sayTurn(model.getTurn());
            model.nextTurn();
        }
    }

}
