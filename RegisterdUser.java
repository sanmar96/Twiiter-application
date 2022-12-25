import java.util.List;

public class RegisterdUser extends User {
 
    Timeline timeLine;
    Feedwall     feedwall;
    List<RegisterdUser> followers;
    List<RegisterdUser> followings;

    RegisterdUser(String name,String email,String contactNumber,String password){
        super(name, email, contactNumber, password);
    }

    public void follow(RegisterdUser ra){

    }

    public void unFollow(RegisterdUser ra){

    }

    public boolean checkCelebrity(){
        if(followers.size()>100000){
            return true;
        }
        return false;
    }

    public void postTweet(Tweet t){

        //  put the tweet on his timeline

        if(checkCelebrity()){
           // push the tweet to content server
        }

        else {
           // push the tweet to the followers;
        }

    }

    public void likeTweet(Tweet t){
        t.like();
    }

    public void commentOnComment(CommentThread ct,Comment c){
        ct.add(c);
    }

    public void dislikeTweet(Tweet t){

    }

}
