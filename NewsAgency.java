import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {
    private List<SubscriberObserver> subscriberList;
    private String latestNews;

    public NewsAgency() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void attach(SubscriberObserver subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(SubscriberObserver subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (SubscriberObserver subscriber : subscriberList) {
            subscriber.updateNews(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }
}