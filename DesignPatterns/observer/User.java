package LowLevelDesign.design_patterns.observer;

public class User implements Subscribers{

    int userId;

    public User(int userId)
    {
        this.userId = userId;
    }

    @Override
    public void getNotified(String msg) {
        
        System.out.println(userId+" get notified with "+msg);
    }

}
