package programs.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {

    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void notifyAllSubscribers(String message) {
        for(Observer o : subscribers) {
            o.update(message);
        }
    }
}
