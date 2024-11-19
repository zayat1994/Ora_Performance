package org.example.Utils;

import org.example.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Wait {

    public void implicitWait(int waitTime) {
        TestBase.getDriver().manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }

    public void waitUntilElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
        element.click();
    }

    public void waitUntilElementIsVisible(WebElement element, int waitTime) {
        WebDriverWait wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementIsNotVisible(WebElement element, int waitTime) {
        WebDriverWait wait = new WebDriverWait(TestBase.getDriver(), Duration.ofSeconds(waitTime));
        wait.pollingEvery(Duration.ofMillis(10));
        wait.until(driver -> {
            try {
                 return wait.until(ExpectedConditions.invisibilityOf(element));
            } catch (NoSuchElementException | StaleElementReferenceException e) {
                return e;
            }
        });
    }

    public void waitUntilElementPresenceCSS(WebElement element)
    {
       WebDriverWait wait=new WebDriverWait(TestBase.getDriver(),Duration.ofSeconds(60));

        WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(String.valueOf(element))));


    }

    public void waitUntilElementPresenceXpath(WebElement element)
    {
        WebDriverWait wait=new WebDriverWait(TestBase.getDriver(),Duration.ofSeconds(60));

        WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.valueOf(element))));


    }

    public void waitUntilElementPresenceID(WebElement element)
    {
        WebDriverWait wait=new WebDriverWait(TestBase.getDriver(),Duration.ofSeconds(60));

        WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(String.valueOf(element))));


    }

    public void waitTimeout()
    {
        TestBase.getDriver().manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
    }


}



