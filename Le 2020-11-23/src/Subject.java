import java.util.ArrayList;

public class Subject {

    ArrayList<Observer> observers = null;

    public Subject() {

        observers = new ArrayList<Observer>();
    }

    // o vill lyssna p� n�got
    public void Attach(Observer o) {

        observers.add(o);
    }

    // o vill inte lyssna l�ngre
    public void Detach(Observer o) {

        observers.remove(o);
    }

    // S� fort det man lyssnar p� har �ndrats ->
    // vi ropar p� notify() som kommer att meddela
    // alla sina observers.
    void Notify() {

        for (Observer observer : observers) {
            observer.Update();
        }
    }

}
