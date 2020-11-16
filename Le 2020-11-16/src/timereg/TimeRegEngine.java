package timereg;

public class TimeRegEngine {

    TimeRegStore store = null;

    public TimeRegEngine(TimeRegStore s) {

        store = s;
    }

    public double getChargeability(String userId, int year, int month) {
        
        TimeRegEntity[] entities = store.getMonthlyRegs(userId, year, month);

        double sum = 0.0;
        for (int i = 0; i < entities.length; i++) {
            sum += entities[i].hoursWorked;
        }

        return sum / 240.0;
    }

}
