package tk.avabin.items;

/**
 * Created by Avabin on 30.05.2016.
 */
public abstract class Item {
    private String type;
    private String name;
    private int value;

    public Item(String type, String name, int value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
