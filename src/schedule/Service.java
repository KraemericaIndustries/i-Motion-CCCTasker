package schedule;

import print.Messages;
import read.Keyboard;

public class Service {


//    public static void schoolBoard() {
//  ToDo:  Can Hank do it?  He is 'school board guy'
//        School > Board
//
//        if (customer == area school && area school belongs to wrdsb) {
//            if(assessment == y) {
//                USE CCard of school and generate SO
//            } else {
//                Use board customer card to generate SO
//                Shipping tab > ship-to code > start typing school name, and pre-populated will show up
//            }
//        }
//
//    }

    public static void newSO() {

        String greeting = """
            "Thank you for calling Motion in Kitchener.  This is Bob speaking, how can I help?"
            "What seems to be the issue today?"
            """;

        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        System.out.println(greeting);

        //  CAPTURE client concern...
        String CONCERN = Keyboard.inbound();
        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        System.out.println("CONCERN: " + CONCERN);

        //  ESTABLISH Impact...
//        Messages.empathize();
        System.out.println("I regret to hear of this predicament.  Can you help me to understand how this is impacting you?");
        String IMPACT = Keyboard.inbound();
        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        System.out.println("CONCERN: " + CONCERN);
        System.out.println("IMPACT: " + IMPACT);

        //  ESTABLISH Backup...
        System.out.println("Do you have an alternative available to you (another device so you can continue to get around?)");
        String BACKUP = Keyboard.inbound();
        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        System.out.println("CONCERN: " + CONCERN);
        System.out.println("IMPACT: " + IMPACT);
        System.out.println("BACKUP: " + BACKUP);

        //  ESTABLISH Urgency...
//        Messages.empathize();
        System.out.println("Is this situation URGENT?  If yes, please help me to understand why.");
        String URGENCY = Keyboard.inbound();
        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        System.out.println("CONCERN: " + CONCERN);
        System.out.println("IMPACT: " + IMPACT);
        System.out.println("BACKUP: " + BACKUP);
        System.out.println("URGENCY: " + URGENCY);

        //  ESTABLISH firstname...
        System.out.println("Can I confirm the spelling of your first name?");
        String FIRSTNAME = Keyboard.inbound();
        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        System.out.println("FIRSTNAME: " + FIRSTNAME);

        //  ESTABLISH lastname...
        System.out.println("Can I confirm the spelling of your last name?");
        String LASTNAME = Keyboard.inbound();
        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        System.out.println("CONCERN: " + CONCERN);
        System.out.println("IMPACT: " + IMPACT);
        System.out.println("BACKUP: " + BACKUP);
        System.out.println("URGENCY: " + URGENCY);
        System.out.println("FIRSTNAME: " + FIRSTNAME);
        System.out.println("LASTNAME: " + LASTNAME);


        // ToDo:
        //  println: confirm the make/model of the device you are calling about
        //  input make to var
        //  input model to var

        //  ToDo: Take your String vars, and create and pretty-print yet another treemap
        //  extract each block to a method with a String parameter for distinct console echos

        // ToDo:
        //  > loop/verify if this is correct
        // make sure the make and model concern string is split for length to NAVs threshold

        //  ToDo:
        // As you are needing 'things' - out them to a txt file on new lines for easier clipboard transfer
    }
}
