package com.anagraceTech.ecommerce.payment;

import com.anagraceTech.ecommerce.customer.CustomerResponse;
import com.anagraceTech.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
