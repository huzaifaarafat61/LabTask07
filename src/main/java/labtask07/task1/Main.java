package labtask07.task1;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TASK 1 =====");

        PaymentMethod creditCard =
                new CreditCardPayment();

        EcommerceCart cart1 =
                new EcommerceCart(creditCard);

        cart1.checkout(5000);


        PaymentMethod jazzCash =
                new JazzCashPayment();

        EcommerceCart cart2 =
                new EcommerceCart(jazzCash);

        cart2.checkout(2500);

    }
}