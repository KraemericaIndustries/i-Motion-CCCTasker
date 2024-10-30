package schedule;

import print.Messages;
import read.Keyboard;

import java.util.LinkedHashMap;

public class Service {

    static LinkedHashMap<String, String> callDetails = new LinkedHashMap<>();

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
//        System.out.println(greeting);

        //  CAPTURE client concern...
        gatherNeededInfo("CONCERN", greeting);

        //  ESTABLISH Impact...
        gatherNeededInfo("IMPACT", "I regret to hear of this predicament.  Can you help me to understand how this is impacting you?");

        //  ESTABLISH Backup...
        gatherNeededInfo("BACKUP", "Do you have an alternative available to you (another device so you can continue to get around?)");

        //  ESTABLISH Urgency...
        gatherNeededInfo("URGENCY", "Is this situation URGENT?  If yes, please help me to understand why.");

        //  ESTABLISH firstname...
        gatherNeededInfo("FIRSTNAME", "Can I confirm the spelling of your first name?");

        //  ESTABLISH lastname...
        gatherNeededInfo("LASTNAME", "Can I confirm the spelling of your last name?");

        // ToDo:
        //  > loop/verify if this is correct
        // make sure the make and model concern string is split for length to NAVs threshold

        // ToDo:
        //  println: confirm the make/model of the device you are calling about
        //  input make to var
        //  input model to var

        //  ToDo:
        // As you are needing 'things' - out them to a txt file on new lines for easier clipboard transfer
    }

    public static void gatherNeededInfo(String detail, String question) {

        System.out.println(question);
        String answer = Keyboard.inbound();
        Messages.clearConsoleWindow();  //  CLEAR the IDE console window
        callDetails.put(detail, answer);
        System.out.println(callDetails);

    }
}
