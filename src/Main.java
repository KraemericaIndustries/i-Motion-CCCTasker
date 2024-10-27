import print.Messages;
import read.Keyboard;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {

        TreeMap<String, String> menuItems = new TreeMap<>();
        menuItems.put("1", "Schedule Service for an existing client.");
        menuItems.put("2", "Create a new client card.");
        menuItems.put("3", "Schedule School Board deliveries.");

        //  PRINT original menu
        Messages.menu();

        System.out.println(menuItems);

        //  GET a selection
        String currentTask = Keyboard.inbound();

        //  SWITCH on currentTask
        switch(currentTask) {
            case "1":
                System.out.println("SWITCH1 - Schedule Service for an existing client.");
                break;
            case "2":
                System.out.println("SWITCH2 - Create a new client card.");
                break;
            case "3":
                System.out.println("SWITCH3 - Schedule School Board deliveries.");
                break;
            default:
                break;
        }


        //  ToDo: clear the screen (not working)
        //  https://www.javatpoint.com/how-to-clear-screen-in-java#Platform-Specific-Command
        //  Will canned cls work in compiled execution?
        //  CLEAR the IDE console window
        Messages.clearConsoleWindow();

        // ToDo:
        //  println/input: can I get your first and last name?
        //  > echo back as LASTNAME, FIRSTNAME
        //  > loop/verify if this is correct
        System.out.println("Thank you for calling Motion in Kitchener.  This is Bob speaking, how can I help?");

        // ToDo:
        //  println: save to var named concern
        System.out.println("What seems to be the issue today");
        String CONCERN = Keyboard.inbound();
        System.out.println(CONCERN);

        // ToDo:
        //  println: empathize - not apologize   to urgency var
        Messages.empathize();

        // ToDo:
        //  println: confirm the make/model of the device you are calling about
        //  input make to var
        //  input model to var

        //  ToDo:
        // make sure the make and model concern string is split for length to NAVs threshold

        //  ToDo:
        // As you are needing 'things' - out them to a txt file on new lines for easier clipboard transfer
    }




}