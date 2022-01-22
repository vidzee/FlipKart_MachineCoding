package MachineCoding.service;

import MachineCoding.models.NewsLetter;
import MachineCoding.models.Subscription;
import MachineCoding.models.User;

public class SubscriptionService {

    UserService userService = new UserService();

    public Subscription addSubscription(NewsLetter newsLetter, int customerId, User user, int id) {
        Subscription subscription = new Subscription(newsLetter.getNewsLetterId(),newsLetter.getUserId(),customerId,id);
        userService.addSubscription(user,subscription);
        return subscription;

    }
}
