package mongo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quantity {

    public Quantity(Float number, Unit unit) {
        this.number = number;
        this.unit = unit;
    }

    private Float number;
    private Unit unit;

}
