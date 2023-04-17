import java.util.*;
public class Knapsack {
    public static void main(String[] args) {
        final int NUMBER_ITEMS = 10;
        final int MIN_WEIGHT = 1;
        final int MAX_WEIGHT = 5;
        final int MIN_VALUE = 50;
        final int MAX_VALUE = 100;
        final int KNAPSACK_CAPACITY = 20; 
        
        Item[] items = generateItems();

        GridEntry[][] grid = new GridEntry[NUMBER_ITEMS][KNAPSACK_CAPACITY + 1];

        for(int i = 0; i < NUMBER_ITEMS; i++) {
            for(int j = 0; j <= KNAPSACK_CAPACITY; j++) {
                grid[i][j] = new GridEntry();
            }
        }

        for(int i = 0; i <= KNAPSACK_CAPACITY; i++) {
            if(items[0].weight <= i) {
                grid[0][i].totalValue = items[0].value;
                grid[0][i].items.add(items[0]);
            }
        }


        for(int i = 1; i < NUMBER_ITEMS; i++) {
            for(int j = 1; j <= KNAPSACK_CAPACITY; j++) {
                 if (j >= items[i].weight) {                  
                     int value = items[i].value + grid[i-1][j - items[i].weight].totalValue;
                     if (value > grid[i-1][j].totalValue) {
                         grid[i][j].totalValue = value;
                         grid[i][j].items.addAll(grid[i-1][j-items[i].weight].items);
                         grid[i][j].items.add(items[i]);
                     }
                     else {
                         grid[i][j].totalValue = grid[i-1][j].totalValue;
                         grid[i][j].items = grid[i-1][j].items;
                     }
                 }

                 else {
                     grid[i][j].totalValue = grid[i-1][j].totalValue;
                     grid[i][j].items = grid[i -1][j].items;
                 }

            
            }
        }
        
        System.out.println(grid[9][20].toString());
        
    }
    

    static Item[] generateItems(/*int howMany, int lValue, int hValue, int lWeight, int hWeight*/) {
        /*Item[] results = new Item[howMany];
        for (int i = 0; i < howMany; i++) {
            int value = (int) (Math.random() * (hValue - lValue + 1)) + lValue;
            int weight = (int) (Math.random() * (hWeight - lWeight + 1)) + lWeight;
            results[i] = new Item("Item" + i, value, weight);
        }*/
        
        Item[] results = new Item[10];
        results[0] = new Item("Item0", 91, 1);
        results[1] = new Item("Item1", 67, 2);
        results[2] = new Item("Item2", 97, 4);
        results[3] = new Item("Item3", 62, 4);
        results[4] = new Item("Item4", 86, 5);
        results[5] = new Item("Item5", 74, 1);
        results[6] = new Item("Item6", 98, 5);
        results[7] = new Item("Item7", 55, 3);
        results[8] = new Item("Item8", 60, 2);
        results[9] = new Item("Item9", 53, 4);

        return results;
    }
}

