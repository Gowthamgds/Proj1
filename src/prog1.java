import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1 {
    public static void main(String[] args)
    {
        System.setProperty("web driver.chrome.driver","C:\\Users\\USER\\IdeaProjects\\Proj1\\chromedriver.exe");
        WebDriver chromeBrowser=new ChromeDriver();
        chromeBrowser.navigate().to("https://www.instagram.com/?hl=en");

    }
}
