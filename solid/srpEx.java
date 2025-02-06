package solid;
//Single Responsiblity Principle

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}

class UserRepository{
    //class that only handles storing data
    public void save(User user){
        System.out.println("user: " + user.getName() + " stored in database");
    }
}

public class srpEx {
    public static void main(String[] args) {
        User user = new User("Pranav");
        UserRepository repo = new UserRepository();
        repo.save(user);
    }
}
