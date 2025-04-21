package observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String state;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Состояние изменено на: " + state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
