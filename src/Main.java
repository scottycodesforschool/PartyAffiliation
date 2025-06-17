import java.util.Scanner; // goes top
public class Main {
    // Adding pseudocode here
        // class PartyAffiliation
        //	main ()
        //		String partyAffiliation = ""
        //		output "Enter your political party (D for Democrat, R for Republican, or I for Independent):"
        //		input partyAffiliation
        //		if partyAffiliation == "D" then
        //			output "You get a Democratic Donkey"
        //		else if PartyAffiliation == "R" then
        //			output "You get a Republican Elephant"
        //		else
        //			output "You get an Independent Man"
        //		endif
        //	return
        //EndClass
        // Now real code begins
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyChoice = ""; // Will store choice

        System.out.println("----------------------------------------"); // Using these dashes to make the output format look better
        System.out.println("          Party Affiliation           ");
        System.out.println("----------------------------------------");
        System.out.println("Enter your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Your choice (D, R, or I): "); // This just covers upper case as instructions didn't mention lower case

        // Reading input as string
        partyChoice = in.nextLine();

        // Using cascaded if structure as in lab instructions
        if (partyChoice.equals("D")) {
            System.out.println("\nYou get a Democratic Donkey.");
        } else if (partyChoice.equals("R")) {
            System.out.println("\nYou get a Republican Elephant.");
        } else if (partyChoice.equals("I")) {
            System.out.println("\nYou get an Independent Person.");
        } else {
            // Any other input (including all lower case choices) falls into "Other"
            System.out.println("\nYou get an Other.");
        }

        in.close(); // Close the scanner to prevent resource leaks
    }
}