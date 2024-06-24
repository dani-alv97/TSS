package ec.edu.ups.tss.payment;

public class PaymentProcessor {

	private PaymentGateway gateway;
	
	public PaymentProcessor(PaymentGateway gateway) {
		this.gateway = gateway;
	}
	
	public boolean hacerPago(double cantidad) {
		PaymentResponse response = gateway.requestPayment(new PaymentRequest(cantidad));
		if(response.getStatus() == PaymentResponse.PaymentStatus.OK) {
			return true;
		}else {
			return false;
		}
	}
	
}
