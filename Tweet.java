import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tweet {

    RegisterdUser user;
    String content;
    List<String> hashtag;
    List<String> taggedUsers;
    int tweetId;
    static int incrementor=0;
    List<Like> likes;
    Map<Integer,CommentThread> commentThread;
    LocalDateTime dateTime;


    Tweet(RegisterdUser ra,String content,List<String> hashTags,List<String>taggedUsers){
       this.tweetId=incrementor;
       ++incrementor;
       this.user =ra;
       this.hashtag=hashTags;
       this.taggedUsers=taggedUsers;
    }

    public void likeaTweet(Like l){
         this.likes.add(l);
    }

    public void dislikeaTweet(){
        // iterate the likes list and remove the user who liked the tweet
        for(Like h:likes){
         RegisterdUser ra = h.getUser();
         if(this.equals(ra)){
          likes.remove(h);
         }
        }

    }
    
    public void addComment(Comment t){
       CommentThread ct = new CommentThread();
       ct.addComment(t);
       int Id = ct.getThreadId();
       Map<Integer,CommentThread> ctMap  = new HashMap<>();
       ctMap.put(Id,ct);
    }
    
}
