
/*
* File Name: MainTrip.java
* Package Name: maintrip
* Authors: Affan Khan, Varun Chedda, Abdullah Khan
* Last Modified On: 2021-04-19
* Description: A super class object that holds trip details such as waypoints,
* budgets, costs, dateStart, dateEnd
*/

package src;

import java.util.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;

public class MainTrip{
    //variables
    private double totalBudgetPerPerson;
    private int people;
    private ArrayList<Waypoint> route;
    private Date startDate;
    private Date endDate;

    //constructors
    public MainTrip(){

    }
    public MainTrip(double totalBudgetPerPerson, ArrayList<Waypoint> route, Date startDate, Date endDate,int people){
        this.totalBudgetPerPerson = totalBudgetPerPerson;
        this.route = route;
        this.startDate = startDate;
        this.endDate = endDate;
        this.people = people;
    }

    //getters
    public double getTotalBudgetPerPerson(){
        return totalBudgetPerPerson;
    }
    public ArrayList<Waypoint> getRoute(){
        return route;
    }
    public Date getStartDate(){
        return startDate;
    }
    public Date getEndDate(){
        return endDate;
    }
    public int getPeople(){
        return people;
    }
    //setters
    public void setTotalBudgetPerPerson(double totalBudgetPerPerson){
        this.totalBudgetPerPerson = totalBudgetPerPerson;
    }
    public void setRoute(ArrayList<Waypoint> route){
        this.route = route;
    }
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }
    public void setPeople(int people){
        this.people = people;
    }
    
    
    /**
     * This method calculates the total totalCostPerPerson of the entire trip
     * @return total
     */
    public double totalCostPerPersonOfTrip(){
        double total = 0;
        for (Waypoint b : route) {
            total += b.calcWaypointCost();
        }
        return total;
    }
    
    //function that returns total budget
    public double calculateTotalBudget(){
        return people * totalBudgetPerPerson;
    }

    //function that returns total budget
    public double calculateCost(){
        return people * totalCostPerPersonOfTrip();
    }

    /**
     * Returns length of route
     * @return route.size()
     */
    public int numWaypoints(){
        return route.size();
    }
    
    //returns a string of info of this object
    public String toString(){
        //variables
        String returnString = "";
        int i = 1;

        //main title and totalBudgetPerPerson and totalCostPerPerson
        returnString += "A TRIP ACROSS CANADA\n\tFrom: " + getStartDate() + "\tTo: " + getEndDate() + "\n\ttotal Budget Per Person: " + getTotalBudgetPerPerson() + "\n\ttotal Cost Per Person: " + totalCostPerPersonOfTrip() + "\n";

        //for loop that will get each waypoint info from the toString and add it onto the returnString
        for (Waypoint e : route) {
            returnString += "--------------------------------------\nStop number (" + i++ + ")\n";
            returnString += e.toString();
        }

        returnString += "--------------------------------------\nTotal budget is: " + calculateTotalBudget() + "\tTotal Cost is: " + calculateCost();

        //returns a final big string that reviews the entire trip
        return returnString;
    }

}



