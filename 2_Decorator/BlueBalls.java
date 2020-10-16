public class BlueBalls extends OrnamentsDecorator {
    protected ChristmasTree christmasTree;

    public BlueBalls(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + "Blue Balls..\n";
    }

    public double cost() {
        return christmasTree.cost() + 2.00;
    }
}
