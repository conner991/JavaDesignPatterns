class TicketOrder implements OrderBehavior {

    public String order() {

        System.out.print("What is the order number: ");
        int ticketOrderNum = sc.nextInt();
        String stringOrderNum = Integer.toString(ticketOrderNum);

        return ("Order Number Entered: " + stringOrderNum);
    }
}
