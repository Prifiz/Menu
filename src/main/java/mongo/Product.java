package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Product {

    @Id
    private String name;

    @DBRef
    private ProductType productType;

    public Product() {}

    public Product(ProductType productType, String name) {
        this.productType = productType;
        this.name = name;
    }
}
