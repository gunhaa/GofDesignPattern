package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer observer){
        observers.add(observer);
    }

    public void deleteObservers(Observer observer){
        observers.remove(observer);
    }

    // Observer에 전파
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();


}
