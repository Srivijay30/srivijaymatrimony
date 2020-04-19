package matimony.matrimony.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.List;
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

import com.thoughtworks.selenium.webdriven.commands.DoubleClick;


public class Refineandfilterbackup extends BaseTest {
	Actions acc;
	String marital_statuswid;
	WebDriver driver;
	String marital_statusany;
	String marital_statussep5;
	String shwoprofilewith5; 
	String marital_statussep6;
	String marital_statuswid5;
	String marital_statusdiv6;
	String marital_statuswid6;
	String marital_statusdiv5;
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
			
			
			
			Thread.sleep(5000);
//            try {
//				driver.findElement(By.xpath("//a[text()='My Home']")).click();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			Thread.sleep(5000);

			Thread.sleep(5000);
			try {
				driver.findElement(By.xpath("//a[text()='Matches ']")).click();
			} catch (Exception e) {
				System.out.println("5");
			}
			
			 try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Active']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
			Thread.sleep(10000);
			
			
//			 try {
//	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Profile type']"));
//	             JavascriptExecutor jse = (JavascriptExecutor)driver;
//	             jse.executeScript("arguments[0].scrollintoView(true)", button);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("(//a[text()=' More '])[2]")).click();
//			
//			Thread.sleep(5000);
//			driver.findElement(By.id("photoOpt")).click();
//
//			Thread.sleep(5000);

			Thread.sleep(15000);

			
			 try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Age From']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
				Thread.sleep(5000);

				driver.findElement(By.id("facetAgelabel")).click();

			
				Thread.sleep(5000);

				driver.findElement(By.xpath("(//a[text()=' More '])[3]")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("ageFrom")).clear();
				Thread.sleep(2000);

				BaseTest.typeData(driver.findElement(By.id("ageFrom")), BaseTest.getExcelDatarefine("Sheet1", 1, 0));
				Thread.sleep(2000);
				driver.findElement(By.id("ageTo")).clear();
				Thread.sleep(2000);
				BaseTest.typeData(driver.findElement(By.id("ageTo")), BaseTest.getExcelDatarefine("Sheet1", 1, 1));
				Thread.sleep(2000);

				driver.findElement(By.xpath("//input[@value='Submit']")).click();
				
				Thread.sleep(10000);

				
				WebElement agefrom =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
				String age = agefrom.getText();
				System.out.println("Age  = " + age);
				String[] split3 = age.split(" yrs");
				int ageis = Integer.parseInt(split3[0]);
				System.out.println("ageis:" + ageis);


				int agefro = 22;
				
				int ageto = 35;
				
				if (agefro<ageis && ageis>ageto) {
					System.out.println("age matched");
					
					
				}else {
					System.out.println("age not matched");
				}
				
				
				Thread.sleep(5000);

				
				//-------
				
              ///height///
				
				try {
		        	 WebElement button = driver.findElement(By.xpath("//div[text()='Height']"));
		             JavascriptExecutor jse = (JavascriptExecutor)driver;
		             jse.executeScript("arguments[0].scrollintoView(true)", button);
				} catch (Exception e) {
					// TODO: handle exception
				}
				driver.findElement(By.id("facetHeightlabel")).click();

					Thread.sleep(10000);

					driver.findElement(By.xpath("//*[@id='FMoreHeight']/a")).click();
					Thread.sleep(5000);
					driver.findElement(By.id("heightFrom")).clear();
					Thread.sleep(2000);

					BaseTest.typeData(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatarefine("Sheet1", 1, 2));
					Thread.sleep(2000);
					driver.findElement(By.id("heightTo")).clear();
					Thread.sleep(2000);
					BaseTest.typeData(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatarefine("Sheet1", 1, 3));
					
					Thread.sleep(5000);
					driver.findElement(By.xpath("//input[@value='Submit']")).click();
					Thread.sleep(10000);

					WebElement heigh =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
					String height = heigh.getText();
					System.out.println("height  = " + height);
					String[] split35 = age.split(",");
					String[] split351 = age.split(" ft");

					int heights = Integer.parseInt(split351[0]);
					System.out.println("heights:" + heights);
					
					int heighfrom = 4;
                    int heighto = 6;
                    
                    if (heighfrom<heights && heights>heighto) {
    					System.out.println("height matched");
    					
    					
    				}else {
    					System.out.println("height not matched");
    				}
                    
					Thread.sleep(10000);
                 ////marital status///
			
					try {
			        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
			             JavascriptExecutor jse = (JavascriptExecutor)driver;
			             jse.executeScript("arguments[0].scrollintoView(true)", button);
					} catch (Exception e) {
						// TODO: handle exception
					}
					driver.findElement(By.id("facetMaritalStatuslabel")).click();

						Thread.sleep(5000);

						driver.findElement(By.xpath("//*[@id='FMoreMaritalStatus']/a")).click();
						Thread.sleep(5000);
						
						if (condition) {
							
						}
						
						String unmarr = BaseTest.getExcelDatasearch("Sheet1", 1, 4);
						if (unmarr.contains("Unmarried")&&!driver.findElement(By.id("maritalStatus1")).isSelected()) {
							 BaseTest.click(driver.findElement(By.id("maritalStatus1")));
							 System.out.println("Unmarried selected");
							 
								
							}
						
						
						String widow = BaseTest.getExcelDatasearch("Sheet1", 1, 4);

