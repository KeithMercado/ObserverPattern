public interface NewsAgencySubject {
    void attach(SubscriberObserver subscriber);
    void detach(SubscriberObserver subscriber);
    void notifySubscribers();
}