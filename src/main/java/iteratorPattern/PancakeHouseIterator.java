package iteratorPattern;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;

    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return menuItems.get(position++);
        }
        return null;
    }
}
