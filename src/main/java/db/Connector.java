package db;

public interface Connector {
    void initDatabase();
    RecipesProcessor getRecipesProcessor();
}
