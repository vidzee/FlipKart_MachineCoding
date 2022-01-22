package MachineCoding.service;

import MachineCoding.models.NewsLetter;
import MachineCoding.models.User;

import java.util.List;
import java.util.Map;

public class NewsLetterService {

    UserService userService = new UserService();
    public NewsLetter addNewsLetter(String title, int userId, int price, List<Integer> category, User user, int id) {

        NewsLetter newsLetter = new NewsLetter(category,title,userId,price,id);
        userService.addNewsLetter(user,newsLetter);
        return  newsLetter;

    }

    public void getNewsLettersByCategory(Map<Integer, NewsLetter> newsLetters, List<Integer> givenCategory, Map<Integer, String> categoryList) {

        for(Integer givenCat : givenCategory){

            String category = categoryList.get(givenCat);
            System.out.println("For Category "+ category);
            for(Map.Entry<Integer,NewsLetter> newsLetter: newsLetters.entrySet()){
                if(newsLetter.getValue().getCategoryId().contains(givenCat)){
                    System.out.println("******** "+ newsLetter.getValue().getNewsLetterId());
                    System.out.println("**Id "+ newsLetter.getValue().getNewsLetterId());
                    System.out.println("**Title "+ newsLetter.getValue().getTitle());
                    System.out.println("***** "+ newsLetter.getValue().getTitle());

                }

            }
        }


    }
}
