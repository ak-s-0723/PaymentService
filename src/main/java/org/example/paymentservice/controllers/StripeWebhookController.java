package org.example.paymentservice.controllers;

import com.stripe.model.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

    @PostMapping
    public void receiveWebHookEvents(Event event) {
        System.out.println("Bye Bye...");
        //have if else , switch case on different different events
    }
}
