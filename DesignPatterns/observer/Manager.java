
package LowLevelDesign.design_patterns.observer;

public class Manager {

    public static void main(String[] args) {
        
        Channel channel = new YoutubeChannel();
        
        User user1 = new User(101);
        User user2 = new User(102);
        User user3 = new User(103);

        channel.subscribe(user3);
        channel.subscribe(user2);
        channel.subscribe(user1);

        channel.notifySubscribers();

        channel.unsubscribe(user2);
        channel.notifySubscribers();
        
    }
}
