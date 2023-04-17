import java.util.*;

public class GridEntry {
    public ArrayList<Item> items = new ArrayList<>();
    public int totalValue;

    public GridEntry() {
        totalValue = 0;
    }

    public GridEntry(Item i) {
        items.add(i);
    }

    public void add(Item i) {
        items.add(i);
    }

    public ArrayList<Item> asArray(){
        return items;
    }


    public int totalValue() {
        for(Item i : items) {
            totalValue += i.value();
        }

        return totalValue;
    }

    public void mergeWith(GridEntry g) {
        items.addAll(g.asArray());
    }
    
    public String toString() {
        String output = "Total Value:$" + totalValue() + " ";
        for (Item i: items) {
            output += i + " ";
        }
        return output;
    }
}
