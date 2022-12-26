import java.util.ArrayList;
import java.util.List;

public abstract class Wall {

    List<Tweet> tweets;

    Wall(){
        tweets = new ArrayList<>();
    }

    public void addTweet(Tweet t){
        this.tweets.add(t);
    }

    public List<Tweet> getTweets() {
        return tweets;
    }


    
}
