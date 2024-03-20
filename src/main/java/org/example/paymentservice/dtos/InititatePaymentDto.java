package org.example.paymentservice.dtos;

import jakarta.persistence.SequenceGenerators;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InititatePaymentDto {
    private String orderId;
    private String email;
    private String phoneNumber;
    private Long amount;
}
