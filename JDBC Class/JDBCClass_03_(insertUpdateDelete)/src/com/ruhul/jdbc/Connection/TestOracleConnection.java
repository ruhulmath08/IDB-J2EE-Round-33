package com.ruhul.jdbc.Connection;

import java.sql.Connection;

public class TestOracleConnection {
    public static void main(String[] args) {
        Connection conn = OracleDBConnection.getConnections("xe", "hr", "hr");
    }
}
