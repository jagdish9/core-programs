package programs.designpattern.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();

        channel.subscribe(new User());
        channel.subscribe(new User());

        channel.notifyAllSubscribers("New Video uploaded");
    }
}

//Event-driven model
