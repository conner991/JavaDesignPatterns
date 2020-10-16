public class SilverBalls extends OrnamentsDecorator {
    protected ChristmasTree christmasTree;

    public SilverBalls(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + "Silver Balls..\n";
    }

    public double cost() {
        return christmasTree.cost() + 3.00;
    }
}
