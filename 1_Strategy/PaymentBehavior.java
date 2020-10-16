import java.util.*;

public interface PaymentBehavior {

    // Scanner object, allows user to input info from the keyboard
    static Scanner sc = new Scanner(System.in);

    String payment();
}
