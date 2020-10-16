public class RedBalls extends OrnamentsDecorator {
    protected ChristmasTree christmasTree;

    public RedBalls(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + "Red Balls..\n";
    }

    public double cost() {
        return christmasTree.cost() + 1.00;
    }
}
