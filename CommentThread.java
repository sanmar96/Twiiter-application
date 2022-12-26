import java.util.List;

public class CommentThread {
  int threadId;
  List<Comment> comments;
  int incrementor=0;

  CommentThread(){
    threadId=incrementor;
    ++incrementor;
  }

  public int getThreadId() {
    return threadId;
}

public void setComments(Comment c) {
    this.comments.add(c);
}

public void addComment(Comment c){
     setComments(c);
  } 
    
}
