package org.example.composite;

public class CompositeClient {
    public static void main(String[] args) {
        LeafMenuItem burger = new LeafMenuItem("햄버거", 4000);
        LeafMenuItem fries = new LeafMenuItem("감자튀김", 3500);
        LeafMenuItem coke = new LeafMenuItem("제로 콜라", 2000);
        LeafMenuItem salad = new LeafMenuItem("샐러드", 5000);

        CompositeMenu combo = new CompositeMenu();
        combo.addMenuItem(burger);
        combo.addMenuItem(fries);
        combo.addMenuItem(coke);

        System.out.println("\n***** 패스트 푸드 *****");
        combo.print();

        CompositeMenu vegetable = new CompositeMenu();
        vegetable.addMenuItem(salad);

        System.out.println("\n***** 샐러드류 *****");
        vegetable.print();
    }
}
