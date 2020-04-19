package matimony.matrimony.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editppPOM extends BaseTest{
	
	public editppPOM(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='idEmail']")
    private WebElement MatriID;
	public WebElement getMatriID() {
		return MatriID;
	}
	
	@FindBy(id="passwordClear1")
	private WebElement PasswordClear;
	public WebElement getPasswordClear() {
		return PasswordClear;
	}
	
	
	@FindBy(id="password1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}

	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement Login_btn;
	public WebElement getLogin_btn() {
		return Login_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Skip to My Matrimony >>')]")
	private WebElement InterMediate_page;
	public WebElement getInterMediate_page() {
		return InterMediate_page;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Skip to Daily Matches >>')]")
	private WebElement InterMediate_page1;	
	public WebElement getInterMediate_page1() {
		return InterMediate_page1;
	}

	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
	private WebElement Menu_btn;
	public WebElement getMenu_btn() {
		return Menu_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img")
	private WebElement Menu_btn1;
	public WebElement getMenu_btn1() {
		return Menu_btn1;
	}
	
	@FindBy(xpath="//a[contains(text(),'Edit Profile')]")
	private WebElement Edit_Profile;
	public WebElement getEdit_Profile() {
		return Edit_Profile;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Edit Partner Preference')]")
	private WebElement Edit_Partner_Preference;
	public WebElement getEdit_Partner_Preference() {
		return Edit_Partner_Preference;
	}
	
	@FindBy(xpath="//a[@class='editIcon font12 clr6']")
	private WebElement PP_Edit_btn;	
	public WebElement getPP_Edit_btn() {
		return PP_Edit_btn;
	}
	
	
	@FindBy(id="gothram")
	private WebElement PP_Gothram_DropDown;
	public WebElement getPP_Gothram_DropDown() {
		return PP_Gothram_DropDown;
	}
	
	

	@FindBy(xpath="//span[contains(text(),'Gothram - ')]//following::span[1]")
	private WebElement PP_Gothram_Value;
	public WebElement getPP_Gothram_Value() {
		return PP_Gothram_Value;
	}
	
    @FindBy(xpath="//span[contains(text(),'Gothram')]//following::span[2]")
    private WebElement PI_Gothram_Value;
	public WebElement getPI_Gothram_Value() {
		return PI_Gothram_Value;
	}
	
	
	@FindBy(id="Manage_StrictPP")
	private WebElement Strict_PP_btn;	
	public WebElement getStrict_PP_btn() {
		return Strict_PP_btn;
	}
	
	@FindBy(xpath="//label[@for='Strict_Gothram']")
	private WebElement Strict_PP_Gothram;
	public WebElement getStrict_PP_Gothram() {
		return Strict_PP_Gothram;
	}
	
	
	@FindBy(id="strictppflag")
	private WebElement Strict_PP_Save;
	public WebElement getStrict_PP_Save() {
		return Strict_PP_Save;
	}

	@FindBy(xpath="(//a[contains(text(),'Search')])[1]")
	private WebElement Search;
	public WebElement getSearch() {
		return Search;
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Advanced')])[2]")
	private WebElement Advanced_Search;
	public WebElement getAdvanced_Search() {
		return Advanced_Search;
	}
	
	@FindBy(id="gothramTemp")
	private WebElement Gotram_dropDown;
	public WebElement getGotram_dropDown() {
		return Gotram_dropDown;
	}
	
	
	@FindBy(id="btnSubmit")
	private WebElement Edit_PP_Save;	
	public WebElement getEdit_PP_Save() {
		return Edit_PP_Save;
	}

	
	
	@FindBy(id="gothram")
	private WebElement Gothram_selected_Value;
	public WebElement getGothram_selected_Value() {
		return Gothram_selected_Value;
	}
	
	@FindBy(id="lookingStatus1")
	private WebElement unmarried;
	public WebElement getunmarried() {
		return unmarried;
	}
	

	@FindBy(id="lookingStatus2")
	private WebElement widow;
	public WebElement getwidow() {
		return widow;
	}
	
	@FindBy(id="lookingStatus3")
	private WebElement divorced;
	public WebElement getdivorced() {
		return divorced;
	}
	
	@FindBy(id="lookingStatus4")
	private WebElement seprated;
	public WebElement getseprated() {
		return seprated;
	}
	
	@FindBy(id="lookingStatus0")
	private WebElement doesntmatter;
	public WebElement getdoesntmatter() {
		return doesntmatter;
	}
	
	
	@FindBy(id="physicalStatus2")
	private WebElement phydoest;
	public WebElement getphydoest() {
		return phydoest;
	}
	
	@FindBy(id="physicalStatus0")
	private WebElement phynormal;
	public WebElement getphynormal() {
		return phynormal;
	}
	
	@FindBy(id="physicalStatus1")
	private WebElement physicalchaleng;
	public WebElement getphysicalchaleng() {
		return physicalchaleng;
	}
	
	
	
	@FindBy(id="manglik3")
	private WebElement mangdoesntmat;
	public WebElement getmangdoesntmat() {
		return mangdoesntmat;
	}
	
	@FindBy(id="manglik1")
	private WebElement mangyes;
	public WebElement getmangyes() {
		return mangyes;
	}@FindBy(id="manglik2")
	private WebElement mangno;
	public WebElement getmangno() {
		return mangno;
	}
	
	
	@FindBy(id="eatingHabits1")
	private WebElement eatingHabits1;
	public WebElement geteatingHabits1() {
		return eatingHabits1;
	}
	
	@FindBy(id="eatingHabits2")
	private WebElement eatingHabits2;
	public WebElement geteatingHabits2() {
		return eatingHabits2;
	}
	
	
	@FindBy(id="eatingHabits3")
	private WebElement eatingHabits3;
	public WebElement geteatingHabits3() {
		return eatingHabits3;
	}
	
	@FindBy(id="eatingHabits4")
	private WebElement eatingHabits4;
	public WebElement geteatingHabits4() {
		return eatingHabits4;
	}
	
	@FindBy(id="eatingHabits0")
	private WebElement eatingHabits0;
	public WebElement geteatingHabits0() {
		return eatingHabits0;
	}
	
	@FindBy(id="smokingHabits1")
	private WebElement smokingHabits1;
	public WebElement getsmokingHabits1() {
		return smokingHabits1;
	}
	
	@FindBy(id="smokingHabits2")
	private WebElement smokingHabits2;
	public WebElement getsmokingHabits2() {
		return smokingHabits2;
	}
	@FindBy(id="smokingHabits3")
	private WebElement smokingHabits3;
	public WebElement getsmokingHabits3() {
		return smokingHabits3;
	}
	@FindBy(id="smokingHabits0")
	private WebElement smokingHabits0;
	public WebElement getsmokingHabits0() {
		return smokingHabits0;
	}
	
	@FindBy(id="drinkingHabits1")
	private WebElement drinkingHabits1;
	public WebElement getdrinkingHabits1() {
		return drinkingHabits1;
	}
	
	@FindBy(id="drinkingHabits2")
	private WebElement drinkingHabits2;
	public WebElement getdrinkingHabits2() {
		return drinkingHabits2;
	}
	
	@FindBy(id="drinkingHabits3")
	private WebElement drinkingHabits3;
	public WebElement getdrinkingHabits3() {
		return drinkingHabits3;
	}
	@FindBy(id="drinkingHabits0")
	private WebElement drinkingHabits0;
	public WebElement getdrinkingHabits0() {
		return drinkingHabits0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
