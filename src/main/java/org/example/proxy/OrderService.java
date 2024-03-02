package org.example.proxy;

public class OrderService implements StationeryOrder{
    @Override
    public void order(String person[], String livingSupply[]) {
        for(int i = 0 ; i < person.length; i++) {
            System.out.println(person[i] + " 님이 주문하신 상품: " + livingSupply[i]);
        }
    }
}
