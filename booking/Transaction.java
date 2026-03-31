package booking;
import java.math.BigDecimal;
public class Transaction{
    protected BigDecimal amount;
    public Transaction(BigDecimal a){amount=a;
    }
    public BigDecimal getAmount(){return amount;}
}