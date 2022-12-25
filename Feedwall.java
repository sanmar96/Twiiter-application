import java.util.List;

public class Feedwall extends Wall {

    List<Tweet> showFeedwall(){
      List<Tweet> feedWall =  getTweets();
      return feedWall; 
    }
    
}
