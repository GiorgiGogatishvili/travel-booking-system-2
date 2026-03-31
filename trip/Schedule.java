package trip;
import java.util.*;
import java.time.*;

public class Schedule {
    private LocalDate date;
    private List<Pricable> services;
    public Schedule(LocalDate d,List<Pricable> s){
        if(s==null||s.isEmpty())
            throw new ScheduleException("Empty");
        date=d; services=s;
    }
    public List<Pricable> getServices(){
        return services;
    }
}