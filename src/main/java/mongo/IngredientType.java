package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
public class IngredientType {

    @Id
    private UUID id;

    private String name;

    public IngredientType() {}

    public IngredientType(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "IngredientType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
