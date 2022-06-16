import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.net.WWWFormCodec;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.sql.Driver;

public class LearningLocators {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://hrm.anhtester.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());

        String userName = "//input[@id = 'iusername']";
        String passWord = "//input[@id = 'ipassword']";
        String login = "//button[normalize-space() = 'Login']";

        String language = "//img[@src = 'https://hrm.anhtester.com/public/uploads/languages_flag/vn.gif']";
        String languageEnglish = "//span[text() = 'English']";

        String menuProject = "//a[@href = 'https://hrm.anhtester.com/erp/projects-list']";

        String addProject = "//a[@href = '#add_form' and @class = 'collapsed btn waves-effect waves-light btn-primary btn-sm m-0']";

        String titleProject = "//input[@name = 'title']";
        String clientProject = "//span[@id = 'select2-client_id-container']";
        String selectClientProject = "(//input[@role='searchbox'])[2]";
        String estimateHourProject = "//input[contains (@placeholder, 'Estimated Hour')]";
        String priorityProject = "(//span[@class='select2-selection__arrow'])[2]";
        String selectPriorityPJ = "//span[@class='select2-search select2-search--dropdown']/child::input";
        String startDatePJ = "//input[@placeholder = 'Start Date']";
        String submitStartDatePJ = "(//button[@class='dtp-btn-ok btn btn-flat btn-primary btn-sm' and text() = 'OK'])[1]";
        String endDatePJ = "//input[@placeholder = 'End Date']";
        String submitEndDatePJ = "(//button[@class='dtp-btn-ok btn btn-flat btn-primary btn-sm' and text() = 'OK'])[2]";
        String sumamryPJ = "//textarea[@placeholder = 'Summary']";
        String teamPJ = "//span[@class='select2-selection select2-selection--multiple']";
        String savePJ = "//button//span[@class='ladda-label' and normalize-space()='Save']";

        String iframe = "//iframe[@title = 'Editable area. Press F10 for toolbar.']";

        String description = "//html//body";

        // Login
        WebElement inputUserName = driver.findElement(By.xpath(userName));
        WebElement inputPassword = driver.findElement(By.xpath(passWord));
        WebElement buttonLogin = driver.findElement(By.xpath(login));
        inputUserName.sendKeys("admin01");
        Thread.sleep(1000);
        inputPassword.sendKeys("123456");
        Thread.sleep(2000);
        buttonLogin.click();
        Thread.sleep(4000);

        //Project page
        WebElement selectLanguage = driver.findElement(By.xpath(language));
        WebElement selectLanguageEnglish = driver.findElement(By.xpath(languageEnglish));
        selectLanguage.click();
        Thread.sleep(2000);

        selectLanguageEnglish.click();
        Thread.sleep(3000);

        WebElement selectProjectMenu = driver.findElement(By.xpath(menuProject));
        selectProjectMenu.click();
        Thread.sleep(2000);

        WebElement buttonAddProject = driver.findElement(By.xpath(addProject));
        buttonAddProject.click();
        Thread.sleep(2000);

        WebElement inputTitleProject = driver.findElement(By.xpath(titleProject));
        inputTitleProject.sendKeys("Touring Project");
        Thread.sleep(2000);

        WebElement droplistClientProject = driver.findElement(By.xpath(clientProject));
        droplistClientProject.click();
        Thread.sleep(2000);
        WebElement inputClientProject = driver.findElement(By.xpath(selectClientProject));
        inputClientProject.sendKeys("Lam", Keys.ENTER);
        Thread.sleep(1000);

        WebElement inputEstimateHourProject = driver.findElement(By.xpath(estimateHourProject));
        inputEstimateHourProject.sendKeys("6.5");
        Thread.sleep(2000);

        WebElement droplistPriorityProject = driver.findElement(By.xpath(priorityProject));
        droplistPriorityProject.click();
        Thread.sleep(2000);
        WebElement inputPriorityPJ = driver.findElement(By.xpath(selectPriorityPJ));
        inputPriorityPJ.sendKeys("Normal", Keys.ENTER);
        Thread.sleep(1000);

        WebElement datePicStartDatePJ = driver.findElement(By.xpath(startDatePJ));
        datePicStartDatePJ.click();
        Thread.sleep(2000);
        WebElement buttonSubmitStartDatePJ = driver.findElement(By.xpath(submitStartDatePJ));
        buttonSubmitStartDatePJ.click();
        Thread.sleep(1000);

        WebElement datePicEndDatePJ = driver.findElement(By.xpath(endDatePJ));
        datePicEndDatePJ.click();
        Thread.sleep(2000);
        WebElement buttonSubmitEndDatePJ = driver.findElement(By.xpath(submitEndDatePJ));
        buttonSubmitEndDatePJ.click();
        Thread.sleep(1000);

        WebElement inputSummaryPJ = driver.findElement(By.xpath(sumamryPJ));
        inputSummaryPJ.sendKeys("Testing automation");
        Thread.sleep(2000);

        WebElement inputTeamPJ = driver.findElement(By.xpath(teamPJ));
        inputTeamPJ.sendKeys("Admin 01",Keys.ENTER);
        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.xpath(iframe)));
        Thread.sleep(1000);
        WebElement inputDescription = driver.findElement(By.xpath(description));
        inputDescription.sendKeys("testing");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        WebElement buttonSavePJ = driver.findElement(By.xpath(savePJ));
        buttonSavePJ.click();
        Thread.sleep(4000);



        /*
        // paging

        driver.findElement(By.xpath("//select[@name = 'xin_table_length']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//option[text() = '50']")).click();
        Thread.sleep(4000);

        // view detail

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[4]/td[1]/div")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='xin_table']/tbody/tr[4]/td[1]/div/span[1]/a/button/i")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href = 'https://hrm.anhtester.com/erp/projects-list']")).click();
        Thread.sleep(2000);

        // delete

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[4]/td[1]/div")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[4]/td[1]/div/span[2]/button/i")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text() = 'Close' and @class = 'btn btn-light']")).click();
        Thread.sleep(2000);




         */

        // add new project



//        driver.findElement(By.xpath("//html//body")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html//body")).sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page");
//        Thread.sleep(2000);


















        driver.quit();

    }
}
