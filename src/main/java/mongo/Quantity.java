package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Quantity {

    public Quantity(Float number, Unit unit) {
        this.number = number;
        this.unit = unit;
    }

    private Float number;

    @DBRef
    private Unit unit;

}
