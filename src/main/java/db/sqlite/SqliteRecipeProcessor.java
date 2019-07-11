package db.sqlite;

import db.RecipesProcessor;
import entities.Recipe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class SqliteRecipeProcessor implements RecipesProcessor {

    private Connection connection;

    public SqliteRecipeProcessor(Connection connection) {
        this.connection = connection;
        createNewTable();
    }

    private void createNewTable() {
        // SQLite connection string
        // FIXME change for recipes
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS recipes (\n"
                + " id integer PRIMARY KEY,\n"
                + " name text NOT NULL,\n"
                + " capacity real\n"
                + ");";

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void insert(String name, double capacity) {
        String sql = "INSERT INTO employees(name, capacity) VALUES(?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, capacity);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    private void selectAll() {
        String sql = "SELECT * FROM employees";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addRecipe(String dishName, Recipe recipe) {

    }

    @Override
    public Collection<Recipe> findByDishname(String dishName) {
        return null;
    }
}
