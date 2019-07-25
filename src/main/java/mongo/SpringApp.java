package mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringApp implements CommandLineRunner {

    @Autowired
    ProductTypeRepository productTypeRepository;

    @Autowired
    UnitRepository unitRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    DishRepository dishRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        fillProductTypes();

        fillUnits();

        fillProducts();

        fillDishes();
    }

    private void fillProductTypes() {
        productTypeRepository.deleteAll();
        productTypeRepository.save(new ProductType("Fruit"));

        productTypeRepository.findAll().forEach(
                System.out::println
        );
    }

    private void fillDishes() {
        Dish simpleTea = new Dish("Tea");
        dishRepository.save(simpleTea);
        Optional<Dish> foundTea = dishRepository.findById("Tea");
        foundTea.ifPresent( tea -> {
            tea.addRecipe(new Recipe());
        });
    }

    private void fillProducts() {
        productRepository.save(new Product(new ProductType("Fruit"), "Apple"));
        productRepository.save(new Product(new ProductType("Fruit"), "Pear"));
    }

    // FIXME how to auto generate new uuid but not to duplicate existing data?
    private void fillUnits() {

        unitRepository.save(new Unit("kilogram", "kg"));
        unitRepository.save(new Unit("gram", "g"));

    }

}
