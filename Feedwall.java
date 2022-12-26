import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Feedwall extends Wall {

    List<Tweet> showFeedwall(){
      List<Tweet> feedWall =  new ArrayList<>();
      feedWall = getTweets(); // normal users tweet.

     //celebs tweet
       ContentServer sc = ContentServer.getInstance();
       Map<RegisterdUser,List<RegisterdUser>> subscribers = sc.getSubscribers();
       
    }
    
}
