package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class RepoPage extends TestBase {

	@FindBy(css = "[id='admin_user_email']")
	private WebElement username;

	@FindBy(css = "[id='admin_user_password']")
	private WebElement password;

	@FindBy(css = "[id='admin_user_submit_action']")
	private WebElement LoginButton;

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productbutton;

	@FindBy(xpath = "//a[text()='New Product']")
	private WebElement newProduct;

	@FindBy(css = "#product_title")
	private WebElement Title;

	@FindBy(css = "#product_sku")
	private WebElement Sku;

	@FindBy(css = "#product_description")
	private WebElement Description;

	@FindBy(css = "[value='Create Product']")
	private WebElement CreatNewProduct;

	@FindBy(xpath = "//div[text()='Product was successfully created.']")
	private WebElement newProductIsCreated;

	@FindBy(xpath = "//h2[text()='Test_Automation_Engineer']")
	private WebElement Test_Automation_Engineer_Dispalyed;

	@FindBy(xpath = "	//a[text()='Created At']")
	private WebElement created_At_Display;

	@FindBy(xpath = "//a[text()='Updated At']")
	private WebElement updated_At_Display;

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement Edit_Product;

	@FindBy(css = "#product_submit_action")
	private WebElement updated_new_TextProduct;

	@FindBy(xpath = "//div[text()='Product was successfully updated.']")
	private WebElement newProductIsUpdated;

	@FindBy(xpath = "//a[text()='Delete']")
	private WebElement delete_Product;

	@FindBy(xpath = "//div[text()='Product was successfully destroyed.']")
	private WebElement newProductIsdestroyed;

	
	
	
	public RepoPage() {
		PageFactory.initElements(Driver, this);
	}
	
	
	

	public void enter_username(String Username) {
		username.sendKeys(Username);
	}

	public void enter_password(String PassWord) {
		password.sendKeys(PassWord);
	}

	public void click_on_loginbutton() {
		LoginButton.click();
	}

	public void click_on_productButton() {
		productbutton.click();
	}

	public void click_on_newProduct() {
		newProduct.click();
	}

	public void enter_text_in_Title(String title) {
		Title.sendKeys(title);
	}

	public void enter_text_in_Sku(String Su) {
		Sku.sendKeys(Su);
	}

	public void enter_text_in_Description(String Desc) {
		Description.sendKeys(Desc);
	}

	public void click_On_new_CreatProduct() {
		CreatNewProduct.click();
	}

	public boolean clickOn_newproductSuccesfully() {
		return newProductIsCreated.isDisplayed();
	}

	public boolean TestAutomation_EngineerDispalyedonBoard() {
		return Test_Automation_Engineer_Dispalyed.isDisplayed();
	}

	public boolean created_At_DisplayIn_ProductPAge() {
		return created_At_Display.isDisplayed();
	}

	public boolean updated_At_DisplayIn_ProductPAge() {
		return updated_At_Display.isDisplayed();
	}

	public void click_on_Edit_Product() {
		Edit_Product.click();
	}

	public void clearText() {
		Title.clear();
		Sku.clear();
		Description.clear();
	}

	public void updated_new_TextProduct_Click() {
		updated_new_TextProduct.click();
	}

	public boolean new_Product_Is_Updated() {
		return newProductIsUpdated.isDisplayed();
	}

	public void delete_product() {
		delete_Product.click();
	}

	public boolean newProductIsdestroyedSuccesfully() {
		return newProductIsdestroyed.isDisplayed();
	}

}
