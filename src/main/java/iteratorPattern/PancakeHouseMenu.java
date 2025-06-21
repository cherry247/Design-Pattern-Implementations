package iteratorPattern;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("Pancake Breakfast", 2.99);
        addItem("Regular Pancake", 2.99);
        addItem("Blueberry Pancakes", 3.49);
        addItem("Waffles", 3.59);
    }

    @Override
    public Iterator createIterator() {
       return new PancakeHouseIterator(menuItems);
    }

    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    public void printMenu() {
        Iterator iterator = createIterator();
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " - $" + menuItem.getPrice());
        }
    }
}
