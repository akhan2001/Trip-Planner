package src;

import java.util.*;

public class Transportation {
    //variables
    private double Cost;
    private String type;
    private String desc;
    private Date arrival;
    private Date departure;

    //constructors
    public Transportation() {}
    public Transportation(double Cost, String type , String desc, Date arrival, Date departure) {
        this.Cost = Cost;
        this.desc = desc;
        this.type = type;
        this.arrival = arrival;
        this.departure = departure;
    }

    //getters
    public double getCost() {
        return Cost;
    }
    public String getType() {
        return type;
    }
    public String getDesc() {
        return desc;
    }
    public Date getArrival(){
        return arrival;
    }
    public Date getDeparture(){
        return departure;
    }


    //setters
    public void setCost(double cost) {
        Cost = cost;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }
    public void setDeparture(Date departure){
        this.departure = departure;
    }

    //to String
    public String toString(){
        return "\tType: " + getType() + "\tCost: " + getCost() + "\tDesc: " + getDesc() 
        + "\n\tDeparture: " + getDeparture() + "\tArrival: " + getArrival() + "\n";
    }
}