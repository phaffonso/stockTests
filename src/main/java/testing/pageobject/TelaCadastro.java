package testing.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TelaCadastro {

	private WebElement 
		txtNome, 
		txtSku, 
		txtDescription,
		btnCadastro,
		btnExcluir;
	
	private Select selUnidade, selCategoria;
	
	private WebDriver driver;
	
	public TelaCadastro(WebDriver driver){
		this.driver = driver;
		
		this.txtNome = 			driver.findElement(By.name("nomeMateriaPrima"));
		this.txtSku = 			driver.findElement(By.name("skuMateriaPrima"));
		this.selUnidade = 		new Select(driver.findElement(By.name("unidadeMateriaPrima")));
		this.selCategoria = 	new Select(driver.findElement(By.name("categoriaMateriaPrima")));
		this.txtDescription = 	driver.findElement(By.name("observacaoMateriaPrima"));
		this.btnCadastro =		driver.findElement(By.name("btnCadastrarMateriaPrima"));
		this.btnExcluir = 		driver.findElement(By.name("btnExcluirMateriaPrima"));
	}

	public WebElement getTxtNome() {
		return txtNome;
	}

	public WebElement getTxtSku() {
		return txtSku;
	}

	public WebElement getTxtDescription() {
		return txtDescription;
	}

	public WebElement getBtnCadastro() {
		return btnCadastro;
	}

	public WebElement getBtnExcluir() {
		return btnExcluir;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public Select getSelUnidade() {
		return selUnidade;
	}

	public Select getSelCategoria() {
		return selCategoria;
	}

	
}
