package mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class SpringApp implements CommandLineRunner {

    @Autowired
    IngredientTypeRepository repository;

    @Autowired
    UnitRepository unitRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();
        repository.save(new IngredientType(UUID.randomUUID(), "Fruit"));

        repository.findAll().forEach(
                System.out::println
        );

        fillUnits();
    }

    // FIXME how to auto generate new uuid but not to duplicate existing data?
    private void fillUnits() {
        if (unitRepository.findAll().isEmpty()) {
            unitRepository.save(new Unit(UUID.randomUUID(), "kg", "kilogram"));
            unitRepository.save(new Unit(UUID.randomUUID(), "g", "gram"));
        }
    }

}
