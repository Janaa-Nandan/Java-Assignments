package Learnmaxxing.Assignment_Classes_and_Objects_and_Constructors;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class FlightDTO {
    private static int flightcount = 0;
    private static String flightname;
    private static LocalDate takeoffdate;
    private static LocalTime takeofftime;
    private static LocalTime landingtime;
    private static int ticketrate;
    public static ArrayList<FlightDTO> flights = new ArrayList<>();
    public FlightDTO(String flightname,LocalDate takeoffdate,LocalTime takeofftime,LocalTime landingtime, int ticketrate){
        this.flightname = flightname;
        this.takeoffdate = takeoffdate;
        this.takeofftime = takeofftime;
        this.landingtime = landingtime;
        this.ticketrate = ticketrate;
        flights.add(flightcount,this);
        this.flightcount++;
    }

    public static String getFlightname() {
        return flightname;
    }

    public static void setFlightname(String flightname) {
        FlightDTO.flightname = flightname;
    }

    public static LocalDate getTakeoffdate() {
        return takeoffdate;
    }

    public static void setTakeoffdate(LocalDate takeoffdate) {
        FlightDTO.takeoffdate = takeoffdate;
    }

    public static LocalTime getTakeofftime() {
        return takeofftime;
    }

    public static void setTakeofftime(LocalTime takeofftime) {
        FlightDTO.takeofftime = takeofftime;
    }

    public static LocalTime getLandingtime() {
        return landingtime;
    }

    public static void setLandingtime(LocalTime landingtime) {
        FlightDTO.landingtime = landingtime;
    }

    public static int getTicketrate() {
        return ticketrate;
    }

    public static void setTicketrate(int ticketrate) {
        FlightDTO.ticketrate = ticketrate;
    }
    public static int getFlightcount(){
        return flightcount;
    }
}
