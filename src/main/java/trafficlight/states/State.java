package trafficlight.states;
import trafficlight.observerpattern.Subject;

public abstract class State extends Subject {

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }
}