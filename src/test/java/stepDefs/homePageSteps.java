package stepDefs;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.searchItemPage;

public class homePageSteps extends TestBase {
	HomePage homepage;
	searchItemPage searchPage;
	@Given("user on home page")
	public void user_on_home_page() {
	   initialize(); 
	}
	@When("User search an Item {string}")
	public void user_search_an_item(String strItem) {
	  homepage=new HomePage();
	homepage.searchItem(strItem);
	
	}
	@Then("Item must be displayed")
	public void item_must_be_displayed() throws InterruptedException {
		searchPage=new 	searchItemPage();
		//  searchPage.isItemListed();
		  searchPage.selectItem();
		  searchPage.addtoCart();
	}

}
