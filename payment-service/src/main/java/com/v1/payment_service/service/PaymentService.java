package com.v1.payment_service.service;

import com.v1.payment_service.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
