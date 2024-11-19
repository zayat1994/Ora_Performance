package org.example.database;
import org.example.Utils.ORA_MAIN_VARIABLES;
import org.example.base.TestBase;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

import javax.swing.text.html.parser.Entity;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Properties;


public class DatabaseConnection {




    public static void Open_Connection()
    {
        ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
        String Host=TestBase.properties.getProperty("DB_Host");

        String url = Host;
        String user=TestBase.properties.getProperty("DB_username");
        String password=TestBase.properties.getProperty("DB_password");



        try  {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String query = "INSERT INTO ora.performance_calculation (Report_Date, Start_Time, End_Time,Loading_Time,ICO01,Menu_Name,Report_Type,`SLA/KPI`) " +

                       "VALUES (?,?,?,?,?,?,?,?);";

            PreparedStatement preparedStatement=connection.prepareStatement(query);

            preparedStatement.setTimestamp(1, Timestamp.valueOf((variables.getReport_Date())));
            preparedStatement.setLong(2, variables.getStart_time());
            preparedStatement.setLong(3, variables.getFinish_time());
            preparedStatement.setLong(4,variables.getTimeElapsed());
            preparedStatement.setInt(5,variables.getICO01());
            preparedStatement.setString(6,variables.getMenu_name());
            preparedStatement.setString(7,variables.getReport_type());
            preparedStatement.setString(8,variables.getSlaKpi());
            System.out.println(query);

            int rowAffected=preparedStatement.executeUpdate();





        } catch (SQLException  e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }




    }



    }

