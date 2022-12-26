import java.time.LocalDateTime;
import java.util.List;

public class Comment {

     String content;
     RegisterdUser user;
     List<Like> likes;
     LocalDateTime dateTime;

     Comment(String content,RegisterdUser ra){
        this.content = content;
        this.user = ra;
        this.dateTime = LocalDateTime.now();
     }

     public RegisterdUser getUser() {
        return user;
    }

    public List<Like> getLikes() {
        return likes;
    }
    
    public void setLikes(Like l){
      this.likes.add(l);
    }

    public void addLike(Like l){
        setLikes(l);
     }
    
     public void unLike(){
        // get the user and iterate the likes list and remove the like.
        RegisterdUser ra = getUser();
        List<Like> likes = getLikes();
        for(Like l: likes){
            if(ra.equals(l.getUser())){
                likes.remove(l);
            }
        }
     }
}
