class Card implements PaymentBehavior {
    public String payment() {

        System.out.print("Enter Card Number: ");
        long cardNum = sc.nextLong();
        System.out.print("Shaved Ice Cost: ");
        double cost = sc.nextDouble();
        System.out.println("Charged $" + cost + " to Card Number " + cardNum);
        System.out.println("Transaction Complete");

        return "Thank You!\n\n";
    }
}
