package trip;
import java.math.BigDecimal;

public class Taxibooking extends Service implements Transport{
    public Taxibooking(String n,BigDecimal p){
        super(n,p);
    }
    public BigDecimal calculateCost(){return price;}
    public String getTransportType(){return "Taxi";}
}