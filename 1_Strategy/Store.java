public class Store extends BobsShop {

    public Store() {

        orderType = new CompOrder();
        paymentTypeCash = new Cash();
        paymentTypeCard = new Card();
    }
}
