class Cash implements PaymentBehavior {
    public String payment() {

        System.out.print("Trasaction Cost: ");
        double transactionCost = sc.nextDouble();
        System.out.print("Amount of cash recieved: ");
        double cashPayment = sc.nextDouble();
        double changeDouble = cashPayment - transactionCost;
        // String changeString = Double.toString(changeDouble);
        System.out.printf("Change amount: %.2f %n", changeDouble);
        System.out.println("Transaction Complete");

        return "Thank You!\n\n";
    }
}
