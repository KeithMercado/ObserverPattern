public class MainSystem {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber keith = new Subscriber("Keith");
        Subscriber john = new Subscriber("John");
        Subscriber carlos = new Subscriber("Carlos");

        newsAgency.attach(keith);
        newsAgency.attach(john);
        newsAgency.attach(carlos);

        System.out.println("News Update #1:");
        newsAgency.publishNews("Class suspension due to Covid-19!");

        newsAgency.detach(john);

        Subscriber zion = new Subscriber("Zion");
        newsAgency.attach(zion);

        System.out.println("\nNews Update #2:");
        newsAgency.publishNews("New programming language promises to be faster and safer than Python!");
    }
}