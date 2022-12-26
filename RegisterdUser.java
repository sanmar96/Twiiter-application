import java.util.List;

public class RegisterdUser extends User {
 
    Timeline timeLine;
    Feedwall     feedwall;
    List<RegisterdUser> followers;
    List<RegisterdUser> followings;

    RegisterdUser(String name,String email,String contactNumber,String password){
        super(name, email, contactNumber, password);
        timeLine = new Timeline();
        feedwall = new Feedwall();
    }

    public void follow(RegisterdUser ra){
        this.followings.add(ra);

        if(checkCelebrity(ra))
        {
            ContentServer cs = ContentServer.getInstance();
            cs.addFollower(ra,this);
        }
        else
        {
            ra.followers.add(this);
        }   
    }

    public void unFollow(RegisterdUser ra){
         
        this.followings.remove(ra);

        if(checkCelebrity(ra))
        { 
            ContentServer cs = ContentServer.getInstance();
            cs.removeFollower(ra,this);     
        } 
        else 
        {
         ra.followers.remove(this);
        }
    }
    public boolean checkCelebrity(RegisterdUser ra){
        if(ra.followers.size()>3){
            return true;
        }
        return false;
    }

    public void postTweet(Tweet t){
        //  put the tweet on his timeline
         timeLine.addTweet(t);
         
        if(checkCelebrity(this)){
           // push the tweet to content server
           ContentServer cs = ContentServer.getInstance();
           cs.addPost(t,this);
        }

        else {
           // push the tweet to the followers feedwall
           for(RegisterdUser ra:followers)
           {
                ra.feedwall.addTweet(t);
           }
        }

    }

    public void likeTweet(Tweet t,Like l){
        t.likeaTweet(l);
    }

    public void commentOnComment(CommentThread ct,Comment c){
        ct.addComment(c);
    }

    public void dislikeTweet(Tweet t){
    t.dislikeaTweet();
    }

}
