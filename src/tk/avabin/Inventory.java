package tk.avabin;

import tk.avabin.items.Item;

import java.util.ArrayList;

/**
 * Created by Avabin on 30.05.2016.
 */
public abstract class Inventory {
    private ArrayList<Item> items;
    private int maxSize;
    private int capacity;

    public Inventory(ArrayList<Item> items, int maxSize, int capacity) {
        this.items = items;
        this.maxSize = maxSize;
        this.capacity = capacity;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
