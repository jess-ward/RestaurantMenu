package restaurant;

public enum Category {
    APPETIZER("Appetizer"),
    MAIN("Main Course"),
    DESSERT("Dessert");

    private String category;

    Category(String aCategory) {
        this.category = aCategory;
    }

    public String getCategory() {
        return category;
    }
}

