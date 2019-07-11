package db.sqlite;

import db.Connector;
import db.DatabaseConstants;
import db.RecipesProcessor;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnector implements Connector {

    private String url = "jdbc:db:" + getDatabaseFilePath();

    private String getDatabaseFilePath() {
        return "C:/db/" + DatabaseConstants.DATABASE_NAME;
    }

    private Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private void createEmptyDatabase() {

        File dbFile = new File(getDatabaseFilePath());
        if (dbFile.exists() && dbFile.isFile()) {
            return;
        }
        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void initDatabase() {
        createEmptyDatabase();
    }


    @Override
    public RecipesProcessor getRecipesProcessor() {
        return new SqliteRecipeProcessor(getConnection());
    }
}
