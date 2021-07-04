//this file is to test the entire maintrip object

package src;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class tripTester {

    //this temporary  method tests the main trip object and prints the info out to STDUOUT
    public static void main(String[] args) throws ParseException{
        Scanner scanS = new Scanner(System.in);
        System.out.println("THIS IS A TEST\n--------------------------------------");

        System.out.print("enter in the starting date(dd/mm/yyyy): ");
        String sDate1 = scanS.nextLine();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        //Wed Jan 01 00:00:00 EST 2020      Mon Apr 20 00:00:00 EDT 2020
        System.out.print("enter in the ending date(dd/mm/yyyy): ");
        sDate1 = scanS.nextLine();
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);



        String dummyS = "01/01/2020";
        Date dummy = new SimpleDateFormat("dd/MM/yyyy").parse(dummyS);

        //creates ONE waypoint without transportation info
        Hotel placeOfStay = new Hotel(100, "hotel 100", "it is 5 stars", 5, true, dummy, dummy);
        Transportation transportation = new Transportation(180, "Rental Car", "Gonna be a long ride",dummy ,dummy);
        ArrayList<Activity> List = new ArrayList<Activity>();
        Activity act1 = new Activity(200, "the movies", "Make sure its a good movie", dummy, dummy);
        Activity act2 = new Activity(200, "the clubs", "Leave Late at night", dummy, dummy);
        Activity act3 = new Activity(200, "scuba diving", "some of us may not join", dummy, dummy);
        /*Make a method for this*/
        List.add(act1);
        List.add(act2);
        List.add(act3);
        Waypoint w = new Waypoint("Alberta", "Its gonna be so fun.", placeOfStay, List, transportation,dummy,dummy);

        //creates list of waypoints and adds the waypoint to the list
        ArrayList<Waypoint> tripTest = new ArrayList<Waypoint>();
        tripTest.add(w);
        tripTest.add(w);

        //adds the list to the main trip object
        MainTrip trip = new MainTrip(1000, tripTest, date1, date2, 8);

        System.out.println(trip.toString());
    }

    private static boolean isWithinRange(Date date3, MainTrip trip) {
        return !(date3.before(trip.getStartDate()) || date3.after(trip.getEndDate()));
    }

}
