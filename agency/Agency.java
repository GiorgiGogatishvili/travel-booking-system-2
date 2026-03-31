package agency;
import java.util.*;
import booking.*;
import trip.*;
public class Agency{
    private String name;
    private List<Trip> trips;
    private Map<String,Booking> bookings;
    static{System.out.println("Agency loaded");
    }

    public Agency(String n,List<Trip> t,Map<String,Booking> b){
        name=n;trips=t;bookings=b;
    }

    public String toString(){
        return name;
    }
}