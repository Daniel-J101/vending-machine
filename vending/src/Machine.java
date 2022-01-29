public class Machine {
    Item[][] items = new Item[3][9];

    public Machine(Item[][] items) {
        for(int i = 0; i < items.length; i++) {
            for(int j = 0; j < items[i].length; j++) {
                this.items[i][j] = items[i][j];
            }
        }
    }

    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     *
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
    public boolean dispense(int row, int spot) {
        int quantity = items[row][spot].getQuantity();
        if (quantity > 0) {
            items[row][spot].setQuantity(quantity - 1);
            return true;
        } else
            return false;
    }

    public Item getItem(int row, int spot)  {
        return new Item(items[row][spot]);
    }

    public void setItem(Item item, int row, int spot) {
        items[row][spot] = new Item(item);
    }
}