
public class Timer extends Subject {

    int _tick = 0;

    public void tick() {

        _tick++;
        Notify();
    }

    public int currentTick() {

        return _tick;
    }

}
