
public class DigitalDisplay extends Observer {

    Timer timer = null;
    
    public DigitalDisplay(Timer subject) {

        subject.Attach(this);
        timer = subject;
    }

    @Override
    public void Update() {
        int ct = timer.currentTick();
        System.out.println("DigitalDisplay::Update() : " + ct);

    }

}
