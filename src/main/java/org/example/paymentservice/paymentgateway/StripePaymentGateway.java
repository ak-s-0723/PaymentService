package org.example.paymentservice.paymentgateway;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class StripePaymentGateway implements PaymentGateway{
    @Override
    public String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount) {
        return null;
    }
}
