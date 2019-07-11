package db;

import db.sqlite.SqliteConnector;

public class ConnectorFactory {

    public static Connector byName(String dbTypeName) {
        if ("SQLite".equals(dbTypeName)) {
            return new SqliteConnector();
        } else {
            throw new UnsupportedOperationException(String.format("Not supported db type: %s", dbTypeName));
        }
    }

}
