public class Controller {
    Model model;
    
    public void startGame() {
        InputUtil inputUtil = new InputUtil();
        inputUtil.welcome();
        int size = inputUtil.askForBoardSize();
        Model model = new Model(size);
    }

}
