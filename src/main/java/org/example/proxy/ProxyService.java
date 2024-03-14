package org.example.proxy;

public class ProxyService implements StationeryOrder {
    @Override
    public void order(String person[], String livingSupply[]) {
        OrderService orderService = new OrderService();
        orderService.order(person, livingSupply);
    }
}
