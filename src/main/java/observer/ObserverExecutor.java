package observer;

public class ObserverExecutor {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        DigitObserver observer1 = new DigitObserver();
        GraphObserver observer2 = new GraphObserver();
        generator.addObservers(observer1);
        generator.addObservers(observer2);
        generator.execute();
    }
}
