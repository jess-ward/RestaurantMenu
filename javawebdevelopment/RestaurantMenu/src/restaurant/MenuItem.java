package restaurant;

public class MenuItem {

    private final int menuId;
    private final String description;
    private final double price;
    private final Category category;
    private boolean isNew;

    public  MenuItem(int menuId, String description, double price, Category category, boolean isNew) {
        this.menuId = menuId;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }
    //Construct a not-new (i.e. old) MenuItem ??

    public MenuItem(int menuId, String description, double price, Category category) {
        this(menuId, description, price, category, false);
    }
    //return the description?
    //getters
    public String getDescription() {
        return description;
    }

    public  double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    //return true if MenuItem is new, else false
   //find out why you don't use get for boolean...
    public boolean isNew() {
        return isNew;
    }

    public int getMenuId() {
        return menuId;
    }

    //ask about overriding ??

    @Override
    public String toString() {
        return menuId + " " + description + " " + price + " " + category + " "
                + (isNew ? "new menu item" : "old menu item");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) o;

        return this.getCategory() == menuItem.getCategory() && this.getDescription() == menuItem.getDescription()
                && this.getMenuId() == menuItem.getMenuId() && this.getPrice() == menuItem.getPrice();
    }
}

//again, this is Hanks code for MenuItem. my design did not include enum subclass, construct of not new menuitmes
//menu id's and overrides. I also missed the type of isNew needing to be a boolean
