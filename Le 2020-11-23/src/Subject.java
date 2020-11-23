import java.util.ArrayList;

public class Subject {

    ArrayList<Observer> observers = null;

    public Subject() {

        observers = new ArrayList<Observer>();
    }

    // o vill lyssna på något
    public void Attach(Observer o) {

        observers.add(o);
    }

    // o vill inte lyssna längre
    public void Detach(Observer o) {

        observers.remove(o);
    }

    // Så fort det man lyssnar på har ändrats ->
    // vi ropar på notify() som kommer att meddela
    // alla sina observers.
    void Notify() {

        for (Observer observer : observers) {
            observer.Update();
        }
    }

}
