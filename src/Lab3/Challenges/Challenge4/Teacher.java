package Lab3.Challenges.Challenge4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {

    private List<Observer> observers = new ArrayList<>();
    private String message;



    public void teach(String topics){
        this.message=topics;
        notifyObservers(message);
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer : this.observers){
            observer.update(message);
        }
    }
}
