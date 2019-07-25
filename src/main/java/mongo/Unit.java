package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Document(collection = "units")
public class Unit {

    @Id
    private String fullName;

    private String abbreviation;


    public Unit() {
        super();
    }

    public Unit(String fullName, String abbreviation) {
        super();
        this.fullName = fullName;
        this.abbreviation = abbreviation;
    }

//    public Unit(UUID id, String abbreviation, String fullName) {
//        this.id = id;
//        this.abbreviation = abbreviation;
//        this.fullName = fullName;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Objects.equals(abbreviation, unit.abbreviation) &&
                Objects.equals(fullName, unit.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abbreviation, fullName);
    }
}
