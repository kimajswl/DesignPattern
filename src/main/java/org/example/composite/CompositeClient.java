package org.example.composite;

public class CompositeClient {
    public static void main(String[] args) {
        LeafMenu burger = new LeafMenu("햄버거", 4000);
        LeafMenu fries = new LeafMenu("감자튀김", 3500);
        LeafMenu coke = new LeafMenu("제로 콜라", 2000);
        LeafMenu salad = new LeafMenu("샐러드", 5000);

        ComboMenu combo = new ComboMenu();
        combo.addMenuItem(burger);
        combo.addMenuItem(fries);
        combo.addMenuItem(coke);

        System.out.println("\n***** 패스트 푸드 *****");
        combo.print();

        SaladMenu vegetable = new SaladMenu();
        vegetable.addMenuItem(salad);

        System.out.println("\n***** 샐러드류 *****");
        vegetable.print();
    }
}
