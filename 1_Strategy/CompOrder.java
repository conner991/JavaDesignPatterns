class CompOrder implements OrderBehavior {

    public String order() {

        // Random Number
        int minNum = 1;
        int maxNum = 500;
        int compOrderNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));

        String stringOrderNum = Integer.toString(compOrderNum);

        return ("New Order Number: " + stringOrderNum);

    }
}
