package restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> menu;
    private LocalDateTime lastUpdated;

    public Menu() {
        this.menu = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now();
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
        lastUpdated = LocalDateTime.now(); //updates last updated to now when items are added
    }

    public  void removeMenuItem(int menuItemId) {
        for (int i=0; i<menu.size(); i++) {
            if (menu.get(i).getMenuId() == menuItemId) {
                menu.remove(i);
                lastUpdated = LocalDateTime.now(); //updates last updated to now when items are removed
                break;
            }
        }
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }
}

//this is Hanks menu class. I was missing adding and removing menu items. i also wasn't sure what date class to use