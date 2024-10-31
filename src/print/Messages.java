package print;

import com.sun.tools.javac.Main;

public class Messages {

    public static void clearConsoleWindow() {
        for(int i = 0; i < 20; i++) System.out.println("\n");  //  CLEAR the IDE console window
    }

    public static void empathize() {
        String empathy_script = """
                \nI regret to hear of this predicament.
                Can you help me to understand how this is impacting you?
                Do you have a back-up device you can utilize in the meantime?
                Is the situation urgent?
                    If it is, please help me to understand why.
                """;
        System.out.println(empathy_script);
    }
}