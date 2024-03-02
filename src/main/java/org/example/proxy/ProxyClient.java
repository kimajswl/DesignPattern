package org.example.proxy;

public class ProxyClient {
    public static void main(String[] args) {
        OrderService orderService = new ProxyService(); // 프록시 서비스가 주문 서비스 틀래스를 참조하고 있기 때문에 이런식으로 객체를 생성할 수 있음
        // 이렇게 되면 client -> proxy -> service 식으로 접근 가능 --- 설명 더 필요

        String[] person = {"철수", "짱구", "이슬이", "맹구"};
        String[] livingApply = {"가위", "색종이" ,"색연필", "물감"};

        orderService.order(person, livingApply);

    }
}
