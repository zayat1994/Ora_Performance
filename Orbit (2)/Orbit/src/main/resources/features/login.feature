Feature: This feature covers login and the reporting functionality
      Scenario: Login to ORA

      Given user is navigated to Mytools login page

      When user clicks on username field
      And user enters username
      And user clicks on password field
      And user enters password
      And user clicks on login button
      And User clicks on ORA
      Then New tab is opened

      Scenario: Customer selection and checking Reporting Dashboard

#       Given user is navigated to ORA

      Given user clicks on customer list
      When user clicks on select customer list
      And user selects the customer the goodyear
      Then user is navigated to the selected customer

            Scenario: Site Availability report
                  Given user clicks on Availability SLA
                  When  user clicks on Site Availability
                  Then user is navigated to Site Availability report
            Scenario: Site Availability Trend
                  Given user clicks on Availability SLA
                  When  user clicks on Site Availability Trend
                  Then user is navigated to Site Availability Trend report
            Scenario: Path Availability Report
                  Given user clicks on Availability SLA
                  When  user clicks on Path Availability
                  Then user is navigated to Path Availability report
      Scenario: GTTR_Incidents
            Given user clicks on Incidents
            When  user clicks on GTTR
            Then user is navigated to GTTR report

      Scenario: DTTR_Incidents
            Given user clicks on Incidents
            When  user clicks on DTTR
            Then user is navigated to DTTR report

      Scenario: Incident Types
            Given user clicks on Incidents
            When  user clicks on Incident Types
            Then user is navigated toIncident Types report
      Scenario: Inventory tab
            Given user clicks on Inventory
            Then user is navigate to Inventory report

      Scenario:RTD report
            Given user clicks on Performance SLA
            When user clicks on RTD
            Then user is navigated to RTD report
      Scenario:PLR report
            Given user clicks on Performance SLA
            When user clicks on PLR
            Then user is navigated to PLR report

      Scenario:JITTER report
            Given user clicks on Performance SLA
            When user clicks on JITTER
            Then user is navigated to JITTER report
#
      Scenario: Total Volume Capacity report
            Given user clicks on Capacity
            When user clicks on Total Volume
            Then user is navigated to Total Volume Capacity report

      Scenario: BW Usage Capacity report
            Given user clicks on Capacity
            When user clicks on BW Usage
            Then user is navigated to BW Usage Capacity report

      Scenario: Recurring Top 5 Sites Capacity report
            Given user clicks on Capacity
            When user clicks on Recurring Top 5 Sites
            Then user is navigated to Recurring Top 5 Sites Capacity report

#

      Scenario: Self Service Reporting Publication
            Given user clicks on Self Service
            When user click on Reporting Publication
            Then user is navigated to Reporting Publication

      Scenario: Self Service Incidents Data Quality
            Given user clicks on Self Service
            When user click on Data Quality
            And user clicks on Incidents Data Quality
            Then user is navigated to Incidents Data Quality

      Scenario: Self Service Site Availability Data Quality
            Given user clicks on Self Service
            When user click on Site Availability Data Quality
            Then user is navigated to Site Availability Data Quality

      Scenario: Self Service Path Availability Data Quality
            Given user clicks on Self Service
            When user click on Path Availability Data Quality
            Then user is navigated to Path Availability Data Quality

      Scenario: Self Service Path Performance Data Quality
            Given user clicks on Self Service
            When user click on Path Performance Data Quality
            Then user is navigated to Path Performance Data Quality

      Scenario: Self Service Data Quality Bulk Operations Incidents
            Given user clicks on Self Service
            When user click on Data Quality Bulk Operations
            And user clicks Bulk Operations Incidents
            Then user is navigated toData Quality Bulk Operations Incidents

      Scenario: Self Service Manage Toposite
            Given user clicks on Self Service
            When user click on Manage Toposite
            Then user is navigated to Manage Toposite


      Scenario: Self Service Threshold Management Site Availability

            Given user clicks on Self Service
            When user Threshold Management
            And user clicks on Threshold Management Site Availability
            Then user is navigated to Threshold Management Site Availability

      Scenario: Self Service Threshold Management Path Availability
            Given user clicks on Self Service
            When user clicks on Threshold Management Path Availability
            Then user is navigated to Threshold Management Path Availability

      Scenario: Self Service Threshold Management Path Performance
            Given user clicks on Self Service
            When user clicks on Threshold Management Path Performance
            Then user is navigated to Threshold Management Path Performance
      Scenario: Self Service Threshold Management GTTR
            Given user clicks on Self Service
            When user clicks on Threshold Management GTTR
            Then user is navigated to Threshold Management GTTR

      Scenario: Self Service Threshold Management Bulk Operations Site Availability
            Given user clicks on Self Service
            When user clicks on Threshold Management Bulk Operations
            And user click on Threshold Management Bulk Operations Site Availability
            Then user is navigated to Threshold Management Bulk Operations Site Availability

      Scenario: Self Service Threshold Management Bulk Operations Path Availability
            Given user clicks on Self Service

            When user click on Threshold Management Bulk Operations Path Availability
            Then user is navigated to Threshold Management Bulk Operations Path Availability


      Scenario: Self Service Threshold Management Bulk Operations Path Performance
            Given user clicks on Self Service

            When user click on Threshold Management Bulk Operations Path Performance
            Then user is navigated to Threshold Management Bulk Operations Path Performance

      Scenario: Self Service Threshold Management Bulk Operations GTTR
            Given user clicks on Self Service

            When user click on Threshold Management Bulk Operations GTTR
            Then user is navigated to Threshold Management Bulk Operations GTTR


      Scenario: Self Service Threshold Management Bulk Operations DTTR
            Given user clicks on Self Service

            When user click on Threshold Management Bulk Operations DTTR
            Then user is navigated to Threshold Management Bulk Operations DTTR

      Scenario: Self Service Executive Report
            Given user clicks on Self Service

            When user click on Executive Report
            Then user is navigated to Executive Report

      Scenario: Self Service B2G Microsoft
            Given user clicks on Self Service

            When user click on B2G Microsoft
            Then user is navigated to B2G Microsoft

      Scenario: Self Service RAAS
            Given user clicks on Self Service

            When user click on RAAS
            Then user is navigated to RAAS


      Scenario: BT Global Traffic
      Given user clicks on Analytics
      When user clicks on Communication and Collaboration
      And user clicks on BT
      And user clicks on Global Traffic
      Then user is navigated to Global Traffic

            Scenario: Asset Management Overview
                  Given user clicks on Analytics
                  When user clicks on generic process
                  And user click on Asset Management
                  Then user is navigated to overview
