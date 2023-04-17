import java.util.*;
public class Item {
    String name;
    int value;
    int weight;

    public Item(String s, int v, int w) {
        name = s;
        value = v;
        weight = w;
    }

    public int value() {
        return value;
    }

    public int weight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + ":" + value + "|" + weight;
}
    

}

