package MachineCoding.models;

public class Subscription {

    int subscriptionId;
    int newsLetterId;
    int ownerId;
    int customerId;

    public Subscription(int newsLetterId, int ownerId, int customerId,int id) {
        this.newsLetterId = newsLetterId;
        this.ownerId = ownerId;
        this.customerId = customerId;
        this.subscriptionId = id;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getNewsLetterId() {
        return newsLetterId;
    }

    public void setNewsLetterId(int newsLetterId) {
        this.newsLetterId = newsLetterId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
