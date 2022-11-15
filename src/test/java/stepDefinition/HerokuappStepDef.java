package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RepoPage;
import utility.TestBase;

public class HerokuappStepDef extends TestBase {
	RepoPage pg;

	public HerokuappStepDef() {
		super();
	}

	@Given("^User is on the product page$")
	public void user_is_on_the_product_page() {
		initialization();
		pg = new RepoPage();
		pg.enter_username(prop.getProperty("UserName"));
		pg.enter_password(prop.getProperty("Password"));
		pg.click_on_loginbutton();
		pg.click_on_productButton();

	}

	@When("^User Creat a New Product$")
	public void user_creat_a_new_product() {
		pg.click_on_newProduct();
		pg.enter_text_in_Title(prop.getProperty("Title"));
		pg.enter_text_in_Sku(prop.getProperty("Sku"));
		pg.enter_text_in_Description(prop.getProperty("Description"));
		pg.click_On_new_CreatProduct();
	}

	@Then("^Verify that the user created a new product$")
	public void verify_that_the_user_created_a_new_product() {
		boolean actual = pg.clickOn_newproductSuccesfully();
		boolean expected = pg.TestAutomation_EngineerDispalyedonBoard();
		Assert.assertEquals(actual, expected);

	}

	@When("^User Listed the product$")
	public void user_listed_the_product() {
		pg.created_At_DisplayIn_ProductPAge();
		pg.updated_At_DisplayIn_ProductPAge();
	}

	@Then("^Verify that the user listed the product$")
	public void verify_that_the_user_listed_the_product() {
		boolean actual = pg.created_At_DisplayIn_ProductPAge();
		boolean expected = pg.updated_At_DisplayIn_ProductPAge();
		Assert.assertEquals(actual, expected);
	}

	@When("^User Update the product$")
	public void user_update_the_product() {
		pg.click_on_Edit_Product();
		pg.clearText();
		pg.enter_text_in_Title(prop.getProperty("UpdatedTitle"));
		pg.enter_text_in_Sku(prop.getProperty("UpdatedSku"));
		pg.enter_text_in_Description(prop.getProperty("UpdatedDescription"));
		pg.updated_new_TextProduct_Click();
	}

	@Then("^Verify that the user updated the product$")
	public void verify_that_the_user_updated_the_product() {
		boolean Actual = pg.new_Product_Is_Updated();
		Assert.assertTrue(Actual);

	}

	@When("^User Delet the product$")
	public void user_delet_the_product() {
		pg.delete_product();
		Driver.switchTo().alert().accept();
	}

	@Then("^Verify that the user Deleted the product$")
	public void verify_that_the_user_deleted_the_product() {
		boolean Actual = pg.newProductIsdestroyedSuccesfully();
		Assert.assertTrue(Actual);
	}

	@And("^Close the Browser$")
	public void close_the_browser() {
		Driver.close();
	}

}
