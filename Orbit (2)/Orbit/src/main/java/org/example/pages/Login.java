package org.example.pages;


import org.example.base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Set;

public class Login {

Customer_list customerList=new Customer_list();
        @FindBy(id = "user")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"spanLinkValidForm\"]")
    WebElement loginButton;


    @FindBy(xpath = "//*[@id=\"tabapplis\"]/tbody/tr[3]/td[2]/a")
    WebElement Ora_int_url;

    public Login() {
        PageFactory.initElements(TestBase.getDriver(), this);
        TestBase.loadCredentialsPropertyFile();
    }

    public void MytoolsLoginPage() {
        TestBase.getDriver().navigate().to("https://self.sso.infra.ftgroup/logingassifaible.jsp?activateWindows=true&TYPE=33554433&REALMOID=06-000ad14a-2fb1-1b71-8d9e-e8be0aaad064&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=$SM$oZTcp9kVJA%2flPMtmsn9zkq6Iw0B6Jp5IWpl68ZLAVXeSQkGVKLmdn732MFgqX%2bJw&TARGET=$SM$HTTPS%3a%2f%2fself%2esso%2einfra%2eftgroup%2fAuthForm%2fredirect%2ejsp%3fRETURN%3dhttps$%3A$%2F$%2Fself%2esso%2einfra%2eftgroup$%2FAuthForm$%2Fredirect%2ejsp$%3FRETURN$%3D");

    }


    public void clickOnUsernameField() {
        username.click();
    }

    public void enterUsername(String username) {
        this.username.sendKeys(username);
    }

    public void clickOnPasswordField() {
        password.click();
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void clickOn_ORA() throws InterruptedException {
        Ora_int_url.click();

    }

    public void Swich_tab() {
        try {
            String parent = TestBase.driver.getWindowHandle();
            Set<String> s = TestBase.driver.getWindowHandles();
            java.util.Iterator<String> I1 = s.iterator();
            while (I1.hasNext()) {

                String child_window = I1.next();

                if (!parent.equals(child_window)) {
                    TestBase.driver.switchTo().window(child_window);

                    System.out.println(""+TestBase.driver.getTitle());
                    break;

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


//        Object[] windowHandles=TestBase.driver.getWindowHandles().toArray();
//        TestBase.driver.switchTo().window((String) windowHandles[1]);
//        //assert on title of new window
//        String title=TestBase.driver.getTitle();
////        assertEquals("Simple Page",title);
//        System.out.println("title= "+title);
//        // TestBase.driver.switchTo().window((String) windowHandles[0]);
//       //  TestBase.driver.close();
//        //TestBase.driver.switchTo().window((String) windowHandles[1]);
//        // Assert.assertEquals("ooooooooooooooooo",TestBase.driver.getTitle());
    }
}
