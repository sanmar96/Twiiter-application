import java.util.List;

public class Tweet {

    RegisterdUser user;
    String content;
    List<String> hashtag;
    List<String> taggedUsers;
    int tweetId;
    static int incrementor=0;
    List<Like> likes;
    Map<String,CommentThread> commentThread;


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
        // iterate the likes list and remove the user who lie the tweet
    }
    
    public void addComment(Comment t){
       commentThread ct = new CommentThread();
       ct.addComment(t);
    }
    
}
