package src;

import java.util.*;

public class Hotel {
    /*Variables*/
    private double costPerNight;
    private String name;
    private String desc;
    private int stayPerNight;
    private boolean stayAtHotel;
    private Date checkin;
    private Date checkout;

    /*Constructors*/
    public Hotel(){}
    public Hotel(double costPerNight , String name, String desc, int stayPerNight, boolean stayAtHotel, Date checkin, Date checkout){
        this.costPerNight = costPerNight;
        this.name = name;
        this.desc = desc;
        this.stayPerNight = stayPerNight;
        this.stayAtHotel = stayAtHotel;
        this.checkin = checkin;
        this.checkout = checkout;
    }
    
    /*Getters*/
    public double getCostPerNight() {
        return costPerNight;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    public int getStayPerNight() {
        return stayPerNight;
    }
    public boolean getStayAtHotel(){
        return stayAtHotel;
    }
    public Date getCheckin(){
        return checkin;
    }
    public Date getCheckout(){
        return checkout;
    }
    
    
    /*Setters*/
    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setStayPerNight(int stayPerNight) {
        this.stayPerNight = stayPerNight;
    }
    public void setStayAtHotel(boolean stayAtHotel){
        this.stayAtHotel = stayAtHotel;
    }
    public void setCheckin(Date checkin){
        this.checkin = checkin;
    }
    public void setCheckout(Date checkout){
        this.checkout = checkout;
    }

    /*returns a string description of this object*/
    public String toString(){
        if(stayAtHotel){
            return "\tName: " + getName() + "\tCost per Night: " + getCostPerNight() 
                    + ", Nights Spent: " + getStayPerNight() + "\n\tDescription: " + getDesc()
                    + "\n\tCheckin: " + getCheckin() + "\tCheckout: " + getCheckout() + "\n";
        }
        else{
            return "No Hotel chosen\n";
        }
    }


}