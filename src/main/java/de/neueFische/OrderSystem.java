package de.neueFische;

import java.util.HashMap;

public class OrderSystem {

    private int id;
    private HashMap<Integer, Menu> menus = new HashMap<>();


    public boolean addMenu(Menu menu) {
        menus.put(menu.getId(), menu);
        return true;
    }

    Menu getOrderById(int id) {
        return menus.get(id);
    }


}
