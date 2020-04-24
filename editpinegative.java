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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class editpinegative extends BaseTest {
	int i = 1;
	WebElement namefor ;
	WebDriver driver;
	@BeforeMethod
	public void setup() throws MalformedURLException {
	

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\Desktop\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		driver = new ChromeDriver();

		
		}
	
	
	
	
	@Test
	public void setup6() throws Throwable {
		
		editppPOM g = new editppPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;

			
		Thread.sleep(3000);
		driver.get("https://www.nepalimatrimony.com");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "nep140675");
		
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
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e) {
				
			}
			
			Thread.sleep(10000);

			
			try {
				Robot robot = new Robot();
				robot.delay(5000);
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
			}
			
			
			
			Thread.sleep(5000);
           driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
			Thread.sleep(10000);

			
		//	BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatanegativeditpi("Sheet1", 3, 1));
	//	BaseTest.typeData(driver.findElement(By.id("ageFrom")), BaseTest.getExcelDatarefine("Sheet1", 1, 0));

			
  //  BaseTest.typeData(driver.findElement(By.xpath("//input[@value='Save']"));
			Thread.sleep(5000);

			
		BaseTest.typeData(driver.findElement(By.id("createdfor")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 0));
         System.out.println("Profile created by selected selected");
	//	BaseTest.click(g.getsavebutton());
		Thread.sleep(5000);

		WebElement profilefor = driver.findElement(By.id("createdforSpan"));
			if (profilefor.isDisplayed()) {
				System.out.println("please select the profile created by");
			}else {
				System.out.println("please select the profile created by not selected");

			}

			Thread.sleep(5000);
			//-
//
//			BaseTest.typeData(driver.findElement(By.id("createdfor")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 1));
//			Thread.sleep(5000);
//	         System.out.println("Profile created by self selected");
//
//			///name//
//				Thread.sleep(5000);
//	         driver.findElement(By.id("name")).clear();
//				Thread.sleep(5000);
//				
//				System.out.println("empty name selected");
//				
//				
//				Thread.sleep(5000);
//
//	         
//	         try {
//	        	 r.keyPress(KeyEvent.VK_ENTER);
//					r.keyRelease(KeyEvent.VK_ENTER);
//				} catch (Exception e) {
//				// TODO: handle exception
//			}
//				
//			
//				Thread.sleep(5000);
//
//
//	 		namefor = driver.findElement(By.id("nameSpan"));
//	 			if (namefor.isDisplayed()) {
//	 				System.out.println("please enter the name");
//	 			}else {
//	 				System.out.println("please enter the name not selected");
//
//	 			}
//				Thread.sleep(5000);
//
//		         driver.findElement(By.id("name")).clear();
//					Thread.sleep(5000);
//
//			
//	 				BaseTest.typeData(driver.findElement(By.id("name")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 2));
//
//			System.out.println("numeric in name written");
//			Thread.sleep(5000);
//
//	 				  try {
//	 		        	 r.keyPress(KeyEvent.VK_ENTER);
//	 						r.keyRelease(KeyEvent.VK_ENTER);
//	 					} catch (Exception e) {
//	 					// TODO: handle exception
//	 				}
//	 					Thread.sleep(5000);
//
//	 				  namefor = driver.findElement(By.id("nameSpan"));
//	 	 			if (namefor.isDisplayed()) {
//	 	 				System.out.println("Numerical values not allowed");
//	 	 			}else {
//	 	 				System.out.println("Numerical values not allowed not selected");
//
//	 	 			}
//	 	 			
//	 				Thread.sleep(5000);
//
//			         driver.findElement(By.id("name")).clear();
//
//						Thread.sleep(5000);
//
//		 				BaseTest.typeData(driver.findElement(By.id("name")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 3));
//
//				System.out.println("alpha numeric in name entered");
//				Thread.sleep(5000);
//
//		 				  try {
//		 		        	 r.keyPress(KeyEvent.VK_ENTER);
//		 						r.keyRelease(KeyEvent.VK_ENTER);
//		 					} catch (Exception e) {
//		 					// TODO: handle exception
//		 				}
//		 					Thread.sleep(5000);
//
//		 				  namefor = driver.findElement(By.id("nameSpan"));
//		 	 			if (namefor.isDisplayed()) {
//		 	 				System.out.println("Alpha Numerical values not allowed");
//		 	 			}else {
//		 	 				System.out.println("Alpha Numerical values not allowed not selected");
//
//		 	 			}
//			
//			
//					
//		 	 			driver.findElement(By.id("name")).clear();
//
//						Thread.sleep(5000);
//
//		 				BaseTest.typeData(driver.findElement(By.id("name")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 4));
//
//				System.out.println("Correct name entered");
//				Thread.sleep(5000);
			//-
			///age//
				
				    driver.findElement(By.id("dobYear")).click();
				
					BaseTest.select_text(driver.findElement(By.id("dobYear")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 5));
					Thread.sleep(5000);

					System.out.println("lesser than 18 years selected");
					Thread.sleep(5000);

					System.out.println("Age must be greater than 21 years");
			
					Thread.sleep(5000);

					BaseTest.select_text(driver.findElement(By.id("dobDay")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 6));

					Thread.sleep(5000);

					BaseTest.select_text(driver.findElement(By.id("dobMonth")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 7));

					Thread.sleep(5000);

					/// martial status//
					
					driver.findElement(By.id("maritalStatus1")).click();
					Thread.sleep(5000);

					if (driver.findElement(By.id("maritalStatus1")).isSelected()) {
						
					}
					
					///height//
					Thread.sleep(5000);

					driver.findElement(By.id("heightFeet")).click();
					Thread.sleep(5000);

					Thread.sleep(5000);

					BaseTest.select_text(driver.findElement(By.id("heightFeet")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 8));

					Thread.sleep(5000);
					
					driver.findElement(By.id("heightFeet")).click();

					Thread.sleep(5000);
					driver.findElement(By.xpath("//option[@title=\"--- Feet/Inches ---\"]")).click();
					
					System.out.println("Please select the height");
					
					driver.findElement(By.id("heightFeet")).click();

					Thread.sleep(5000);

					BaseTest.select_text(driver.findElement(By.id("heightFeet")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 8));

					Thread.sleep(5000);
					
					///weight///
					
					BaseTest.select_text(driver.findElement(By.id("weightKgs")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 9));
                  System.out.println("55 kg selected");
                  
					Thread.sleep(5000);

					///body type//
					
					driver.findElement(By.id("bodyType3")).click();

					Thread.sleep(5000);
