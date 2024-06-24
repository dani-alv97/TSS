package ec.edu.ups.tss.payment;

public interface PaymentGateway {

	public PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
