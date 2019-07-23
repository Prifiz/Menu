package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class IngredientType {

    @Id
    private String id;

    private String name;

    public IngredientType() {}

    public IngredientType(String id, String name) {
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
