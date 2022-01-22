package MachineCoding.models;

public class Category {
    int categoryId;
    String name;

    public Category( int id,String name) {
        this.name = name;
        this.categoryId = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
