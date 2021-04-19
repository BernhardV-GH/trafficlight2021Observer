package trafficlight.observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer o){
        observers.add(o);
    }

    public void removeObservers(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(Subject s){
        for(Observer obs : observers){
            obs.update(s);
        }
    }
}
