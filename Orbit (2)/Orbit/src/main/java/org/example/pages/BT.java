package org.example.pages;

import org.example.Utils.Wait;
import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BT {
    Wait wait=new Wait();
    public void Analytics_page_factory()
    {
        PageFactory.initElements(TestBase.getDriver(), this);

    }
     @FindBy(xpath = "//a[@id='navbarDropdown']")
    WebElement Analytics;

@FindBy(xpath = "//a[normalize-space()='Communication & Collaboration usage']")
    WebElement Communication_Collaboration;

@FindBy(xpath = "//a[@class='nav-link current-page']")
    WebElement BT;

public    @FindBy(id = "iframe")
    WebElement iframe1;

//public @FindBy(xpath ="//*[@id=\"iframe\"]")
//
//    WebElement iframe1;

public @FindBy(xpath="//*[@id=\"main\"]/div/app-pbix-viewer-page/div/div/div/iframe")


WebElement iframe2;
//<iframe id="iframe" src="https://ora.sso.infra.ftgroup/ORAReports/powerbi/SINGLE_REPORT/BT?rs:embed=true&amp;filter=ora_accounts_customer/hashed_ico01 eq '1b742ae215adf18b75449c6e272fd92d'" allowfullscreen="true" style="
//    border: none;
//    width:100%;
//    min-height:800px;"></iframe>

//
//    @FindBy(xpath = "//*[@id=\"main\"]/div/app-pbix-viewer-page/div/div/div/iframe")
//    WebElement iframe3;
//    <iframe frameborder="0" seamless="seamless" class="viewer pbi-frame" title="Power BI Report Viewer" src="https://ora.sso.infra.ftgroup:443/powerbi/?id=6c23bd8e-3156-4eb4-be1c-9da0b90415f5&amp;formatLocale=en-US&amp;filter=ora_accounts_customer%2Fhashed_ico01%20eq%20'1b742ae215adf18b75449c6e272fd92d'&amp;telemetryConfigConnectionString=InstrumentationKey%3Dc340f563-d557-44f7-bda6-695de40dca59%3BIngestionEndpoint%3Dhttps%3A%2F%2Feastus-8.in.applicationinsights.azure.com%2F%3BLiveEndpoint%3Dhttps%3A%2F%2Feastus.livediagnostics.monitor.azure.com%2F"></iframe>
//

@FindBy(partialLinkText = "Global Traffic")
WebElement Global_Traffic;
//@FindBy(xpath = "/html/body/div[1]/ui-view/div/div/div/div/div/div/exploration-container/div/div/docking-container/div/div/div/div/exploration-host/div/div/exploration/div/explore-canvas/div/div[2]/div/div[2]/div[2]/visual-container-repeat/visual-container[10]/transform/div/div[2]/div/div/visual-modern/div/svg/g/g[1]/path")
//WebElement Global_Traffic;
@FindBy(partialLinkText ="Offnet Traffic" )
WebElement OffnetTraffic;

@FindBy(partialLinkText = "Trunk Traffic")
 WebElement TrunkTraffic;

@FindBy(partialLinkText = "BT Data")
WebElement BT_Data;

    public void Click_Analytics()
    {
        Analytics.click();
        wait.implicitWait(30);

    }

    public void Click_Communication_Collaboration()
    {
        Communication_Collaboration.click();
        wait.waitTimeout();

    }

    public void Click_BT()
    {
        BT.click();
    }
//
//    public void Swich_Iframe()
//    {
//        wait.waitUntilElementPresenceXpath(iframe1);
//        TestBase.driver.switchTo().frame(iframe1);
//        wait.waitUntilElementPresenceCSS(iframe2);
//        TestBase.driver.switchTo().frame(iframe2);
//
//
//        //switch To IFrame using index
////        driver.switchTo().frame(0);
//
//
//        //leave frame
////        driver.switchTo().defaultContent();
//    }



    public void Click_GlobalTraffic()
    {

        Global_Traffic.click();
        wait.waitTimeout();
    }

    public void Click_OffnetTraffice()
    {
        OffnetTraffic.click();
        wait.waitTimeout();
    }

    public void TrunkTraffic()
    {
        TrunkTraffic.click();
        wait.waitTimeout();

    }
public void BTData()
{
    BT_Data.click();
    wait.waitTimeout();

}

}
