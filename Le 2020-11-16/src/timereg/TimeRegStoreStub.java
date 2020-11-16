package timereg;

import java.util.ArrayList;
import java.util.Date;

public class TimeRegStoreStub extends TimeRegStore{
    ArrayList<TimeRegEntity> entries = new ArrayList<TimeRegEntity>();
    
    /**
     * Hjälpmetod för att lägga till TimeRegEntity-objekt
     */
    public void addTimeRegEntity(String userId, String projId,
                double hoursWorked, 
                boolean isChargeable, 
                Date date) {

        TimeRegEntity tre = new TimeRegEntity(userId, projId, hoursWorked, isChargeable, date); 
        entries.add(tre);
    }


    /**
     * En stub implementation of the base class' getMonthlyRegs().
     * Returnerar en array av förkonfigurerade TimeRegEntity-objekt.
     */
    @Override
    public TimeRegEntity[] getMonthlyRegs(String userId, int year, int month){

        TimeRegEntity[] arr = new TimeRegEntity[entries.size()];

        return entries.toArray(arr);    
    }
}
