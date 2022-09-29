import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> options = new ArrayList<>();
    Menu(ArrayList options)
    {
        this.options=options;
    }

    public String showMenu()
    {
        System.out.println("Type a number to choose.");
        System.out.println(options);
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        return choice;
    }
}
