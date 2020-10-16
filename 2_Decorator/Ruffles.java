public class Ruffles extends OrnamentsDecorator {
    protected ChristmasTree christmasTree;

    public Ruffles(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + "Ruffles..\n";
    }

    public double cost() {
        return christmasTree.cost() + 1.00;
    }
}
