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

        //  EMPATHIZE with the client.  ESTABLISH Urgency..
        Messages.empathize();
        String URGENCY = Keyboard.inbound();
        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        System.out.println("URGENCY: " + URGENCY);
        // ToDo:
        // Separate IMPACT and BACKUP into their own vars and prompts
        //  println: confirm the make/model of the device you are calling about
        //  input make to var
        //  input model to var

        // ToDo:
        //  println/input: can I get your first and last name?
        //  > echo back as LASTNAME, FIRSTNAME
        //  > loop/verify if this is correct

        //  ToDo:
        // make sure the make and model concern string is split for length to NAVs threshold

        //  ToDo:
        // As you are needing 'things' - out them to a txt file on new lines for easier clipboard transfer
    }
}
