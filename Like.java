public class Like {

    RegisterdUser user;
    LikeType lT;
    PostType pT;

    Like(RegisterdUser ra,LikeType lt,PostType pt){
        this.user= ra;
        this.lT = lt;
        this.pT = pt;
    }

    public RegisterdUser getUser() {
        return user;
    }

    public LikeType getlT() {
        return lT;
    }

    public PostType getpT() {
        return pT;
    }

    
    
}
