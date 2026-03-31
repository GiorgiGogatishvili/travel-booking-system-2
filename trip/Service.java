package trip;

import java.math.BigDecimal;

public abstract class Service implements Pricable {

    protected String name;
    protected BigDecimal price;

    public Service(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}