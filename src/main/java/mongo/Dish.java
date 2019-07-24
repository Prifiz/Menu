package mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.UUID;

@Getter
@Setter
public class Dish {

    @Id
    private String dishName;

    private Collection<UUID> recipeIds;
}
