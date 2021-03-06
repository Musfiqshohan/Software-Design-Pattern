	package IteratorPattern;

public class DinnerMenu {
    MenuItem[] dinnerItems;
    static final int maxItems = 10;
    private int currentItems;

    public DinnerMenu()
    {
        dinnerItems = new MenuItem[maxItems];
        currentItems = 0;

    }

    public void addItem(String name, String description, double price)
    {
        if(this.currentItems >= maxItems)
        {
            System.out.println("Items overflow occurred");
            return;
        }
        dinnerItems[currentItems] = new MenuItem(name , description , price);
        this.currentItems = this.currentItems +1 ;
        return;
    }

    public MenuItem[] getDinnerItems() {
        return dinnerItems;
    }
}
