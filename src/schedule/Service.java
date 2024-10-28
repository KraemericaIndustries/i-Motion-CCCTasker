package schedule;

import print.Messages;
import read.Keyboard;

public class Service {
    //  ToDo:  Can Hank do it?  He is 'school board guy'
    public static void schoolBoard() {

//        School > Board
//
//        if (customer == area school && area school belongs to wrdsb) {
//            if(assessment == y) {
//                USE CCard of school and generate SO
//            } else {
//                USe board customer card to generate SO
//                Shipping tab > ship-to code > start typing school name, and pre-populated will show up
//            }
//        }

    }

    public static void newSO() {
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
