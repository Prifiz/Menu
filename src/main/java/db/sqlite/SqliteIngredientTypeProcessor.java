package db.sqlite;

import db.IngredientTypeProcessor;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteIngredientTypeProcessor implements IngredientTypeProcessor {

    private Connection connection;

    public SqliteIngredientTypeProcessor(Connection connection) {
        this.connection = connection;
        createNewTable();
    }

    private void createNewTable() {

        String sql = "CREATE TABLE IF NOT EXISTS ingredient_types (\n"
                + " id integer PRIMARY KEY,\n"
                + " name text NOT NULL\n"
                + ");";

        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addIngredientType(String typeName) {

    }
}
