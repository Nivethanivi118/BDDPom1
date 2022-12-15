package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
@FindBy(name="searchbar")
WebElement search;
@FindBy(id="button-search")
WebElement searchBtn;
@FindBy(id="login")
WebElement Login;
@FindBy(id="cart")
WebElement Cart;

public HomePage()
{
	PageFactory.initElements(driver, this);

}
public void searchItem(String Item)
{
	search.sendKeys(Item);
	searchBtn.click();
}
}
