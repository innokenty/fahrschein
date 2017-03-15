package org.zalando.fahrschein.example.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderPaymentAcceptedEvent {

    private String orderNumber;
    private String paymentMethod;

    @JsonCreator
    public OrderPaymentAcceptedEvent(@JsonProperty("orderNumber") String orderNumber,
                                     @JsonProperty("paymentMethod") String paymentMethod) {
        this.orderNumber = orderNumber;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

}