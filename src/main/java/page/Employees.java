package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Employees {

    public final WebDriver driver;

    public Employees(final WebDriver driver) {
        this.driver = driver;
    }

    public void clickDropDown() {
        driver.findElement(By.id("")).click();
    }

    public void clickCheckBox() {
        driver.findElement(By.id("")).click();
    }

    public boolean getCheckBoxStatus() {
        return driver.findElement(By.id("")).isSelected();
    }

    public void clickButton() {
        driver.findElement(By.id("btn")).click();
    }

    public String getStringFromTextField() {
        return driver.findElement(By.id("listBoxSelected")).getText();
    }
}
