package it.unibo.openapi.model;

import java.util.Map;
import java.util.Set;

public class Order {

    public String orderId;
    public Map<String,Integer> products;
    public String username;

    public Order() {
    }

    public Order(String orderId, Map<String,Integer> products, String buyer) {
        this.orderId = orderId;
        this.products = products;
        this.username = buyer;
    }
}
