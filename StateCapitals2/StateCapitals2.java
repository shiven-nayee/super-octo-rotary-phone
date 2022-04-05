import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StateCapitals2 {
    public static void main(String[] args) throws FileNotFoundException {
        // Total number of states and capitals
        int totalStates = 0;
        int totalCaptials = 0;
        // A map interface using a Hashmap Implementation
        Map<String, String> statesAndCapitals = new HashMap<String, String>();

        // New Scanner using external file as input
        Scanner file = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        String userInput;
        int menu = 0;

        // Seperate lines into States and capitals and store them.
        while (file.hasNextLine()) {
            String[] currentLine = file.nextLine().split("::");
            statesAndCapitals.put(currentLine[0], currentLine[1]);
        }

        // Return the states as set
        Set<String> states = statesAndCapitals.keySet();

        // Returns the Captials as a collection
        Collection<String> capitals = statesAndCapitals.values();

        // Test states
        for (String state : states) {
            // System.out.println(state);
            totalStates++;
        }

        for (String capital : capitals) {
            // System.out.println(capital);
            totalCaptials++;
        }

        // Total states
        System.out.println(totalStates + " States");

        // Total capitals
        System.out.println(totalCaptials + " Capitals");

        System.out.println("Choose a item (1) Play game, (0) Exit");
        menu = Integer.parseInt(input.nextLine());
        
        // Game
        // A map is randomly ordered, no advnaced randomization needed
        for (String s : states) {
            if (menu != 0) {
                String c = statesAndCapitals.get(s);
                System.out.println("What is the capital of " + s + "?");
                userInput = input.nextLine();
                
                // Compare the actual answer vs user answer
                if (c.equals(userInput)) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Incorrect");
                }

                // Check if user wants to play again
                System.out.println("Play again?");
                menu = Integer.parseInt(input.nextLine());
            }
        }
    }
}
