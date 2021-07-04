package src;

import java.sql.Date;

public class extraMethods {

    //returns true or false if the budget >= cost
    public boolean successfulBudget(MainTrip trip){
        if(trip.calculateTotalBudget() >= trip.calculateCost()){
            return true;
        }
        return false;
    }
    
    
    //checks if all dates are within range of the start and end date of the trip
    public boolean isWithinRange(Date testDate, MainTrip trip) {
        return !(testDate.before(trip.getStartDate()) || testDate.after(trip.getEndDate()));
    }

    //checks if the date end is after the date Start
    public boolean startBeforeEnd(Date start, Date end){
        if(end.after(start)){
            return true;
        }
        return false;
    }

}
