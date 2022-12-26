import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContentServer {
    Map<RegisterdUser,List<RegisterdUser>> subscribers;
    Map<RegisterdUser,List<Tweet>> celebPost;
    static ContentServer contentServerInstance = null;
    
    public Map<RegisterdUser, List<RegisterdUser>> getSubscribers() {
        return subscribers;
    }

    public Map<RegisterdUser, List<Tweet>> getCelebPost() {
        return celebPost;
    }

    private ContentServer(){
    
    }

    public static ContentServer getInstance(){
        if(contentServerInstance==null)
        {
            contentServerInstance = new ContentServer();
        }
         
        return contentServerInstance;
    }
  
    public void addFollower(RegisterdUser celebrity,RegisterdUser followee){
       List<RegisterdUser> followers = new ArrayList<>();
       if(subscribers.containsKey(celebrity))
       {
          followers = subscribers.get(celebrity);
       }
       followers.add(followee);
       subscribers.put(celebrity,followers);
    }

    public void removeFollower(RegisterdUser celebrity,RegisterdUser followee){
        List<RegisterdUser> followers = new ArrayList<>();
        if(subscribers.containsKey(celebrity))
        {
           followers = subscribers.get(celebrity);
        }
        followers.remove(followee);
        subscribers.put(celebrity,followers);

    }

    public void addPost(Tweet t, RegisterdUser celebrity){
       List<Tweet> tweetList = new ArrayList<>();
       if(celebPost.containsKey(celebrity))
       {
          tweetList = celebPost.get(celebrity);  
       }
       tweetList.add(t);
       celebPost.put(celebrity,tweetList);
    }

    
}
