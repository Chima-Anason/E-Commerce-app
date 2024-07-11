package com.anagraceTech.ecommerce.kafka;

import com.anagraceTech.ecommerce.customer.CustomerResponse;
import com.anagraceTech.ecommerce.order.PaymentMethod;
import com.anagraceTech.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
