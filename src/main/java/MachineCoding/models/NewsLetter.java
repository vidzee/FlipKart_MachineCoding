package MachineCoding.models;

import java.util.List;

public class NewsLetter {

    int newsLetterId;
    List<Integer> categoryId;
    String title;
    int userId;
    int price;

    public NewsLetter(List<Integer> categoryId, String title, int userId, int price,int id) {
        this.categoryId = categoryId;
        this.title = title;
        this.userId = userId;
        this.price = price;
        this.newsLetterId = id;
    }

    public int getNewsLetterId() {
        return newsLetterId;
    }

    public void setNewsLetterId(int newsLetterId) {
        this.newsLetterId = newsLetterId;
    }

    public List<Integer> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<Integer> categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

