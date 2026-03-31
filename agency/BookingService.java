package agency;

import trip.Pricable;

import java.math.BigDecimal;
import java.util.List;

public class BookingService {

    public BigDecimal calculateTotal(List<Pricable> services) {
        BigDecimal total = BigDecimal.ZERO;

        for (Pricable service : services) {
            total = total.add(service.calculateCost());
        }

        return total;
    }
}