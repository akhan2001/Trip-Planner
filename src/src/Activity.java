package src;

import java.util.*;

public class Activity {
    //variables
    private double cost;
    private String name;
    private String desc;
    private Date startTime;
    private Date endTime;

    /*Constructors*/
    public Activity(){}
    public Activity(double cost, String name, String desc, Date startTime, Date endTime){
        this.cost = cost;
        this.name = name;
        this.desc = desc;
        this.startTime = startTime;
        this.endTime = endTime;
        
    }

    /*Getter methods*/
    public double getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public Date getStartTime(){
        return startTime;
    }
    public Date getEndTime(){
        return endTime;
    }
    
    /*Setter methods*/
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }

    //to String method that returns object info
    public String toString(){
        return "Name: " + getName() + "\tCost: $" + getCost() + "\n\tDescription: " + getDesc()
                + "\n\tStart time: " + getStartTime() + "\tEnd time: " + getEndTime();
    }

}