public class Main {

    public static void main(String[] args) {
        ChristmasTree myTree1 = new FraserFir();
        System.out.printf(myTree1.getDescription() + "Total Cost: $%.2f %n", myTree1.cost());

        ChristmasTree myTree2 = new DouglasFir();
        myTree2 = new Star(myTree2);
        myTree2 = new Ruffles(myTree2);
        myTree2 = new Ruffles(myTree2);
        myTree2 = new BlueBalls(myTree2);
        System.out.printf(myTree2.getDescription() + "Total Cost: $%.2f %n", myTree2.cost());

        ChristmasTree myTree3 = new BalsamFir();
        myTree3 = new Star(myTree3);
        myTree3 = new Ruffles(myTree3);
        myTree3 = new Ruffles(myTree3);
        myTree3 = new Star(myTree3);
        myTree3 = new BlueBalls(myTree3);
        myTree3 = new RedBalls(myTree3);
        myTree3 = new Star(myTree3);
        myTree3 = new LED(myTree3);
        myTree3 = new Lights(myTree3);
        System.out.printf(myTree3.getDescription() + "Total Cost: $%.2f %n", myTree3.cost());
    }

}