public class Lights extends OrnamentsDecorator {
    protected ChristmasTree christmasTree;

    public Lights(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + "Lights..\n";
    }

    public double cost() {
        return christmasTree.cost() + 5.00;
    }
}
