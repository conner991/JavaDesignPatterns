public class Star extends OrnamentsDecorator {
    protected ChristmasTree christmasTree;

    public Star(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;

    }

    public String getDescription() {

        return christmasTree.getDescription() + "a star..\n";

    }

    public double cost() {

        return christmasTree.cost() + 4.00;

    }

}