						if (widow.contains("Widow / Widower")&&!driver.findElement(By.id("maritalStatus2")).isSelected()) {
							 BaseTest.click(driver.findElement(By.id("maritalStatus1")));
							 System.out.println("widow selected");
						
						} 
						
						String divor = BaseTest.getExcelDatasearch("Sheet1", 1, 6);

						if (divor.contains("Divorced")&&!driver.findElement(By.id("maritalStatus3")).isSelected()) {
							 BaseTest.click(driver.findElement(By.id("maritalStatus3")));
							 System.out.println("divorced selected");
						
						}
						
						String Sep = BaseTest.getExcelDatasearch("Sheet1", 1, 5);

						if (Sep.contains("Separated")&&!driver.findElement(By.id("maritalStatus4")).isSelected()) {
							 BaseTest.click(driver.findElement(By.id("maritalStatus4")));
							 System.out.println("separted selected");
						
						}
						
						
						
						
						if (!driver.findElement(By.id("maritalStatus1")).isSelected()) {
							driver.findElement(By.id("maritalStatus1")).click();
						}
						
						driver.findElement(By.xpath("//input[@value='Submit']")).click();

						
						Thread.sleep(10000);
						
						driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

						Thread.sleep(10000);

						String parentwindow = driver.getWindowHandle();
						Set<String> childwindow = driver.getWindowHandles();
						for(String wh : childwindow) {
							if (!parentwindow.equals(wh)) {
								driver.switchTo().window(wh);
								
							}
						}
						Thread.sleep(5000);

						
						try {
				        	 WebElement button = driver.findElement(By.xpath("//div[text()='Basic Details']"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						WebElement unm = driver.findElement(By.xpath("(//span[@class='input-data '])[6]"));
						String martial = unm.getText();
						String mar = "Unmarried";
						
						if (mar.equals(martial)) {
							System.out.println("marital status matched");
							
						}else {
							System.out.println("marital status not matched");

						}
						
						driver.switchTo().defaultContent();
						
						Thread.sleep(10000);


			driver.findElement(By.id("showmore")).click();
			Thread.sleep(5000);
			

			
			try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Mother tongue']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Thread.sleep(5000);

			driver.findElement(By.id("facetMotherTonguelabel")).click();

			driver.findElement(By.xpath("(//a[@class='clr5 txtnone srch-line'])[8]")).click();
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

			Thread.sleep(10000);

			String parentwindows = driver.getWindowHandle();
			Set<String> childwindows = driver.getWindowHandles();
			for(String wh : childwindows) {
				if (!parentwindows.equals(wh)) {
					driver.switchTo().window(wh);
					
				}
			}
			Thread.sleep(5000);

			
			try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Basic Details']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			WebElement moth = driver.findElement(By.xpath("(//span[@class='input-data '])[7]"));
			String mothert = moth.getText();
			String mothertou = "Nepali";
			
			if (mothert.equals(mothertou)) {
				System.out.println("mother tounge matched");
				
			}else {
				System.out.println("mother tounge not matched");

			}
			
			driver.switchTo().defaultContent();

			
			Thread.sleep(10000);

			driver.findElement(By.id("facetEducationlabel")).click();
			
			
            driver.findElement(By.xpath("//*[@id='facetEducation']/dl/dd[1]/a")).click();
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

			Thread.sleep(10000);

			String parentwindowsf = driver.getWindowHandle();
			Set<String> childwindowsf = driver.getWindowHandles();
			for(String wh : childwindowsf) {
				if (!parentwindowsf.equals(wh)) {
					driver.switchTo().window(wh);
					
				}
			}
			Thread.sleep(5000);

			
			try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Education Subcategory']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			WebElement educ = driver.findElement(By.xpath("//*[@id='ignorecrossbefore_1']/div[4]/div[3]/div[1]/ul/li[2]/span[2]"));
			String educa = educ.getText();
			String educat = "B.A";
			String educatd = "M.A";
			
			if (educa.equals(educat)||educa.equals(educatd)) {
				System.out.println("Education matched");
				
			}else {
				System.out.println("Education not matched");

			}
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(5000);
			
			//family type//


			driver.findElement(By.id("facetFamilyTypelabel")).click();
			
			String familhy = driver.findElement(By.xpath("//*[@id='MoreFamilyType']/div[1]/div[4]/span[3]/label")).getText();
            
			if (familhy.contains("Nuclear family")&&!g.getnucfam().isSelected()) {
				 BaseTest.click(g.getnucfam());
				 System.out.println("seprated selected");
			}else {
				
			}
			
			driver.findElement(By.xpath("//*[@id='facetFamilyType']/dl/dd[1]/a")).click();
			
			
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

			Thread.sleep(10000);

			String parentwindoww = driver.getWindowHandle();
			Set<String> childwindoww = driver.getWindowHandles();
			for(String wh : childwindoww) {
				if (!parentwindoww.equals(wh)) {
					driver.switchTo().window(wh);
					
				}
			}
			Thread.sleep(5000);

			
			try {
	        	 WebElement button = driver.findElement(By.xpath("//span[text()='No.of Brother(s)']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			WebElement fami = driver.findElement(By.xpath("//span[text()='Nuclear family']"));
			String famiy = fami.getText();
			String family = "Nuclear family";
			
			if (famiy.equals(family)) {
				System.out.println("family status matched");
				
			}else {
				System.out.println("family status not matched");

			}
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(10000);
			
			///employed in//
			
			try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Employed in']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
          driver.findElement(By.id("facetEmployedInlabel")).click();
			
			//String familhy = driver.findElement(By.xpath("//*[@id='MoreFamilyType']/div[1]/div[4]/span[3]/label")).getText();
            
            
			if (driver.findElement(By.id("occupationCat2")).isSelected()) {
				 BaseTest.click(driver.findElement(By.id("occupationCat2")));
				 System.out.println("defence unselected");
			}else {
				
			}
			
			if (driver.findElement(By.id("occupationCat3")).isSelected()) {
				 BaseTest.click(driver.findElement(By.id("occupationCat3")));
				 System.out.println("private unselected");
			}else {
				
			}
			
			if (driver.findElement(By.id("occupationCat6")).isSelected()) {
				 BaseTest.click(driver.findElement(By.id("occupationCat6")));
				 System.out.println("self employed unselected");
			}else {
				
			}
			
			if (driver.findElement(By.id("occupationCat7")).isSelected()) {
				 BaseTest.click(driver.findElement(By.id("occupationCat7")));
				 System.out.println("Not working unselected");
			}else {
				
			}
			
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(10000);
			
			
			
			
			try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			driver.findElement(By.id("showmore")).click();
			
			try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Employed in']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
         driver.findElement(By.id("facetEmployedInlabel")).click();
			
			driver.findElement(By.xpath("//*[@id='facetEmployedIn']/dl/dd[2]/a")).click();
			
			
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

			Thread.sleep(10000);

			String parentwindowws1 = driver.getWindowHandle();
			Set<String> childwindowws1 = driver.getWindowHandles();
			for(String wh : childwindowws1) {
				if (!parentwindowws1.equals(wh)) {
					driver.switchTo().window(wh);
					
				}
			}
			Thread.sleep(5000);

			
			try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Professional Information']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			WebElement empin = driver.findElement(By.xpath("//span[text()='Government']"));
			String empins = fami.getText();
			String employmentin = "Nuclear family";
			
			if (empins.equals(employmentin)) {
				System.out.println("employmentin status matched");
				
			}else {
				System.out.println("employmentin status not matched");

			}
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(10000);
			
			
			

			try {
	        	 WebElement button = driver.findElement(By.xpath("//div[text()='Occupation']"));
	             JavascriptExecutor jse = (JavascriptExecutor)driver;
	             jse.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			driver.findElement(By.id("occupationTemp")).click();
			Thread.sleep(5000);
	         try {
	        	 WebElement ocu = driver.findElement(By.xpath("//option[text()='"+getExcelDatarefine("Sheet1", 1, 4)+"']"));
		    		
		    		acc.doubleClick(ocu).perform();
				
					Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
	        	
			
			
	         driver.findElement(By.xpath("//input[@value='Submit']")).click();
				Thread.sleep(10000);
			
			
			
				try {
		        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
		             JavascriptExecutor jse = (JavascriptExecutor)driver;
		             jse.executeScript("arguments[0].scrollintoView(true)", button);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
				driver.findElement(By.id("showmore")).click();
				Thread.sleep(10000);
				
				
				try {
		        	 WebElement button = driver.findElement(By.xpath("//div[text()='Occupation']"));
		             JavascriptExecutor jse = (JavascriptExecutor)driver;
		             jse.executeScript("arguments[0].scrollintoView(true)", button);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				driver.findElement(By.id("occupationTemp")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@id='facetOccupation']/dl/dd[1]/a")).click();
				Thread.sleep(5000);

				String occupat = driver.findElement(By.xpath("//span[text()='Manager']")).getText();
				String occpation = BaseTest.getExcelData("Sheet1", 1, 3);
				
				if (occupat.equals(occpation)) {
					System.out.println("occupation matched");
				}
				
				System.out.println("occupation not matched");
				
				
				driver.findElement(By.id("showmore")).click();
				Thread.sleep(10000);

			    ///anual income///
				
				
			
				try {
		        	 WebElement button = driver.findElement(By.xpath("//div[text()='Annual income']"));
		             JavascriptExecutor jse = (JavascriptExecutor)driver;
		             jse.executeScript("arguments[0].scrollintoView(true)", button);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				driver.findElement(By.id("facetAnnualIncomelabel")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("(//a[text()=' More '])[3]")).click();

				driver.findElement(By.id("annualIncome")).click();
				Thread.sleep(5000);
		         try {
		        	 WebElement ocu = driver.findElement(By.xpath("//option[text()='"+getExcelDatarefine("Sheet1", 1, 5)+"']"));
			    		
			    		acc.doubleClick(ocu).perform();
					
						Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			
		         driver.findElement(By.xpath("//input[@value='Submit']")).click();
					Thread.sleep(10000);
					
				///country///
					try {
			        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
			             JavascriptExecutor jse = (JavascriptExecutor)driver;
			             jse.executeScript("arguments[0].scrollintoView(true)", button);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					
					
					driver.findElement(By.id("showmore")).click();
					Thread.sleep(10000);
					
					
					try {
			        	 WebElement button = driver.findElement(By.xpath("//div[text()='Country']"));
			             JavascriptExecutor jse = (JavascriptExecutor)driver;
			             jse.executeScript("arguments[0].scrollintoView(true)", button);
					} catch (Exception e) {
						// TODO: handle exception
					}
					       	
					driver.findElement(By.id("facetCountrylabel")).click();
					Thread.sleep(5000);
					
					driver.findElement(By.xpath("(//a[text()=' More '])[3]")).click();
			
			
					driver.findElement(By.id("countryTemp")).click();
					Thread.sleep(5000);
			         try {
			        	 WebElement count = driver.findElement(By.xpath("//option[text()='"+getExcelDatarefine("Sheet1", 1, 6)+"']"));
				    		
				    		acc.doubleClick(count).perform();
						
							Thread.sleep(5000);
					} catch (Exception e) {
						// TODO: handle exception
					}
			
			
			         driver.findElement(By.xpath("//input[@value='Submit']")).click();
						Thread.sleep(10000);
			
						try {
				        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						
						
						driver.findElement(By.id("showmore")).click();
						
						try {
				        	 WebElement button = driver.findElement(By.xpath("//div[text()='Country']"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						driver.findElement(By.xpath("//*[@id='facetEmployedIn']/dl/dd[2]/a")).click();
						
						driver.findElement(By.xpath("//*[@id=\"facetCountry\"]/dl/dd/a")).click();

						Thread.sleep(10000);
						
						driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

						Thread.sleep(10000);

						String parentwindowws15 = driver.getWindowHandle();
						Set<String> childwindowws15 = driver.getWindowHandles();
						for(String wh : childwindowws15) {
							if (!parentwindowws15.equals(wh)) {
								driver.switchTo().window(wh);
								
							}
						}
						Thread.sleep(5000);

						
						try {
				        	 WebElement button = driver.findElement(By.xpath("//div[text()='Professional Information']"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						WebElement cnt = driver.findElement(By.xpath("//*[@id=\"BasicInfoController\"]/div[11]/div[1]/div[15]/div[2]/div/div/ul/li[3]/span[3]"));
						String cntt = cnt.getText();
						String county = BaseTest.getExcelData("Sheet1", 1, 6);
						
						if (cntt.equals(county)) {
							System.out.println("county matched");
							
						}else {
							System.out.println("county not matched");

						}
						
						driver.switchTo().defaultContent();
						
						Thread.sleep(10000);
						
						////resident///
						
						
						try {
				        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						
						
						driver.findElement(By.id("showmore")).click();
						Thread.sleep(10000);
						
						
						try {
				        	 WebElement button = driver.findElement(By.xpath("//div[text()='Resident status']"));
				             JavascriptExecutor jse = (JavascriptExecutor)driver;
				             jse.executeScript("arguments[0].scrollintoView(true)", button);
						} catch (Exception e) {
							// TODO: handle exception
						}
						       	
						driver.findElement(By.id("facetResidentStatuslabel")).click();
						Thread.sleep(5000);
						
						driver.findElement(By.xpath("(//a[text()=' More '])[3]")).click();
				
				
						
						
						
						
						
						Thread.sleep(5000);
				         try {
				        	 if (driver.findElement(By.id("residentStatus1")).isSelected()) {
								 BaseTest.click(driver.findElement(By.id("residentStatus1")));
								 System.out.println("citizen unselected");
							}else {
								
							}
							
							if (driver.findElement(By.id("residentStatus2")).isSelected()) {
								 BaseTest.click(driver.findElement(By.id("residentStatus2")));
								 System.out.println("permant resident unselected");
							}else {
								
							}
							
							if (driver.findElement(By.id("residentStatus4")).isSelected()) {
								 BaseTest.click(driver.findElement(By.id("residentStatus4")));
								 System.out.println("student visa unselected");
							}else {
								
							}
							
							if (driver.findElement(By.id("residentStatus5")).isSelected()) {
								 BaseTest.click(driver.findElement(By.id("residentStatus5")));
								 System.out.println("temp visa unselected");
							}else {
								
							}
							if (driver.findElement(By.id("residentStatus6")).isSelected()) {
								 BaseTest.click(driver.findElement(By.id("residentStatus6")));
								 System.out.println("Not resident unselected");
							}else {
								
							}
							
							
							
							
							driver.findElement(By.xpath("//input[@value='Submit']")).click();
							Thread.sleep(10000);
							
							
						} catch (Exception e) {
							// TODO: handle exception
						}
				
				
				         
				
							try {
					        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
					             JavascriptExecutor jse = (JavascriptExecutor)driver;
					             jse.executeScript("arguments[0].scrollintoView(true)", button);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							
							
							driver.findElement(By.id("showmore")).click();
							
							try {
					        	 WebElement button = driver.findElement(By.xpath("//div[text()='Resident status']"));
					             JavascriptExecutor jse = (JavascriptExecutor)driver;
					             jse.executeScript("arguments[0].scrollintoView(true)", button);
							} catch (Exception e) {
								// TODO: handle exception
							}
							       	
							driver.findElement(By.id("facetResidentStatuslabel")).click();
							Thread.sleep(5000);
							
							
							
							driver.findElement(By.xpath("//*[@id='facetResidentStatus']/dl/dd/a")).click();

							Thread.sleep(10000);
							
							driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

							Thread.sleep(10000);

							String parentwindowws151 = driver.getWindowHandle();
							Set<String> childwindowws151 = driver.getWindowHandles();
							for(String wh : childwindowws151) {
								if (!parentwindowws151.equals(wh)) {
									driver.switchTo().window(wh);
									
								}
							}
							Thread.sleep(5000);

							
							try {
					        	 WebElement button = driver.findElement(By.xpath("//div[text()='Location']"));
					             JavascriptExecutor jse = (JavascriptExecutor)driver;
					             jse.executeScript("arguments[0].scrollintoView(true)", button);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							WebElement cntd = driver.findElement(By.xpath("//*[@id=\"BasicInfoController\"]/div[11]/div[1]/div[15]/div[2]/div/div/ul/li[4]/span[3]"));
							String cnttd = cntd.getText();
							String countyd = BaseTest.getExcelData("Sheet1", 1, 7);
							
							if (cnttd.equals(countyd)) {
								System.out.println("Resident status matched");
								
							}else {
								System.out.println("Resident status not matched");

							}
							
							driver.switchTo().defaultContent();
							
							Thread.sleep(10000);
						
							/////citizenship///
							
							try {
					        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
					             JavascriptExecutor jse = (JavascriptExecutor)driver;
					             jse.executeScript("arguments[0].scrollintoView(true)", button);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							
							
							driver.findElement(By.id("showmore")).click();
							Thread.sleep(10000);
							
							
							try {
					        	 WebElement button = driver.findElement(By.xpath("//div[text()='Citizenship']"));
					             JavascriptExecutor jse = (JavascriptExecutor)driver;
					             jse.executeScript("arguments[0].scrollintoView(true)", button);
							} catch (Exception e) {
								// TODO: handle exception
							}
							       	
							driver.findElement(By.id("facetCitizenshiplabel")).click();
							Thread.sleep(5000);
							
							driver.findElement(By.xpath("(//a[text()=' More '])[3]")).click();
					
					
							
							driver.findElement(By.id("citizenshipTemp")).click();
							Thread.sleep(5000);
					         try {
					        	 WebElement cit = driver.findElement(By.xpath("//option[text()='"+getExcelDatarefine("Sheet1", 1, 8)+"']"));
						    		
						    		acc.doubleClick(cit).perform();
								
									Thread.sleep(5000);
							} catch (Exception e) {
								// TODO: handle exception
							}	
							
							
							
							Thread.sleep(5000);
					        	
								
								driver.findElement(By.xpath("//input[@value='Submit']")).click();
								Thread.sleep(10000);
								
				
					
								try {
						        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
						             JavascriptExecutor jse = (JavascriptExecutor)driver;
						             jse.executeScript("arguments[0].scrollintoView(true)", button);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								
								
								driver.findElement(By.id("showmore")).click();
								
								try {
						        	 WebElement button = driver.findElement(By.xpath("//div[text()='Citizenship']"));
						             JavascriptExecutor jse = (JavascriptExecutor)driver;
						             jse.executeScript("arguments[0].scrollintoView(true)", button);
								} catch (Exception e) {
									// TODO: handle exception
								}
								       	
								driver.findElement(By.id("facetCitizenshiplabel")).click();
								Thread.sleep(5000);
								
								
								
								driver.findElement(By.xpath("//*[@id='facetCitizenship']/dl/dd/a")).click();

								Thread.sleep(10000);
								
								driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

								Thread.sleep(10000);

								String parentwindowws1515 = driver.getWindowHandle();
								Set<String> childwindowws1515 = driver.getWindowHandles();
								for(String wh : childwindowws1515) {
									if (!parentwindowws1515.equals(wh)) {
										driver.switchTo().window(wh);
										
									}
								}
								Thread.sleep(5000);

								
								try {
						        	 WebElement button = driver.findElement(By.xpath("//div[text()='Location']"));
						             JavascriptExecutor jse = (JavascriptExecutor)driver;
						             jse.executeScript("arguments[0].scrollintoView(true)", button);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								WebElement cntd5 = driver.findElement(By.xpath("//*[@id=\"BasicInfoController\"]/div[11]/div[1]/div[15]/div[2]/div/div/ul/li[3]/span[3]"));
								String cnttd5 = cntd5.getText();
								String countyd5 = BaseTest.getExcelData("Sheet1", 1, 8);
								
								if (cnttd.equals(countyd)) {
									System.out.println("citizen status matched");
									
								}else {
									System.out.println("citizen status not matched");

								}
								
								driver.switchTo().defaultContent();
								
								Thread.sleep(10000);
								
		///phy status///
								
								try {
						        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
						             JavascriptExecutor jse = (JavascriptExecutor)driver;
						             jse.executeScript("arguments[0].scrollintoView(true)", button);
								
								
								
								
								driver.findElement(By.id("showmore")).click();
								Thread.sleep(10000);
								} catch (Exception e) {
									// TODO: handle exception
								}
								
								try {
						        	 WebElement button = driver.findElement(By.xpath("//div[text()='Physical Status']"));
						             JavascriptExecutor jse = (JavascriptExecutor)driver;
						             jse.executeScript("arguments[0].scrollintoView(true)", button);
								} catch (Exception e) {
									// TODO: handle exception
								}
								       	
								driver.findElement(By.id("facetPhysicalStatuslabel")).click();
								Thread.sleep(5000);
								
								driver.findElement(By.xpath("(//a[text()=' More '])[3]")).click();
								
								
						
								String bodytype = BaseTest.getExcelDatasearch("Sheet1", 1, 9);
								if (bodytype.contains("Any")&&!driver.findElement(By.xpath("//*[@id=\"MorePhysicalStatus\"]/div[1]/div[4]/label[1]")).isSelected()) {
									 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"MorePhysicalStatus\"]/div[1]/div[4]/label[1]")));
									 System.out.println("Any selected");
									 
										
									}else if (bodytype.contains(" Doesn't matter")&&!driver.findElement(By.xpath("//*[@id=\"MorePhysicalStatus\"]/div[1]/div[4]/label[2]")).isSelected()) {
										 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"MorePhysicalStatus\"]/div[1]/div[4]/label[2]")));
										 System.out.println("Doesnt matter selected");
										 
									}			
								
											
								
								
								Thread.sleep(5000);
						        	
									
									driver.findElement(By.xpath("//input[@value='Submit']")).click();
									Thread.sleep(10000);
									
					
						
									try {
							        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
							             JavascriptExecutor jse = (JavascriptExecutor)driver;
							             jse.executeScript("arguments[0].scrollintoView(true)", button);
									
									
									
									
									driver.findElement(By.id("showmore")).click();
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									try {
							        	 WebElement button = driver.findElement(By.xpath("//div[text()='Physical Status']"));
							             JavascriptExecutor jse = (JavascriptExecutor)driver;
							             jse.executeScript("arguments[0].scrollintoView(true)", button);
									} catch (Exception e) {
										// TODO: handle exception
									}
									       	
									driver.findElement(By.id("facetPhysicalStatuslabel")).click();
									Thread.sleep(5000);
																
									
									
									driver.findElement(By.xpath("//*[@id='facetPhysicalStatus']/dl/dd/a")).click();

									Thread.sleep(10000);
									
									driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

									Thread.sleep(10000);

									String parentwindowws15155 = driver.getWindowHandle();
									Set<String> childwindowws15155 = driver.getWindowHandles();
									for(String wh : childwindowws15155) {
										if (!parentwindowws15155.equals(wh)) {
											driver.switchTo().window(wh);
											
										}
									}
									Thread.sleep(5000);

									
									try {
							        	 WebElement button = driver.findElement(By.xpath("//div[text()='Location']"));
							             JavascriptExecutor jse = (JavascriptExecutor)driver;
							             jse.executeScript("arguments[0].scrollintoView(true)", button);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									WebElement cntd55 = driver.findElement(By.xpath("//*[@id=\"BasicInfoController\"]/div[11]/div[1]/div[5]/div[2]/div/div/ul/li[8]/div/span[3]/span"));
									String cnttd55 = cntd55.getText();
									String countyd55 = BaseTest.getExcelData("Sheet1", 1, 9);
									
									if (countyd55.equals(cnttd55)) {
										System.out.println("phy status matched");
										
									}else {
										System.out.println("phy status not matched");

									}
									
									driver.switchTo().defaultContent();
									
									Thread.sleep(10000);							
								
							///body type///
									
									try {
							        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
							             JavascriptExecutor jse = (JavascriptExecutor)driver;
							             jse.executeScript("arguments[0].scrollintoView(true)", button);
									
									
									
									driver.findElement(By.id("showmore")).click();
									Thread.sleep(10000);
									} catch (Exception e) {
										// TODO: handle exception
									}
									
									
									try {
							        	 WebElement button = driver.findElement(By.xpath("//div[text()='Body type']"));
							             JavascriptExecutor jse = (JavascriptExecutor)driver;
							             jse.executeScript("arguments[0].scrollintoView(true)", button);
									} catch (Exception e) {
										// TODO: handle exception
									}
									       	
									driver.findElement(By.id("facetBodytypelabel")).click();
									Thread.sleep(5000);
									
									driver.findElement(By.xpath("(//a[text()=' More '])[3]")).click();
							
							
									
									
									
									
									
									Thread.sleep(5000);
									String bodytypes = BaseTest.getExcelDatasearch("Sheet1", 1, 10);
									if (bodytypes.contains("Average")&&!driver.findElement(By.xpath("//*[@id=\"MoreBodytype\"]/div[1]/div[4]/span[1]/label")).isSelected()) {
										 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"MoreBodytype\"]/div[1]/div[4]/span[1]/label")));
										 System.out.println("average selected");
										 
											
										}else if (bodytype.contains("Athletic")&&!driver.findElement(By.xpath("//*[@id=\"MoreBodytype\"]/div[1]/div[4]/span[2]/label")).isSelected()) {
											 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"MoreBodytype\"]/div[1]/div[4]/span[2]/label")));
											 System.out.println("atheletic selected");
											 
										}	
										
										driver.findElement(By.xpath("//input[@value='Submit']")).click();
										Thread.sleep(10000);
										
										
									
							
							
							         
							
										try {
								        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
								             JavascriptExecutor jse = (JavascriptExecutor)driver;
								             jse.executeScript("arguments[0].scrollintoView(true)", button);
										
										
										
										driver.findElement(By.id("showmore")).click();
										Thread.sleep(10000);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										
										try {
								        	 WebElement button = driver.findElement(By.xpath("//div[text()='Body type']"));
								             JavascriptExecutor jse = (JavascriptExecutor)driver;
								             jse.executeScript("arguments[0].scrollintoView(true)", button);
										} catch (Exception e) {
											// TODO: handle exception
										}
										       	
										driver.findElement(By.id("facetBodytypelabel")).click();
										Thread.sleep(5000);
										
										
										
										
										driver.findElement(By.xpath("//*[@id='facetBodytype']/dl/dd/a")).click();

										Thread.sleep(10000);
										
										driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

										Thread.sleep(10000);

										String parentwindowws1551 = driver.getWindowHandle();
										Set<String> childwindowws1551 = driver.getWindowHandles();
										for(String wh : childwindowws1551) {
											if (!parentwindowws1551.equals(wh)) {
												driver.switchTo().window(wh);
												
											}
										}
										Thread.sleep(5000);

										
										try {
								        	 WebElement button = driver.findElement(By.xpath("//div[text()='Basic Details']"));
								             JavascriptExecutor jse = (JavascriptExecutor)driver;
								             jse.executeScript("arguments[0].scrollintoView(true)", button);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										WebElement cntd555 = driver.findElement(By.xpath("//*[@id=\"BasicInfoController\"]/div[11]/div[1]/div[5]/div[2]/div/div/ul/li[9]/div/div/span[3]"));
										String cnttdff = cntd555.getText();
										String countydff = BaseTest.getExcelData("Sheet1", 1, 10);
										
										if (cnttdff.equals(countydff)) {
											System.out.println("Body type matched");
											
										}else {
											System.out.println("Body type not matched");

										}
										
										driver.switchTo().defaultContent();
										
										Thread.sleep(10000);	
										
										/////eating habits////
										try {
								        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
								             JavascriptExecutor jse = (JavascriptExecutor)driver;
								             jse.executeScript("arguments[0].scrollintoView(true)", button);
										
										
										
										driver.findElement(By.id("showmore")).click();
										Thread.sleep(10000);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										
										try {
								        	 WebElement button = driver.findElement(By.xpath("//div[text()='Eating habits']"));
								             JavascriptExecutor jse = (JavascriptExecutor)driver;
								             jse.executeScript("arguments[0].scrollintoView(true)", button);
										} catch (Exception e) {
											// TODO: handle exception
										}
										       	
										driver.findElement(By.id("facetEatinglabel")).click();
										Thread.sleep(5000);
										
										driver.findElement(By.xpath("//*[@id='FMoreEating']/a")).click();
								
								
										Thread.sleep(5000);
										String profile = BaseTest.getExcelDatasearch("Sheet1", 1, 11);	//veg
										
//								for (int i = 1; i < 10; i++) {
//								if (profile.contains("Vegetarian")&&!driver.findElement(By.id("eating"+i+"")).isSelected()) {
//									
//									 BaseTest.click(driver.findElement(By.id("eating"+i+"")));
//
//								}	else if (!profile.contains("Vegetarian")&&driver.findElement(By.id("eating"+i+"")).isSelected()) {
//									 BaseTest.click(driver.findElement(By.id("eating"+i+"")));
//
//								}
//									
//									
//									
//								}		
										
										
										
										
										
										Thread.sleep(5000);
										String pfrofile = BaseTest.getExcelDatasearch("Sheet1", 1, 11);
										if (pfrofile.contains("Vegetarian")&&!driver.findElement(By.id("eating1")).isSelected()) {
											 BaseTest.click(driver.findElement(By.id("eating1")));
											 System.out.println("Vegetarian selected");
											 
												
											} 
										
										
										String pfrofile5 = BaseTest.getExcelDatasearch("Sheet1", 1, 11);
										if (pfrofile5.contains("Non Vegetarian")&&!driver.findElement(By.id("eating2")).isSelected()) {
											 BaseTest.click(driver.findElement(By.id("eating2")));
											 System.out.println("Vegetarian selected");
											 
												
											}
										

										
										
											
											driver.findElement(By.xpath("//input[@value='Submit']")).click();
											Thread.sleep(10000);
											
											
										
								
								
								         
								
											try {
									        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
									             JavascriptExecutor jse = (JavascriptExecutor)driver;
									             jse.executeScript("arguments[0].scrollintoView(true)", button);
											
											
											
											driver.findElement(By.id("showmore")).click();
											Thread.sleep(10000);
											} catch (Exception e) {
												// TODO: handle exception
											}
											
											
											try {
									        	 WebElement button = driver.findElement(By.xpath("//div[text()='Profile created by']"));
									             JavascriptExecutor jse = (JavascriptExecutor)driver;
									             jse.executeScript("arguments[0].scrollintoView(true)", button);
											} catch (Exception e) {
												// TODO: handle exception
											}
											       	
											driver.findElement(By.id("facetProfileCreatedBylabel")).click();
											Thread.sleep(5000);
											
											
											
											
											driver.findElement(By.xpath("//*[@id=\"facetProfileCreatedBy\"]/dl/dd/a")).click();

											Thread.sleep(10000);
											
											driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

											Thread.sleep(10000);

											String parentwindowws15515 = driver.getWindowHandle();
											Set<String> childwindowws15515 = driver.getWindowHandles();
											for(String wh : childwindowws15515) {
												if (!parentwindowws15515.equals(wh)) {
													driver.switchTo().window(wh);
													
												}
											}
											Thread.sleep(5000);

											
											try {
									        	 WebElement button = driver.findElement(By.xpath("//div[text()='Basic Details']"));
									             JavascriptExecutor jse = (JavascriptExecutor)driver;
									             jse.executeScript("arguments[0].scrollintoView(true)", button);
											} catch (Exception e) {
												// TODO: handle exception
											}
											
											WebElement cntd5555 = driver.findElement(By.xpath("//*[@id=\"BasicInfoController\"]/div[11]/div[1]/div[5]/div[2]/div/div/ul/li[1]/div/span[3]"));
											String cnttdffh = cntd5555.getText();
											String countydffh = BaseTest.getExcelData("Sheet1", 1, 14);
											
											if (countydffh.equals(cnttdffh)) {
												System.out.println("Profile created matched");
												
											}else {
												System.out.println("Profile created not matched");

											}
											
											driver.switchTo().defaultContent();
											
											Thread.sleep(10000);											
										
										///smoking habits////
										///drinking habits////
								/////profile created for///		
										
										
										try {
								        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
								             JavascriptExecutor jse = (JavascriptExecutor)driver;
								             jse.executeScript("arguments[0].scrollintoView(true)", button);
										
										
										
										driver.findElement(By.id("showmore")).click();
										Thread.sleep(10000);
										} catch (Exception e) {
											// TODO: handle exception
										}
										
										
										try {
								        	 WebElement button = driver.findElement(By.xpath("//div[text()='Profile created by']"));
								             JavascriptExecutor jse = (JavascriptExecutor)driver;
								             jse.executeScript("arguments[0].scrollintoView(true)", button);
										} catch (Exception e) {
											// TODO: handle exception
										}
										       	
										driver.findElement(By.id("facetProfileCreatedBylabel")).click();
										Thread.sleep(5000);
										
										driver.findElement(By.xpath("(//a[text()=' More '])[3]")).click();
								
								
										
										
										
										
										
										Thread.sleep(5000);
										String pfrofilem = BaseTest.getExcelDatasearch("Sheet1", 1, 14);
										if (pfrofilem.contains("Self")&&!driver.findElement(By.xpath("//*[@id=\"createdBy1\"]")).isSelected()) {
											 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"createdBy1\"]")));
											 System.out.println("average selected");
											 
												
											}

										if (pfrofilem.contains("Parents")&&!driver.findElement(By.xpath("//*[@id=\"createdBy2\"]")).isSelected()) {
												 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"createdBy2\"]")));
												 System.out.println("atheletic selected");
												 
											}	
										
										if (pfrofilem.contains("Sibling")&&!driver.findElement(By.xpath("//*[@id=\"createdBy3\"]")).isSelected()) {
											 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"createdBy3\"]")));
											 System.out.println("atheletic selected");
											 
										}	
										
										if (pfrofilem.contains("Relative")&&!driver.findElement(By.xpath("//*[@id=\"createdBy4\"]")).isSelected()) {
											 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"createdBy4\"]")));
											 System.out.println("atheletic selected");
											 
										}	
										
										if (pfrofilem.contains("Friend")&&!driver.findElement(By.xpath("//*[@id=\"createdBy5\"]")).isSelected()) {
											 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"createdBy5\"]")));
											 System.out.println("atheletic selected");
											 
										}	
										
										
											
											driver.findElement(By.xpath("//input[@value='Submit']")).click();
											Thread.sleep(10000);
											
											
										
								
								
								         
								
											try {
									        	 WebElement button = driver.findElement(By.xpath("//div[text()='Marital status']"));
									             JavascriptExecutor jse = (JavascriptExecutor)driver;
									             jse.executeScript("arguments[0].scrollintoView(true)", button);
											
											
											
											driver.findElement(By.id("showmore")).click();
											Thread.sleep(10000);
											} catch (Exception e) {
												// TODO: handle exception
											}
											
											
											try {
									        	 WebElement button = driver.findElement(By.xpath("//div[text()='Profile created by']"));
									             JavascriptExecutor jse = (JavascriptExecutor)driver;
									             jse.executeScript("arguments[0].scrollintoView(true)", button);
											} catch (Exception e) {
												// TODO: handle exception
											}
											       	
											driver.findElement(By.id("facetProfileCreatedBylabel")).click();
											Thread.sleep(5000);
											
											
											
											
											driver.findElement(By.xpath("//*[@id=\"facetProfileCreatedBy\"]/dl/dd/a")).click();

											Thread.sleep(10000);
											
											driver.findElement(By.xpath("(//span[text()='Profile Created for '])[1]")).click();

											Thread.sleep(10000);

											String parentwindowws155155 = driver.getWindowHandle();
											Set<String> childwindowws155155 = driver.getWindowHandles();
											for(String wh : childwindowws155155) {
												if (!parentwindowws155155.equals(wh)) {
													driver.switchTo().window(wh);
													
												}
											}
											Thread.sleep(5000);

											
											try {
									        	 WebElement button = driver.findElement(By.xpath("//div[text()='Basic Details']"));
									             JavascriptExecutor jse = (JavascriptExecutor)driver;
									             jse.executeScript("arguments[0].scrollintoView(true)", button);
											} catch (Exception e) {
												// TODO: handle exception
											}
											
											WebElement cntd5555a = driver.findElement(By.xpath("//*[@id=\"BasicInfoController\"]/div[11]/div[1]/div[5]/div[2]/div/div/ul/li[1]/div/span[3]"));
											String cnttdffha = cntd5555a.getText();
											String countydffha = BaseTest.getExcelData("Sheet1", 1, 14);
											
											if (cnttdffha.equals(countydffha)) {
												System.out.println("Profile created matched");
												
											}else {
												System.out.println("Profile created not matched");

											}
											
											driver.switchTo().defaultContent();
											
											Thread.sleep(10000);					
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
								
												
	}
			}