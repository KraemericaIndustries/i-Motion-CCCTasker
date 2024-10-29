import print.Messages;
import read.Keyboard;
import schedule.Service;
//import schedule.Service;

import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {

        TreeMap<String, String> menuItems = new TreeMap<>();
        menuItems.put("1", "Schedule Service for an existing client.");
        menuItems.put("2", "Create a new client card.");
        menuItems.put("3", "Schedule School Board deliveries.");

        //  ToDo:  Menu print MUST happen from here, farm messages out to print.Messages
        //  PRINT original menu
        Messages.menu();

        System.out.println(menuItems);

        //  GET a selection
        String currentTask = Keyboard.inbound();

        //  SWITCH on currentTask
        switch(currentTask) {
            case "1":
                Service.newSO();
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
//        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
    }
}