///                 ///complexion///
					driver.findElement(By.id("complexion1")).click();
					Thread.sleep(5000);

					///physical status///
					driver.findElement(By.id("physicalStatus0")).click();
                      ///subcaste//
					Thread.sleep(5000);

					try {
						BaseTest.typeData(driver.findElement(By.id("subCasteText")),BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 10));
						
						Thread.sleep(5000);
						BaseTest.typeData(driver.findElement(By.id("subCasteText")),BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 11));

						Thread.sleep(5000);
						
						System.out.println("correst subcaste entered");
						
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					Thread.sleep(5000);

					
					///religion//
					
					
					try {
						BaseTest.select_text(driver.findElement(By.id("religion")), BaseTest.getExcelDatanegativeditpi("Sheet4", 1, 10));
						Thread.sleep(5000);

						BaseTest.click(g.getsavebutton());
						Thread.sleep(5000);

						System.out.println("Select relgion with out sect");
						Thread.sleep(5000);

						
						String selcsect = driver.findElement(By.id("casteSpan")).getText();
						System.out.println("sect output = " + selcsect);
						
						Thread.sleep(5000);

						BaseTest.select_text(driver.findElement(By.id("caste")), BaseTest.getExcelDatanegativeditpi("Sheet4", 1, 11));

						Thread.sleep(5000);

						
						BaseTest.select_text(driver.findElement(By.id("religion")), BaseTest.getExcelDatanegativeditpi("Sheet4", 1, 12));

						Thread.sleep(5000);

						
						
						BaseTest.typeData(driver.findElement(By.id("subCasteText")),BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 13));
						Thread.sleep(5000);

						System.out.println("caste mentioned as ^^^^");
						
						System.out.println("Caste allowed special charactor");
						
						Thread.sleep(5000);
                      
						///mother tounge///
						Thread.sleep(5000);

						driver.findElement(By.id("motherTongue")).click();
						Thread.sleep(5000);

						BaseTest.select_text(driver.findElement(By.id("motherTongue")), BaseTest.getExcelDatanegativeditpi("Sheet4", 1, 14));
						Thread.sleep(5000);

						System.out.println("mother tounge - Empty");
						
						Thread.sleep(5000);

						  WebElement mt = driver.findElement(By.id("motherTongueSpan"));
			 	 			if (mt.isDisplayed()) {
			 	 				System.out.println("Please select the mothertounge");
			 	 			}else {
			 	 				System.out.println("Please select the mothertounge not selected");

			 	 			}
				
							Thread.sleep(5000);
							
							System.out.println("Gothra and subcaste having issue");
							
							///star///
			 	 			driver.findElement(By.id("star")).click();
							Thread.sleep(5000);

							BaseTest.select_text(driver.findElement(By.id("star")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 14));
                             System.out.println("valid star selected");

						    //raasi//
                             driver.findElement(By.id("raasi")).click();
 							Thread.sleep(5000);

 							BaseTest.select_text(driver.findElement(By.id("raasi")), BaseTest.getExcelDatanegativeditpi("Sheet1", 1, 15));
                              System.out.println("valid raasi selected");
                              //dosham//
                              
                              driver.findElement(By.id("dosham1")).click();
                              
                              // mother tounge///
                             
			 	 			driver.findElement(By.id("motherTongue")).click();
							Thread.sleep(5000);

							BaseTest.select_text(driver.findElement(By.id("motherTongue")), BaseTest.getExcelDatanegativeditpi("Sheet4", 1, 15));
							Thread.sleep(5000);
       
							
							///eating  habit///
							
							driver.findElement(By.id("eatingHabits1")).click();
							Thread.sleep(5000);

							///smoking///
							driver.findElement(By.id("smoke2")).click();
							Thread.sleep(5000);

							//drink//
							
							driver.findElement(By.id("drink1")).click();
							Thread.sleep(5000);

                            //// about me////
							driver.findElement(By.id("description")).clear();
							Thread.sleep(5000);

							System.out.println("below 50 charactor will be entered");
							Thread.sleep(5000);

							driver.findElement(By.id("description")).sendKeys("abcedfgh");
							
							
							Thread.sleep(5000);

							BaseTest.click(g.getsavebutton());
							Thread.sleep(5000);
							
							String fifty = driver.findElement(By.id("descriptionSpan")).getText();
							Thread.sleep(5000);

							System.out.println("less than fifty char = " + fifty);
							Thread.sleep(5000);

							System.out.println("more than 50 charactor will be entered");
							Thread.sleep(5000);
							
							driver.findElement(By.id("description")).sendKeys("abcedabcedfghfghabcedfghabcedfghabcedfghabcedfghabcedfghabcedfghabcedfghabcedfgh");

						
						
						
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					

					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	}		
	}