package org.ford.Assignment4;

public abstract class MenuItem {

    String itemName;

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public abstract void prepare();

}
