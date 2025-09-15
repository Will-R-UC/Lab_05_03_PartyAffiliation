import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        //        String partyAffiliation

        //        output "What is your party affiliation?"
        //        output "Democrat = D, Republican = R, Independent = I"
        //        input partyAffiliation
        //
        //        if partyAffiliation == "D" then
        //            output "Your logo is the Democratic Donkey."
        //        else if partyAffiliation == "R" then
        //            output "Your logo is the Republican Elephant."
        //        else if partyAffiliation == "I" then
        //            output "Your logo is the Independent Man."
        //        endIf

        String partyAffiliation = "";
        Scanner consoleIn = new Scanner(System.in);

        System.out.println("What is your party affiliation?");
        System.out.println("Democrat = D, Republican = R, Independent = I, Other = [Other input]");
        System.out.print("Party: ");

        partyAffiliation = consoleIn.nextLine();

        if(partyAffiliation.equalsIgnoreCase("D")) {
            System.out.println("Your logo is the Democratic Donkey.");
        } else if (partyAffiliation.equalsIgnoreCase("R")) {
            System.out.println("Your logo is the Republican Elephant.");
        } else if (partyAffiliation.equalsIgnoreCase("I")) {
            System.out.println("Your logo is the Independent Man.");
        } else {
            System.out.println("The logo for the " + partyAffiliation + " party is unknown to me.");
        }
    }
}