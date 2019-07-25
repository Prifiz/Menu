package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Document
public class ProductType {

    @Id
    private String name;

    public ProductType() {
        super();
    }

    public ProductType(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "name='" + name + '\'' +
                '}';
    }
}
