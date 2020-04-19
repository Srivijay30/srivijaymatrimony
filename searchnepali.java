package matimony.matrimony.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.Set;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class searchnepali extends BaseTest {
	Actions acc;
	String marital_statuswid;
	WebDriver driver;
	String marital_statusany;
	 String marital_statussep;
	String marital_statusdiv;
	@BeforeMethod
	public void setup() throws MalformedURLException {
	

		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();

		}
	
	
	
	
	@Test
	public void setup6() throws Throwable {
		
		searchPOM g = new searchPOM(driver);
		 acc = new Actions(driver);
		//Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;

			
		Thread.sleep(3000);
		driver.get("https://www.nepalimatrimony.com");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "nep140707");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		
		Thread.sleep(3000);
		BaseTest.click(g.getLogin_btn());
		
		try {
			Thread.sleep(3000);
			BaseTest.click(g.getInterMediate_page());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				BaseTest.click(g.getInterMediate_page1());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e) {
				
			}
			
			Thread.sleep(20000);

			
			try {
				Robot robot = new Robot();
				
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				driver.switchTo().alert().accept();

			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(20000);
			
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			
			Thread.sleep(5000);
            try {
				driver.findElement(By.xpath("//a[text()='My Home']")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(5000);

			driver.findElement(By.xpath("(//a[@class='active'])[1]")).click();
			Thread.sleep(5000);
			
			try {
				driver.findElement(By.xpath("//a[text()='Search']")).click();
			} catch (Exception e) {
				System.out.println("5");
			}
			Thread.sleep(7000);
			try {
				driver.findElement(By.xpath("//a[text()='Search']")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(4000);

			try {
				driver.findElement(By.xpath("//a[text()='Search']")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
			// age///
			BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatasearch("Sheet1", 1, 1));
			Thread.sleep(5000);
			BaseTest.select_text(g.getageTo(), BaseTest.getExcelDatasearch("Sheet1", 1, 2));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatasearch("Sheet1", 1, 3));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatasearch("Sheet1", 1, 4));
			Thread.sleep(5000);
			
			///marital status//
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			String marital_status = BaseTest.getExcelDatasearch("Sheet1", 1, 0);
			if (marital_status.contains("Unmarried")&&!g.getunmarried().isSelected()) {
				 BaseTest.click(g.getunmarried());
				 System.out.println("unmarried selected");
				 Thread.sleep(5000);

				}
			
			marital_statuswid = BaseTest.getExcelDatasearch("Sheet1", 1, 23);

			if (marital_statuswid.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
					 BaseTest.click(g.getwidow());
					 System.out.println("widow selected");
					 
					 marital_statusdiv = BaseTest.getExcelDatasearch("Sheet1", 1, 24);

				} if (marital_statusdiv.contains("Divorced")&&!g.getdivorced().isSelected()) {
					 BaseTest.click(g.getdivorced());
					 System.out.println("divorced selected");
					 
					// marital_statusany = BaseTest.getExcelDatasearch("Sheet1", 1, 25);

				//} if (marital_statusany.contains("Any")&&!g.getany().isSelected()) {
					// BaseTest.click(g.getany());
					 //System.out.println("Any selected");
					 

				}
				try {
					 marital_statussep = BaseTest.getExcelDatasearch("Sheet1", 1, 25);

						if (marital_statussep.contains("Separated")&&!g.getseprated().isSelected()) {
							 BaseTest.click(g.getseprated());
							 System.out.println("seprated selected");
						}else {
							
						}	
				} catch (Exception e) {
					// TODO: handle exception
				}
				 	
			
			/// children//
				try {
					String children = BaseTest.getExcelDatasearch("Sheet1", 1, 26);
					if (children.contains("No")&&!g.gethaveChildren1().isSelected()) {
						 BaseTest.click(g.gethaveChildren1());
						 System.out.println("No children selected");
						 
							
						}else if (children.contains("Yes, Living together")&&!g.gethaveChildren2().isSelected()) {
							 BaseTest.click(g.gethaveChildren2());
							 System.out.println("Yes, Living together selected");
							 
						}else if (children.contains("Yes, Not living together")&&!g.gethaveChildren3().isSelected()) {
							 BaseTest.click(g.gethaveChildren3());
							 System.out.println("Yes, Not living together  selected");
							 
						}else if (children.contains("Doesn't matter")&&!g.gethaveChildren4().isSelected()) {
							 BaseTest.click(g.gethaveChildren4());
							 System.out.println("Profiles i have blocked selected");
						}else {
							
						}				
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			///religion for pak///
			try {
				BaseTest.select_text(g.getreli(), BaseTest.getExcelDatasearch("Sheet1", 1, 21));

			
			
			
			///clan for pak//
			WebElement element55 = driver.findElement(By.id("casteTemp"));
			Select Selector55 = new Select(element55);
		    Selector55.getFirstSelectedOption();
		    String textval=Selector55.getFirstSelectedOption().getText();
		    
		    
			acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 22)+"')]")));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
//////// mother tounge////////////
			//WebElement menu = driver.findElement(By.id("motherTongueTemp"));
				//WebElement	option = menu.findElement(By.xpath("//option[@title='Hindi']"));

					//acc.doubleClick(option).perform();
		driver.findElement(By.id("motherTongueTemp")).click();
		Thread.sleep(5000);
					
		acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 6)+"')]")));
					
		acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 11 )+"')]")));
			
		acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 9 )+"')]")));			

		
		String shwoprofilewith = BaseTest.getExcelDatasearch("Sheet1", 11, 0);
		if (shwoprofilewith.contains("photo")&&!g.getphotoOpt().isSelected()) {
			 BaseTest.click(g.getphotoOpt());
			 System.out.println("photo selected");
			 
				
			}else if (shwoprofilewith.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
				 BaseTest.click(g.gethoroscopeOpt());
				 System.out.println("horoscope selected");
				 
			}else {
				
			}
		
		////dont show///
		String dnotshow = BaseTest.getExcelDatasearch("Sheet1", 1, 12);
		if (dnotshow.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
			 BaseTest.click(g.getalreadyContOpt());
			 System.out.println("profile already contacted selected");
			 
				
			}else if (dnotshow.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
				 BaseTest.click(g.getalreadyViewedOpt());
				 System.out.println("Profiles already viewed selected");
				 
			}else if (dnotshow.contains("Shortlisted profiles ")&&!g.getshortlistOpt().isSelected()) {
				 BaseTest.click(g.getshortlistOpt());
				 System.out.println("Shortlisted profiles  selected");
				 
			}else if (dnotshow.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
				 BaseTest.click(g.getignoredOpt());
				 System.out.println("Profiles i have blocked selected");
			}else if (dnotshow.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
				 BaseTest.click(g.getigOpt());
				 System.out.println("Profiles i have ignored selected");
			}else {
				
			}				
		
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(5000);
		
		//// advance search////
		
		
		
		try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("(//a[@class='active'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Advanced']")).click();
			Thread.sleep(5000);
			
			BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatasearch("Sheet1", 1, 1));
			Thread.sleep(5000);
			BaseTest.select_text(g.getageTo(), BaseTest.getExcelDatasearch("Sheet1", 1, 2));
			Thread.sleep(5000);
		
			BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatasearch("Sheet1", 1, 3));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatasearch("Sheet1", 1, 3));
			Thread.sleep(5000);
			
			
			String marital_statusadv = BaseTest.getExcelDatasearch("Sheet1", 1, 0);
			if (marital_statusadv.contains("Unmarried")&&!g.getunmarried().isSelected()) {
				 BaseTest.click(g.getunmarried());
				 System.out.println("unmarried selected");
				 
					
				}else if (marital_statusadv.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
					 BaseTest.click(g.getwidow());
					 System.out.println("widow selected");
					 
				}else if (marital_statusadv.contains("Divorced")&&!g.getdivorced().isSelected()) {
					 BaseTest.click(g.getdivorced());
					 System.out.println("divorced selected");
					 
				}else if (marital_statusadv.contains("Any")&&!g.getany().isSelected()) {
					 BaseTest.click(g.getany());
					 System.out.println("Any selected");
				}else if (marital_statusadv.contains("Seprate")&&!g.getseprated().isSelected()) {
					 BaseTest.click(g.getseprated());
					 System.out.println("seprated selected");
				}else {
					
				}
			
			///----
			
			
			try {
				BaseTest.select_text(g.getreli(), BaseTest.getExcelDatasearch("Sheet1", 1, 21));

			
			
			
			///clan for pak and bran/den for sri//
			WebElement element55 = driver.findElement(By.id("casteTemp"));
			Select Selector55 = new Select(element55);
		    Selector55.getFirstSelectedOption();
		    String textval=Selector55.getFirstSelectedOption().getText();
		    
		    
			acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 22)+"')]")));
			} catch (Exception e) {
				// TODO: handle exception
			}
			acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 6)+"')]")));

			
			///phy status///
			
			String physicalstatus = BaseTest.getExcelDatasearch("Sheet1", 0, 5);
			if (physicalstatus.contains("Doesn't matter")&&!g.getphysicaldsntm().isSelected()) {
				 BaseTest.click(g.getphysicaldsntm());
				 System.out.println("physical status doesntmatter selected");
				 
					
				}else if (physicalstatus.contains("Normal")&&!g.getphyscialnorma().isSelected()) {
					 BaseTest.click(g.getphyscialnorma());
					 System.out.println("Physical status normal selected");
					 
				}else if (physicalstatus.contains("Physically Challenged")&&!g.getphysicalphychangleed().isSelected()) {
					 BaseTest.click(g.getphysicalphychangleed());
					 System.out.println("Physically Challenged  selected");
					 
				}else {
					
				}
			
			
			try {
				driver.findElement(By.id("gothram")).sendKeys("Testgothram");
			
			
			
			
			WebElement element = driver.findElement(By.id("starTemp"));
			Select Selector = new Select(element);
		    Selector.getFirstSelectedOption();
		    
		    
			acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 14)+"')]")));
             
			///manglik///
			
			
			
			
