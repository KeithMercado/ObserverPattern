public class Subscriber implements SubscriberObserver {
    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNews(String news) {
        System.out.println("Hey, " + subscriberName + "! Breaking News: " + news);
    }
}