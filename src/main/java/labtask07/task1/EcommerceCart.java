package labtask07.task1;

public class EcommerceCart {

    private PaymentMethod paymentMethod;

    public EcommerceCart(PaymentMethod paymentMethod) {

        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {

        paymentMethod.pay(amount);
    }
}