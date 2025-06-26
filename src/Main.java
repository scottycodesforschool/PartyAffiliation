import java.util.Scanner; // goes top

public class Main {
    // Adding pseudocode here
    // class PartyAffiliation
    //  main ()
    //     String partyAffiliation = ""
    //     output "Enter your political party (D for Democrat, R for Republican, or I for Independent):"
    //     input partyAffiliation
    //       if partyAffiliation == "D" then
    //        output "You get a Democratic Donkey"
    //     else if PartyAffiliation == "R" then
    //        output "You get a Republican Elephant"
    //     else
    //        output "You get an Independent Man"
    //     endif
    //  return
    //EndClass
    // Now real code begins
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyChoice = ""; // Will store choice
        boolean validInput = false; // Flag to control the input loop
        String trash; // Use for invalid string input

        System.out.println("----------------------------------------"); // Using these dashes to make the output format look better
        System.out.println("          Party Affiliation           ");
        System.out.println("----------------------------------------");
        System.out.println("Enter your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        // --- Input Validation Loop for Party Affiliation ---
        do {
            System.out.print("Your choice (D, R, or I): ");
            partyChoice = in.nextLine().trim(); // Read input, remove whitespace

            // Check if the input matches 'D', 'R', or 'I' (case-insensitive)
            if (partyChoice.equalsIgnoreCase("D") ||
                    partyChoice.equalsIgnoreCase("R") ||
                    partyChoice.equalsIgnoreCase("I")) {
                validInput = true; // Input is valid, exit loop
            } else {
                System.out.println("Invalid input! You entered '" + partyChoice + "'. Please enter D, R, or I.");
                // validInput remains false, so loop continues
            }
        } while (!validInput); // Loop until valid input is received

        // --- Process Validated Party Choice ---
        System.out.println("\n--- Your Party ---");
        // Using cascaded if structure with equalsIgnoreCase for case-insensitivity
        if (partyChoice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyChoice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else { // It must be "I" because of the validation loop
            System.out.println("You get an Independent Person.");
        }
        System.out.println("------------------\n");

        in.close(); // Close the scanner to prevent resource leaks
    }
}r