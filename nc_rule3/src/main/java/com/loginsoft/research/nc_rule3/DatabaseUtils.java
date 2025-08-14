package com.loginsoft.research.nc_rule3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {

    public Connection connect(String url) throws SQLException {
        System.out.println("[DB] Connecting to DB: " + url);
        return DriverManager.getConnection(url); // throws SQLException
    }

    public void executeQuery(Connection conn, String sql) throws SQLException {
        System.out.println("[DB] Executing query: " + sql);
        Statement stmt = conn.createStatement();
        stmt.execute(sql); // throws SQLException
    }

    public void connectAndExecute(String url, String sql) throws SQLException {
        Connection conn = connect(url);
        executeQuery(conn, sql);
    }
}
