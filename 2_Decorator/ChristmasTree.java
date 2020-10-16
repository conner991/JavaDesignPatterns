import java.util.*;

public abstract class ChristmasTree {
    // Fields
    public String description = "\nAdding Unknown Tree..\n";

    // Methods
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}