//package org.example.stepDefinitions;
//
//import org.example.Utils.ORA_MAIN_VARIABLES;
//import org.example.Utils.Wait;
//import org.example.pages.Reporting_Dashboard;
//
//public class Reporting_Dashboard_StepDef {
//ORA_MAIN_VARIABLES variables=new ORA_MAIN_VARIABLES();
//    Reporting_Dashboard reportingDashboard=new Reporting_Dashboard();
//Wait wait=new Wait();
//    public long open_reportind_dashboard()
//    {
//        variables.Report_type="Reporting";
//        variables.Menu_name="Dashboard";
//        variables.start_time = System.nanoTime();
//        reportingDashboard.Click_Dashboard_Tab();
//        variables.finish_time = System.nanoTime();
//        long Dashboard_time = wait.Elapsed_time_calculator( variables.start_time,variables.finish_time);
//        System.out.println(Dashboard_time);
//
//        insert data fel db
//        return Dashboard_time;
//
//
//    }
//}
