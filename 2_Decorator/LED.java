public class LED extends OrnamentsDecorator {
    protected ChristmasTree christmasTree;

    public LED(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + "LEDs..\n";
    }

    public double cost() {
        return christmasTree.cost() + 10.00;
    }
}
