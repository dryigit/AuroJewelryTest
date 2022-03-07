package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPageStepDefinitions {
LoginPage loginPage = new LoginPage();
@When("kullanıcı Auro Jewelry sayfasına ulaşır")
public void kullanıcı_auro_jewelry_sayfasına_ulaşır() {
	Driver.getDriver().get(ConfigReader.getProperty("siteUrl"));

}
@Then("menüde bulunan login butonuna tıklar")
public void menüde_bulunan_login_butonuna_tıklar() {
loginPage.loginButton.click();

}
@Then("hesabına başarılı bir şekilde giriş yapar")
public void hesabına_başarılı_bir_şekilde_giriş_yapar() {
loginPage.login.click();

}

@Then("doğru {string} ve {string} girer")
public void doğruVeGirer(String kullaniciAdi, String sifre) {
	
	kullaniciAdi="fatih.can";
	sifre= "Aurojewel1!";
	loginPage.usernameBox.sendKeys(kullaniciAdi);
	loginPage.passwordBox.sendKeys(sifre);
}
}
