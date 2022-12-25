public abstract class User {

    static int incrementor=0;
    int userId;
    String name;
    String email;
    String contactNumber;
    String password;

    User(String name,String email,String number,String password){
      this.userId = incrementor;
      ++incrementor;
      this.name=name;
      this.email=email;
      this.contactNumber= number;
      this.password=password;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    
}
