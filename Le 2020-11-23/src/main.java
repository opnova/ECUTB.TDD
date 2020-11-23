
public class main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        AnalogDisplay ad = new AnalogDisplay(timer);
        DigitalDisplay dd = new DigitalDisplay(timer);

        timer.tick();
        timer.Detach(ad);
        timer.tick();

        /*
         * FileStream f = new FileStream(); f.copy();
         * 
         * System.out.println("------------------------------------");
         * 
         * INetStream i = new INetStream(); i.copy();
         */
    }

}
