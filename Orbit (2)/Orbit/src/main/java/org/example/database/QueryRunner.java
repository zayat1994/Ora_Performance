package org.example.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryRunner {
    public static List<Map<String, String>> executeQuery(Connection connection, String query) {
        List<Map<String, String>> resultList = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // If the connection is established, proceed with the query execution
            if (connection != null) {
                pstmt = connection.prepareStatement(query);
                rs = pstmt.executeQuery();

                // Get metadata to retrieve column names dynamically
                ResultSetMetaData rsMetaData = rs.getMetaData();
                int columnCount = rsMetaData.getColumnCount();

                // Iterate over the result set
                while (rs.next()) {
                    // Print each column dynamically
                    Map<String, String> row = new HashMap<>();
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = rsMetaData.getColumnName(i);
                        String columnValue = rs.getString(i);  // Get the value of the column
                        //System.out.println(columnName + ": " + columnValue);
                        row.put(columnName, columnValue);
                    }
                    resultList.add(row);
                }
            } else {
                System.out.println("Connection to SQL Server failed.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Ensure resources are closed in the reverse order of their creation
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
        return resultList;
    }
}
