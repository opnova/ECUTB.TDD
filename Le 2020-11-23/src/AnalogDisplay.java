
public class AnalogDisplay extends Observer {

    Timer timer = null;

    public AnalogDisplay(Timer subject) {

        subject.Attach(this);
        timer = subject;
    }

    @Override
    public void Update() {

        int ct = timer.currentTick();
        System.out.println("AnalogDisplay::Update() : " + ct);
    }

}
