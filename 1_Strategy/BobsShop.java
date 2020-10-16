public class BobsShop {

    // Instance Objects
    public OrderBehavior orderType;
    public PaymentBehavior paymentTypeCash;
    public PaymentBehavior paymentTypeCard;

    // Methods
    public void processOrder() {
        System.out.println(orderType.order());
    }

    public void processCashPayment() {
        System.out.println(paymentTypeCash.payment());
    }

    public void processCardPayment() {
        System.out.println(paymentTypeCard.payment());
    }

}