package MachineCoding.service;

import MachineCoding.models.NewsLetter;
import MachineCoding.models.Subscription;
import MachineCoding.models.User;

import java.util.*;

public class OperationService {

    Map<Integer, User> userList = new HashMap<>();
    Map<Integer, NewsLetter> newsLetters = new HashMap<>();
    Map<Integer, String> categoryList = new HashMap<>();
    public static int categoryId = 0;
    public static int userId = 0;
    public static int newsLetterId = 0;
    public static int subscriptionId = 0;
    UserService userService = new UserService();
    NewsLetterService newsLetterService = new NewsLetterService();
    SubscriptionService subscriptionService = new SubscriptionService();

    public  int registerUser(String name, String emailId){
        User user= userService.registerUser(name,emailId,userId++);
        userList.put(user.getUserId(),user);
        return user.getUserId();
    }

    public void addCategory(String categoryName){
       if(!categoryList.containsValue(categoryName)){
           categoryList.put(categoryId++,categoryName);
       }else{
           System.out.println("Category Already Exists");
       }

    }

    public  int  addNewsLettersId(String title,int userId,int price , List<String> category ){
        List<Integer> getCategoryId = getCategoryId(category);
        User user = userList.get(userId);
        NewsLetter newsLetter = newsLetterService.addNewsLetter(title,userId,price,getCategoryId,user,newsLetterId++);
        newsLetters.put(newsLetter.getNewsLetterId(),newsLetter);
        return newsLetter.getNewsLetterId();
    }

    private List<Integer> getCategoryId(List<String> givenCategoryList) {

       List<Integer> resList = new ArrayList<>();
       for(Map.Entry<Integer, String> ct : categoryList.entrySet()){
           if(givenCategoryList.contains(ct.getValue())){
               resList.add(ct.getKey());
           }
           else{
               System.out.println("New Category Added  : "+ ct.getValue());
               addCategory(ct.getValue());
           }
       }
       return resList;
    }

    public  void getNewsLetters (List<String> givenCategory){

        List<Integer> givenListId = getCategoryId(givenCategory);
        newsLetterService.getNewsLettersByCategory(newsLetters,givenListId,categoryList);
    }


    public int subscribe(int newsLetterId, int customerId){
        if(!userList.containsKey(customerId)){
            System.out.println("User Doesn't Exist");
            return -100;
        }
        if(!newsLetters.containsKey(newsLetterId)){
            System.out.println("NewsLetter Doesn't Exist");
            return -100;
        }

       NewsLetter newsLetter = newsLetters.get(newsLetterId);
       User user = userList.get(newsLetter.getUserId());
        Subscription subscription=  subscriptionService.addSubscription(newsLetter,customerId,user,subscriptionId++);
         return  subscription.getSubscriptionId();
    }

    public  int fetchEarning(int userId){
        if(!userList.containsKey(userId)){
            System.out.println("User Doesn't Exist");
            return -100;
        }
        User user = userList.get(userId);
        return userService.getEarnings(user,newsLetters);
    }



}
