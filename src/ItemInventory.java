import java.util.ArrayList;

public class ItemInventory {

    /** The list of all items at the store */
    private ArrayList<ItemInfo> inventory;

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public ItemInventory(ArrayList<ItemInfo> inventory) {
        this.inventory = inventory;
    }

    /**
     * Returns the average cost of the available items
     * whose cost is between lower and upper, inclusive
     * Precondition: lower <= upper
     * At least one available element of
     * inventory has a cost between
     * lower and upper, inclusive.
     *
     No elements of inventory are null.
     */
    public double averageWithinRange(double lower, double upper) {
        double avg = 0.0;
        int count  = 0;
        for (ItemInfo item: inventory){
            if (item.getCost() >= lower && item.getCost() <= upper && item.isAvailable()){
                avg += item.getCost();
                count ++;
            }
        }
        return avg/count;
    }


}