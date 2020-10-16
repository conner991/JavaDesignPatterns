public class Ribbons extends OrnamentsDecorator {
    protected ChristmasTree christmasTree;

    public Ribbons(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + "Ribbons..\n";
    }

    public double cost() {
        return christmasTree.cost() + 2.00;
    }
}