//			WebElement elements = driver.findElement(By.id("countryTemp"));
//			Select Selectors = new Select(elements);
//		    Selectors.getFirstSelectedOption();
//			
//			acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 13)+"')]")));

			String manglik = BaseTest.getExcelDatasearch("Sheet1", 1, 7);
			if (manglik.contains("Doesn't matter")&&!g.getdoshamfield().isSelected()) {
				 BaseTest.click(g.getdoshamfield());
				 System.out.println("manglik doesntmatter selected");
				 
					
				}else if (manglik.contains("Yes")&&!g.getdoshamyes().isSelected()) {
					 BaseTest.click(g.getdoshamyes());
					 System.out.println("Manglik yes selected");
					 
				}else if (manglik.contains("No")&&!g.getdoshamno().isSelected()) {
					 BaseTest.click(g.getdoshamno());
					 System.out.println("Manglik no  selected");
					 
				}else {
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			///
			WebElement elementf = driver.findElement(By.id("countryTemp"));
			Select Selectorf = new Select(elementf);
		    Selectorf.getFirstSelectedOption();
		    String textvalf=Selectorf.getFirstSelectedOption().getText();
		    
		    
			acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 13)+"')]")));
             
			//////resident status////
			
			String RS = BaseTest.getExcelDatasearch("Sheet1", 0, 15);
			if (RS.contains("Any")&&!g.getrsany().isSelected()) {
				 BaseTest.click(g.getrsany());
				 System.out.println("Resident status any selected");
				 
					
				}else if (RS.contains("citizen")&&!g.getrscitizen().isSelected()) {
					 BaseTest.click(g.getrscitizen());
					 System.out.println("Resident status citizen selected");
					 
				}else if (RS.contains("Permanent resident")&&!g.getrspr().isSelected()) {
					 BaseTest.click(g.getrspr());
					 System.out.println("Resident status  Permanent resident selected");
					 
				}else if (RS.contains("Work permit")&&!g.getrswp().isSelected()) {
					 BaseTest.click(g.getrswp());
					 System.out.println("Resident status work permit  selected");
					 
				}else if (RS.contains("student visa")&&!g.getrssv().isSelected()) {
					 BaseTest.click(g.getrssv());
					 System.out.println("Resident status student vise  selected");
					 
				}else if (RS.contains("Temporary visa")&&!g.getrstv().isSelected()) {
					 BaseTest.click(g.getrstv());
					 System.out.println("Resident status temporary vise  selected");
					 
				}else {
					
				}
			
			
			WebElement educations = driver.findElement(By.id("educationTemp"));
			Select education = new Select(educations);
			education.getFirstSelectedOption();
		    String educationss=Selectorf.getFirstSelectedOption().getText();
		    
		    
			acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 8)+"')]")));
           
			WebElement occupations = driver.findElement(By.id("occupationTemp"));
			Select occupationss = new Select(occupations);
			occupationss.getFirstSelectedOption();
		    String occupationssss=Selectorf.getFirstSelectedOption().getText();
		    
		    
			acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelDatasearch("Sheet1", 1, 9)+"')]")));
           
			// anualincome//
			BaseTest.select_text(g.getanualincome(), BaseTest.getExcelDatasearch("Sheet1", 1, 16));

		/// food style///
			
			String foodhabit = BaseTest.getExcelDatasearch("Sheet1", 1, 17);
			if (foodhabit.contains("Vegetarian")&&!g.geteatingHabits1().isSelected()) {
				 BaseTest.click(g.geteatingHabits1());
				 System.out.println("veg selected");
				 
					
				}else if (foodhabit.contains("Non vegetarian")&&!g.geteatingHabits2().isSelected()) {
					 BaseTest.click(g.geteatingHabits2());
					 System.out.println("Non veg selected");
					 
				}else if (foodhabit.contains("Any")&&!g.geteatingHabits0().isSelected()) {
					 BaseTest.click(g.geteatingHabits0());
					 System.out.println("foodhabit doesnt matter selected");
					 
				}else if (foodhabit.contains("Eggetarian")&&!g.geteatingHabits3().isSelected()) {
					 BaseTest.click(g.geteatingHabits3());
					 System.out.println("egg selected");
					 
				}else if (foodhabit.contains("Vegan")&&!g.geteatingHabits4().isSelected()) {
					 BaseTest.click(g.geteatingHabits4());
					 System.out.println("vegan selected");
					 
				}else {
					
				}
			
			String drinkinghabit = BaseTest.getExcelDatasearch("Sheet1", 1, 18);
			if (drinkinghabit.contains("Non-drinker")&&!g.getdrinking1().isSelected()) {
				 BaseTest.click(g.getdrinking1());
				 System.out.println("non drinker selected");
				 
					
				}else if (drinkinghabit.contains("Light / Social drinker")&&!g.getdrinking2().isSelected()) {
					 BaseTest.click(g.getdrinking2());
					 System.out.println("light/social drinker selected");
					 
				}else if (drinkinghabit.contains("Any")&&!g.getdrinking0().isSelected()) {
					 BaseTest.click(g.getdrinking0());
					 System.out.println("drinker any selected");
					 
				}else if (drinkinghabit.contains("Regular drinker")&&!g.getdrinking3().isSelected()) {
					 BaseTest.click(g.getdrinking3());
					 System.out.println("Regular drinker selected");
					 
				}else {
					
				}
			
			
			String smokehabit = BaseTest.getExcelDatasearch("Sheet1", 1, 19);
			if (smokehabit.contains("Non-smoker")&&!g.getsmoking1().isSelected()) {
				 BaseTest.click(g.getsmoking1());
				 System.out.println("non smoker selected");
				 
					
				}else if (smokehabit.contains("Light / Social smoker")&&!g.getsmoking2().isSelected()) {
					 BaseTest.click(g.getsmoking2());
					 System.out.println("light/social smoker selected");
					 
				}else if (smokehabit.contains("Any")&&!g.getsmoking0().isSelected()) {
					 BaseTest.click(g.getsmoking0());
					 System.out.println("smoker doesnt matter selected");
					 
				}else if (smokehabit.contains("Regular smoker")&&!g.getsmoking3().isSelected()) {
					 BaseTest.click(g.getsmoking3());
					 System.out.println("Regular smoker selected");
					 
				}else {
					
				}
			
			
			
			String shwoprofileadv = BaseTest.getExcelDatasearch("Sheet1", 0, 11);
			if (shwoprofileadv.contains("photo")&&!g.getphotoOpt().isSelected()) {
				 BaseTest.click(g.getphotoOpt());
				 System.out.println("photo selected");
				 
					
				}else if (shwoprofileadv.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
					 BaseTest.click(g.gethoroscopeOpt());
					 System.out.println("horoscope selected");
					 
				}else {
					
				}
			
			String dnotshows = BaseTest.getExcelDatasearch("Sheet1", 0, 12);
			if (dnotshows.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
				 BaseTest.click(g.getalreadyContOpt());
				 System.out.println("profile already contacted selected");
				 
					
				}else if (dnotshows.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
					 BaseTest.click(g.getalreadyViewedOpt());
					 System.out.println("Profiles already viewed selected");
					 
				}else if (dnotshows.contains("Shortlisted profiles ")&&!g.getshortlistOpt().isSelected()) {
					 BaseTest.click(g.getshortlistOpt());
					 System.out.println("Shortlisted profiles  selected");
					 
				}else if (dnotshows.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
					 BaseTest.click(g.getignoredOpt());
					 System.out.println("Profiles i have blocked selected");
				}else if (dnotshows.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
					 BaseTest.click(g.getigOpt());
					 System.out.println("Profiles i have ignored selected");
				}else {
					
				}				
			
			
			///keyword search////
			
			driver.findElement(By.xpath("(//a[text()='Keyword Search'])[2]")).click();
			
			
			BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatasearch("Sheet1", 1, 1));
			Thread.sleep(5000);
			BaseTest.select_text(g.getageTo(), BaseTest.getExcelDatasearch("Sheet1", 1, 2));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatasearch("Sheet1", 1, 3));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatasearch("Sheet1", 1, 3));
			Thread.sleep(5000);
			
			 
			
			String marital_statusKEY = BaseTest.getExcelDatasearch("Sheet1", 1, 0);
			if (marital_status.contains("Unmarried")&&!g.getunmarried().isSelected()) {
				 BaseTest.click(g.getunmarried());
				 System.out.println("unmarried selected");
				 
					
				}else if (marital_statusKEY.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
					 BaseTest.click(g.getwidow());
					 System.out.println("widow selected");
					 
				}else if (marital_statusKEY.contains("Divorced")&&!g.getdivorced().isSelected()) {
					 BaseTest.click(g.getdivorced());
					 System.out.println("divorced selected");
					 
				}else if (marital_statusKEY.contains("Any")&&!g.getany().isSelected()) {
					 BaseTest.click(g.getany());
					 System.out.println("Any selected");
				}else if (marital_statusKEY.contains("Seprate")&&!g.getseprated().isSelected()) {
					 BaseTest.click(g.getseprated());
					 System.out.println("seprated selected");
				}else {
					
				}				
			
			

			String manglikKEY = BaseTest.getExcelDatasearch("Sheet1", 1, 7);
			if (manglikKEY.contains("Doesn't matter")&&!g.getdoshamfield().isSelected()) {
				 BaseTest.click(g.getdoshamfield());
				 System.out.println("manglik doesntmatter selected");
				 
					
				}else if (manglikKEY.contains("Yes")&&!g.getdoshamyes().isSelected()) {
					 BaseTest.click(g.getdoshamyes());
					 System.out.println("Manglik yes selected");
					 
				}else if (manglikKEY.contains("No")&&!g.getdoshamno().isSelected()) {
					 BaseTest.click(g.getdoshamno());
					 System.out.println("Manglik no  selected");
					 
				}else {
					
				}
			
			BaseTest.typeData(driver.findElement(By.id("keywordTxt")), BaseTest.getExcelDatasearch("Sheet1", 1, 20));
			
			String shwoprofileadvkey = BaseTest.getExcelDatasearch("Sheet1", 0, 11);
			if (shwoprofileadvkey.contains("photo")&&!g.getphotoOpt().isSelected()) {
				 BaseTest.click(g.getphotoOpt());
				 System.out.println("photo selected");
				 
					
				}else if (shwoprofileadvkey.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
					 BaseTest.click(g.gethoroscopeOpt());
					 System.out.println("horoscope selected");
					 
				}else {
					
				}
			
			String dnotshowskey = BaseTest.getExcelDatasearch("Sheet1", 0, 12);
			if (dnotshowskey.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
				 BaseTest.click(g.getalreadyContOpt());
				 System.out.println("profile already contacted selected");
				 
					
				}else if (dnotshowskey.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
					 BaseTest.click(g.getalreadyViewedOpt());
					 System.out.println("Profiles already viewed selected");
					 
				}else if (dnotshowskey.contains("Shortlisted profiles ")&&!g.getshortlistOpt().isSelected()) {
					 BaseTest.click(g.getshortlistOpt());
					 System.out.println("Shortlisted profiles  selected");
					 
				}else if (dnotshowskey.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
					 BaseTest.click(g.getignoredOpt());
					 System.out.println("Profiles i have blocked selected");
				}else if (dnotshowskey.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
					 BaseTest.click(g.getigOpt());
					 System.out.println("Profiles i have ignored selected");
				}else {
					
				}	
			                 ////by matrimony id///
			
			driver.findElement(By.xpath("//a[text()='By Matrimony Id']")).click();
			
			
			BaseTest.typeData(driver.findElement(By.id("matrisearchid")), BaseTest.getExcelDatasearch("Sheet1", 1, 21));

			
		
	}




	
}