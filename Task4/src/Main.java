import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("Start Game");
        actions.add("Resume Game");
        actions.add("Pause Game");
        actions.add("End Game");

        Menu mainMenu = new Menu(actions);
        String choise;
        choise = mainMenu.showMenu();
        String response = mainMenu.showMenu(); int convertedResponse = Integer.parseInt(response);
        doAction(convertedResponse);



    }
    public static void doAction(int action)
    {
        int gameOn=1;
        {
        switch(action)
            {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
            case 4:
                System.out.println("Ending game");
                gameOn = 0;
            break;
            }
        }
    }
}
