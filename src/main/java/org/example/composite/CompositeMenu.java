package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeMenu implements ComponentMenuItem {
    private List<ComponentMenuItem> componentMenuItemList = new ArrayList<>();

    public void addMenuItem(LeafMenuItem leafMenuItem) {
        componentMenuItemList.add(leafMenuItem);
    }

    @Override
    public void print() {
        for (ComponentMenuItem componentMenuItem : componentMenuItemList) {
            componentMenuItem.print();
        }
    }
}
