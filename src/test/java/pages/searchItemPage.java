package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class searchItemPage extends TestBase {
	
	@FindBy(xpath="//li[@class='preview']")
	WebElement item;
	@FindBy(xpath="//li[@class='preview']")
	WebElement item1;
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	WebElement addtoCart;
public searchItemPage() {
	PageFactory.initElements(driver, this);
	
}
public boolean isItemListed() {
	return item.isDisplayed();
	
}
public void selectItem() throws InterruptedException
{
	Thread.sleep(2000);
	item.click();
}
public void addtoCart() throws InterruptedException {
	Thread.sleep(4000);
	addtoCart.click();	
}
}
