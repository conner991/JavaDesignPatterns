
/* -----------------------------------------------------------------------------

FILE NAME:         
DESCRIPTION:       
USAGE:             
COMPILER:          
NOTES:             

MODIFICATION HISTORY:

Author             Date               Version
---------------    ----------         --------------
Conner Fissell    09-6-2020             1.0

----------------------------------------------------------------------------- */
import java.util.*; // Used for scanner object, array functions, lists, iterators...

public class BobsShopDriver {

    // Scanner object, allows user to input info from the keyboard
    static Scanner sc = new Scanner(System.in);

    /*
     * -----------------------------------------------------------------------------
     * FUNCTION: main() ....
     * -----------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        BobsShop RenoKiosk = new Kiosk();
        BobsShop RenoStore = new Store();

        System.out.println("\n\nWelcome to Bob's Shaved Ice Payment System");
        System.out.println("Is this a Kiosk or store sale?");
        System.out.println("Type 'k' for Kiosk");
        System.out.println("Type 's' for Store");
        System.out.print("Enter choice: ");

        if (sc.hasNextLine()) {

            String bobsChoice = sc.nextLine(); // Maybe do with a char? More efficient?

            if (bobsChoice.equals("k")) {
                System.out.println("You chose Kiosk payment\n\n");
                handleKiosk(RenoKiosk);
            } else if (bobsChoice.equals("s")) {
                System.out.println("You chose Store payment\n\n");
                handleStore(RenoStore);
            } else {
                System.out.println("Not a valid choice. Try again.\n\n");
                System.out.println(bobsChoice);
            }
        }
    }

    /*
     * -----------------------------------------------------------------------------
     * FUNCTION: handleKiosk() ....
     * -----------------------------------------------------------------------------
     */

    /*
     * -----------------------------------------------------------------------------
     * FUNCTION: handleKiosk() ....
     * -----------------------------------------------------------------------------
     */
    public static void handleKiosk(BobsShop RenoKiosk) {
        RenoKiosk.processOrder();
        RenoKiosk.processCashPayment();
    }

    /*
     * -----------------------------------------------------------------------------
     * FUNCTION: handleStore() ....
     * -----------------------------------------------------------------------------
     */
    public static void handleStore(BobsShop RenoStore) {
        RenoStore.processOrder();

        System.out.println("Card or cash payment?");
        System.out.print("Type 'card' or 'cash': ");
        String storeChoice = sc.nextLine();
        if (storeChoice.equals("card")) {
            RenoStore.processCardPayment();
        } else if (storeChoice.equals("cash")) {
            RenoStore.processCashPayment();
        } else {
            System.out.println("Invalid Choice, try again.\n\n");
        }
    }

}