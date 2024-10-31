import read.Keyboard;
import schedule.Service;
import java.util.LinkedHashMap;
import java.util.Set;

public class Main {

    static LinkedHashMap<String, String> menuItems = new LinkedHashMap<>();

    public static void main(String[] args) {

        menuItems.put("1", "Schedule Service for an existing client.");
        menuItems.put("2", "Create a new client card.");
        menuItems.put("3", "Schedule School Board deliveries.");

        String greeting = """
                Welcome to the Motion Customer Care Specialist Task Simplifier
                \nWhat task are you trying to accomplish?:""";
        System.out.println();
        System.out.println(greeting);
        System.out.println();
        prettyPrintLinkedHashMap();
        System.out.println();
        System.out.println("Enter a number for the task at hand:");

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
    }

    private static void prettyPrintLinkedHashMap() {

        Set<String> keys = menuItems.keySet();

        // printing the elements of LinkedHashMap
        for (String key : keys) {
            System.out.println(key + ") " + menuItems.get(key));
        }
    }
}