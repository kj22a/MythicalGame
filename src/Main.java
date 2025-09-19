import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, to the Historic Battle Simulator");
        System.out.println("The year is 1250. Kingdoms rise and empires clash. You have been chosen to lead your people to glory.");
        System.out.println();
        System.out.println("Choose you civilisation:");
        System.out.println("For Mongols type the letter M");
        System.out.println("For Britons type the letter B");
        System.out.println("For Ummayad type the letter U");
        System.out.println("For Aztecs type the letter A");
        System.out.print("Your choice: ");
        char civ = scanner.next().charAt(0);
        System.out.print("\nChoose the difficulty level of the campaign (1 to 20): ");
        int level = scanner.nextInt();
        System.out.println("\nYou command 1000 warriors. Distribute them wisely between:");
        System.out.println(" Cavalry, Archers, Mages and Halberdiers");
        System.out.print("How many Cavalry do you want: ");
        int cavVal = scanner.nextInt();
        System.out.print("How many Archers do you want: ");
        int arcVal = scanner.nextInt();
        System.out.print("How many Mages do you want (NOTE: the remainder will go to Halberdiers): ");
        int magVal = scanner.nextInt();

        scanner.close();


        if (cavVal + arcVal + magVal > 1000) {
            System.out.println("Too many warriors selected, try again");
        } else if (level > 20 || level < 1) {
            System.out.println("Incorrect level selected, try again");
        }

        else {
            int halVal = 1000 - (cavVal + arcVal + magVal);
            System.out.println("\n Your army is ready!");
            System.out.println("Cavalry: " + cavVal);
            System.out.println("Archers: " + arcVal);
            System.out.println("Mages: " + magVal);
            System.out.println("Halberdiers: " + halVal);
            System.out.println("\nNow march forth to invade the enemy kingdom, may your banner fly high in victory!");

            String outcome = new Simulator(magVal, arcVal, halVal, cavVal, civ, level).run();
            System.out.println(outcome);
        }



    }
}