public class Main {
    public static void main(String[] args) {
        PaymentGateway newGateway = new PaymentGateway();
        PaymentProcessor newGatewayAdapter = new PaymentGatewayAdapter(newGateway);

        System.out.println("--- Using the new payment gateway via the Adapter ---");
        newGatewayAdapter.processPayment(300.0);
    }
}
