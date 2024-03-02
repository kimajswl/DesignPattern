package org.example.decorator;

public class DecoratorClient { // 이거 설명 잘 하기
    public static void main(String[] args) {
        Subway mySandwich = new ShrimpSandwich(); // 기본 샌드위치 주문
        System.out.println("주문: " + mySandwich.getOrder());
        System.out.println("가격: " + mySandwich.breadPrice() + " 원");

        mySandwich = new Bacon(mySandwich); // 토핑 추가
        System.out.println("주문: " + mySandwich.getOrder());
        System.out.println("가격: " + mySandwich.breadPrice() + " 원");

        mySandwich = new EggMayo(mySandwich); // 토핑 추가
        System.out.println("주문: " + mySandwich.getOrder());
        System.out.println("가격: " + mySandwich.breadPrice() + " 원");
    }
}
