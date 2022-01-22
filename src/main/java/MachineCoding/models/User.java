package MachineCoding.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    int userId;
    String name;
    String emailId;
    List<NewsLetter> newsLetterList = new ArrayList<>();
    List<Subscription> subscriptionList = new ArrayList<>();

    public User(String name, String emailId, int id) {
        this.name = name;
        this.emailId = emailId;
        this.userId = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<NewsLetter> getNewsLetterList() {
        return newsLetterList;
    }

    public void setNewsLetterList(List<NewsLetter> newsLetterList) {
        this.newsLetterList = newsLetterList;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }
}
