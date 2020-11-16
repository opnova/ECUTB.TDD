package timereg;

import java.util.Date;

public class TimeRegEntity {

    public TimeRegEntity(String userId, String projId, double hoursWorked, boolean isChargeable, Date date) {

        this.userId = userId;
        this.projId = projId;
        this.hoursWorked = hoursWorked;
        this.isChargeable = isChargeable;
        this.date = date;
    }

    public String userId = "";
    public String projId = "";
    public double hoursWorked = 0.0;
    public boolean isChargeable = false;
    public Date date = new Date(2020, 11, 16);

}
