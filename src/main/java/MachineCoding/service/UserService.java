package MachineCoding.service;

import MachineCoding.models.NewsLetter;
import MachineCoding.models.Subscription;
import MachineCoding.models.User;

import java.util.List;
import java.util.Map;

public class UserService {


    public User registerUser(String name, String emailId, int id) {
        //add validator for emailId
        User user = new User(name,emailId,id);
        return user;
    }

    public void addNewsLetter(User user,NewsLetter newsLetter){
        List<NewsLetter> newsLetterList = user.getNewsLetterList();
        newsLetterList.add(newsLetter);
        user.setNewsLetterList(newsLetterList);
    }

    public void addSubscription(User user, Subscription subscription){
        List<Subscription> subList = user.getSubscriptionList();
        subList.add(subscription);
        user.setSubscriptionList(subList);
    }


    public int getEarnings(User user, Map<Integer, NewsLetter> newsLetters) {

        List<Subscription> subscriptionList = user.getSubscriptionList();
        if(subscriptionList.size()==0){
            System.out.println("User doesnt have any earnings");
            return 0;
        }
        else{
            int total =0;
            for(Subscription subscription : subscriptionList){
                total +=newsLetters.get(subscription.getNewsLetterId()).getPrice();
            }
            System.out.println("User has earnings " + total);
            return total;
        }
    }
}
