package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
public class Unit {

    @Id
    private UUID id;

    private String abbreviation;
    private String fullName;

    public Unit() {
    }

    public Unit(UUID id, String abbreviation, String fullName) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.fullName = fullName;
    }
}
