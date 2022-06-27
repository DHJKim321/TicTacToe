public class Controller {
    Model model;
    
    public void startGame() {
        InputUtil inputUtil = new InputUtil();
        View view = new View();

        inputUtil.welcome();

        int size = inputUtil.askForBoardSize();
        int consec = inputUtil.askForConsec();
        Model model = new Model(size, consec);
        while (true) {
            view.drawBoard(model.getBoard());
            inputUtil.sayTurn(model.getTurn());
            model.nextTurn();
        }
    }

}
