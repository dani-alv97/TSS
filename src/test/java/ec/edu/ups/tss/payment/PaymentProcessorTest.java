package ec.edu.ups.tss.payment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ec.edu.ups.tss.payment.PaymentResponse.PaymentStatus;

public class PaymentProcessorTest {
	
	private PaymentGateway gateway = null;
	private PaymentProcessor processor = null;
	
	@Before
	public void setUp() {
		gateway = Mockito.mock(PaymentGateway.class);
		processor = new PaymentProcessor(gateway);
	}

	@Test
	public void hacerPagoOk() {
		
		Mockito.when(gateway.requestPayment(Mockito.any())).
			thenReturn(new PaymentResponse(PaymentStatus.OK));
		
		assertTrue(processor.hacerPago(100));
		
	}

	
	@Test
	public void hacerPagoError() {
		
		Mockito.when(gateway.requestPayment(Mockito.any())).
			thenReturn(new PaymentResponse(PaymentStatus.ERROR));
		
		assertFalse(processor.hacerPago(100));
	}

}
