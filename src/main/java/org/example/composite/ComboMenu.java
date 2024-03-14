package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class ComboMenu implements Menu {
    private List<Menu> menuList = new ArrayList<>();

    public void addMenuItem(LeafMenu leafMenuItem) {
        menuList.add(leafMenuItem);
    }

    @Override
    public void print() {
        for (Menu menu : menuList) {
            menu.print();
        }
    }
}
