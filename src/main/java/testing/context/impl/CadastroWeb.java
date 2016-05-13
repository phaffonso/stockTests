package testing.context.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import testing.context.Cadastro;

public class CadastroWeb implements Cadastro{

	public boolean erro;
	
	private WebDriver driver;
	
	public CadastroWeb(){
		System.out.println("starting this shit");
		System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		System.out.println("driver created");
		driver.get("http://www.google.com");
		System.out.println("after get");
	}
	
	public void preenche(){
		
	}

	public void envia() {
		System.out.println("commence envoyer");
		
		this.erro = true;
		
		WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        System.out.println("aguardando");
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
		
		this.erro = false;
	}
	
	public void finaliza(){
		driver.quit();
	}
	
	

}
