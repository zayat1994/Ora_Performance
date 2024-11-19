package org.example.Utils;

import org.example.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ORA_MAIN_VARIABLES {

    private static String Menu_name, Report_type, SLA_KPI;
    private static long start_time;
    private static long finish_time;
    private static int ICO01;
    private static final LocalDateTime Report_Date = LocalDateTime.now();;
    private static long timeElapsed = finish_time - start_time;


    public static LocalDateTime getReport_Date() {
        return Report_Date;

    }

    public void setMenuName(String Menu) {
        Menu_name = Menu;

    }

    public static String getMenu_name() {
        return Menu_name;
    }


    public void setReport_type(String reportType) {
        Report_type = reportType;

    }

    public static String getReport_type() {
        return Report_type;
    }

    public void setStart_time() {
        start_time = System.nanoTime();

    }

    public static long getStart_time() {
        return start_time;

    }

    public void setFinish_time() {

        finish_time = (long) (System.nanoTime()/1e6);
    }

    public static long getFinish_time() {
        return finish_time;

    }

    public void setTimeElapsed() {
        timeElapsed = (long) ((finish_time - start_time)/ 1e6);

    }

    public static long getTimeElapsed() {

        return timeElapsed;
        // return timeElapsed;
    }

    public void setICO01(int ico01) {
        ICO01 = ico01;

    }

    public static int getICO01() {
        return ICO01;

    }

    public void setSlaKpi(String slaKpi) {
        SLA_KPI = slaKpi;

    }

    public static String getSlaKpi() {
        return SLA_KPI;
    }

public void Scroll_Down()
{
    WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 20);
    new Actions(TestBase.driver)
            .scrollFromOrigin(scrollOrigin, 0, 250)
            .perform();
}
Wait wait=new Wait();

    public void Swich_Iframe()
    {

     try {

         // Find all iframes on the page
         List<WebElement> iframes = TestBase.driver.findElements(By.tagName("iframe"));

         // Check if there are at least two iframes
         if (iframes.size() > 1) {
             // Switch to the second iframe
System.out.println("size = "+iframes.size());


             TestBase.driver.switchTo().frame(iframes.get(1)); // Index 1 for the second iframe

             // Define the wait
             WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(60));

             // Wait until the link with the specified partial link text is available
             String partialLinkText = "Calls Duration Per Source Country "; // Replace with the actual partial text
             wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(partialLinkText)));



             // Save the content to a file



         }
         String iframeContent = TestBase.driver.getPageSource();

         try (FileWriter writer = new FileWriter("iframeContent.html")) {
                writer.write(iframeContent);
            } catch (IOException e) {
                e.printStackTrace();
            }

     } catch (Exception e) {
         e.printStackTrace();
     }
     }


//    public void Swich_Iframe()
//    {
//        try {
//
//            // Wait for the iframe to be available by index
//            int iframeIndex =2 ; // Change this to your desired index
//            WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(60));
//            wait.until(new ExpectedCondition<Boolean>() {
//                public Boolean apply(WebDriver d) {
//                    return d.findElements(By.tagName("iframe")).size() >= iframeIndex;
//                }
//            });
//
//            // Switch to the iframe by index
//            TestBase.driver.switchTo().frame(iframeIndex);
//System.out.println("hi"+iframeIndex);
//            String iframeContent = TestBase.driver.getPageSource();
//
//            // Save the content to a file
//            try (FileWriter writer = new FileWriter("iframeContent.html")) {
//                writer.write(iframeContent);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//
//
//        } finally {
//
//        }
//
//}
    public void Swichframe_js()
    {
        List<WebElement> iframes = TestBase.driver.findElements(By.tagName("iframe"));

        // Check if there are at least two iframes
        if (iframes.size() > 1) {
            // Switch to the second iframe using JavaScript
            WebElement secondIframe = iframes.get(1); // Index 1 for the second iframe
            JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
            js.executeScript("arguments[0].contentWindow.focus();", secondIframe);
            TestBase.driver.switchTo().frame(secondIframe);
    }

    }

    public void Leave_iframe()
    {
        TestBase.driver.switchTo().defaultContent();

    }
public void Scroll_Down_Element(WebElement element)
{
    ((JavascriptExecutor) TestBase.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);

}


    public void Swich_Iframe(WebElement iframe1,WebElement iframe2)
    {
//        wait.waitUntilElementPresenceXpath(iframe1);
        try {
            wait.waitUntilElementPresenceID(iframe1);
            TestBase.driver.switchTo().frame(iframe1);


        } catch (Exception e) {
            e.printStackTrace();
        }
try {
         wait.waitUntilElementPresenceXpath(iframe2);
    TestBase.driver.switchTo().frame(iframe2);

    System.out.println("iframe2= "+iframe2.getText());
} catch (Exception e) {

    e.printStackTrace();
}





    }


}
