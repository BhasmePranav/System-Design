package LowLevelDesign.design_patterns.observer;

import java.util.*;


public interface Channel {

    public void subscribe(Subscribers subscriber);
    public void unsubscribe(Subscribers  subscriber);
    public void notifySubscribers();
}

class YoutubeChannel implements Channel
{
    List<Subscribers> list = new ArrayList();

    @Override
    public void subscribe(Subscribers  subscriber) {
        list.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscribers  subscriber) {
        list.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        
        for(Subscribers s : list)
        {
            s.getNotified("new video uploaded");
        }
    }
    
}

