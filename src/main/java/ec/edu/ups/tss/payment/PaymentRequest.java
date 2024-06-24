package ec.edu.ups.tss.payment;

public class PaymentRequest {

	private double cantidad;
	
	public PaymentRequest(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getCantidad() {
		return cantidad;
	}
	
	
}
