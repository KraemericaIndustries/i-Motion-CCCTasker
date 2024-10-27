package read;

import java.util.Scanner;

public class Keyboard {

    public static String inbound() {

        String message;

        //  System.out.print("Turn # " + (Messages.reportNumber) + ".  Guess a 5 letter word: ");
        Scanner input = new Scanner(System.in);
        message = input.nextLine();
        message = message.toUpperCase();  //  Regardless of the case in the InputStream typed at the keyboard, convert the String contents of 'message' variable to UPPERCASE

        return message;
    }
}