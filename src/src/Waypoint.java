/*
* File Name: Waypoint.java
* Package Name: maintrip
* Authors: Affan Khan (nerd), Varun Chedda (retard), Abdullah Khan (gayest), Yaw Asamoah (King)
* Last Modified On: 2021-04-19
* Description: A super class object that holds trip details such as waypoints,
* budgets, costs, dateStart, dateEnd
*/
package src;

import java.util.*;

public class Waypoint {
    /*Variables*/
    private ArrayList<Activity> activities;
    private Transportation transportation;
    private Hotel hotel;
    private String place;
    private String desc;
    private Date arrival;
    private Date departure;


    /*Constructors*/

    public Waypoint(){}
    public Waypoint(String place, String desc, Hotel hotel, ArrayList<Activity> activities, Transportation transportation, Date arrival, Date departure){
        this.activities = activities;
        this.place = place;
        this.desc = desc;
        this.hotel = hotel;
        this.transportation = transportation;
        this.arrival = arrival;
        this.departure = departure;    
    }

    /*Getters*/
    public String getPlace() {
        return place;
    }
    public String getDesc() {
        return desc;
    }
    public Hotel getHotel(){
        return hotel;
    }
    public ArrayList<Activity> getActivities(){
        return activities;
    }
    public Transportation getTransportation(){
        return transportation;
    }
    public Date getArrival(){
        return arrival;
    }
    public Date getDeparture(){
        return departure;
    }
    /*Setters*/
    public void setPlace(String place) {
        this.place = place;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }
    public void setActivities(ArrayList<Activity> activities){
        this.activities = activities;
    }
    public void setTransportation(Transportation transportation){
        this.transportation = transportation;
    }
    public void setArrival(Date arrival){
        this.arrival = arrival;
    }
    public void setDeparture(Date departure){
        this.departure = departure;
    }
    
    /**
     * Returns length of activities
     * @return activities.size()
     */
    public int numActivities(){
        return activities.size();
    }

    /**
     * This method calculates the total cost of the waypoint
     * @return waypointCost
     */
    public double calcWaypointCost(){
        double total = 0;

        //loops through all activities, gets hotel and transportation cost
        for (Activity a : activities) {
            total += a.getCost();
        }
        total += hotel.getStayPerNight() * hotel.getCostPerNight();
        total += transportation.getCost();
        
        return total;
    }


    public String toString(){
        String retString = "";
        int i = 0;

        //gets the transportaion info

        retString += "Transportation\n" + transportation.toString();

        //gets the hotel info if we are staying at a hotel
        if (hotel.getStayAtHotel() == true) {
            retString += "\nHotel\n" + hotel.toString();
        } else {
            retString += "\n\tStaying at hotel?\tNo\n";
        }

        //gets the name and desc of the waypoint
        retString += "Waypoint place: " + getPlace() + "\n\tDescription: " + getDesc() + "\n";
        retString += "Arrival Date: " + getArrival() + "\tDeparture Date: " + getDeparture() + "\n";


        //loop that will go thorugh all activiites
        for (Activity a : activities) {
            i++;
            retString += "Activity (" + i + ")\n";
            retString += "\t" + a.toString() + "\n";
        }
        
        return retString;
    }
    
}




