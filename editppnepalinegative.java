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


public class editppnepalinegative extends BaseTest {
	
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
		//Robot r = new Robot();
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
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			
			Thread.sleep(1000);
			BaseTest.click(g.getEdit_Partner_Preference());
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("//a[@class='editIcon font12 clr6']")).click();
			Thread.sleep(15000);
                  ///martial status///
			
			//--
//			 driver.findElement(By.id("lookingStatus2")).click();
//
//				Thread.sleep(5000);
//
//		  String marital_status = BaseTest.getExcelDatappnegative("Sheet1", 1, 0);
//		if (marital_status.contains("Unmarried")&&!g.getunmarried().isSelected()) {
//			 BaseTest.click(g.getunmarried());
//			 System.out.println("unmarried selected");
//		}else {
//			
//		}
//		
//				Thread.sleep(5000);
//              System.out.println("only unmarried selected");
//				Thread.sleep(5000);
//
//              WebElement havechildren = driver.findElement(By.xpath("//label[text()='Have Children']"));
//				Thread.sleep(5000);
//
//              if (!havechildren.isDisplayed()) {
//				System.out.println("Only unmarried selected and no children selected = matched");
//			}else {
//				
//				System.out.println("Only unmarried selected and no children selected = not matched");
//
//			}
//				
//				Thread.sleep(5000);
//
// 			 driver.findElement(By.id("lookingStatus2")).click();
//
//              System.out.println("Unmarried & another option selected");
//			 
//              WebElement havechildren5 = driver.findElement(By.xpath("//label[text()='Have Children']"));
//				Thread.sleep(5000);
//
//            if (havechildren5.isDisplayed()) {
//				System.out.println("Unmarried & another option selected have children selected = matched");
//			}else {
//				
//				System.out.println("Unmarried & another option selected have children selected = not matched");
//
//			}
//			 
            //--
            ////age//
            
            
            
            
				
		//	}else if (marital_status.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
			//	 BaseTest.click(g.getwidow());
				// System.out.println("widow selected");
				 
		//	}else if (marital_status.contains("Divorced")&&!g.getdivorced().isSelected()) {
			//	 BaseTest.click(g.getdivorced());
				// System.out.println("divorced selected");
				 
		//	}else if (marital_status.contains("Doesn't matter")&&!g.getdoesntmatter().isSelected()) {
				 //BaseTest.click(g.getdoesntmatter());
				 //System.out.println("doesntmatter selected");
			
//--
//		Thread.sleep(10000);
//		
//			
//			driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]")).click();
//			Thread.sleep(5000);
//			
//			try {
//				BaseTest.select_text(driver.findElement(By.xpath("(//option[@value='22'])[1]")),"22");
//			} catch (Exception e) {
//				System.out.println("Age less than 31 = matched");
//				}
//			
			//--
//			try {
//				driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]")).sendKeys("22");
//		    		
//		    		//acc.doubleClick(ocu).perform();
//				
//					Thread.sleep(5000);
//			} catch (Exception e) {
//				System.out.println("sendkey");
//			}

			
			
//			try {
//	        	 WebElement ocu = driver.findElement(By.xpath("(//option[text()='"+getExcelDatarefine("Sheet1", 1, 1)+"[1]']"));
//		    		
//		    		acc.doubleClick(ocu).perform();
//				
//					Thread.sleep(5000);
//			} catch (Exception e) {
//System.out.println("ddd");
//}
//			
//			
//			try {
//				BaseTest.select_text(driver.findElement(By.xpath("(//option[@value='22'])[1]")),"22");
//			} catch (Exception e) {
//				System.out.println("visible");
//				}
//			
//			
//			
//			try {
//				BaseTest.select_index(driver.findElement(By.xpath("(//option[@value='22'])[1]")), 22);
//
//			} catch (Exception e) {
//				System.out.println("index");
//				}
//			
//			try {
//				BaseTest.select_string(driver.findElement(By.xpath("(//option[@value='22'])[1]")), "22");
//
//			} catch (Exception e) {
//				System.out.println("value");
//				}
//
//			//age to//
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]")).click();
//			Thread.sleep(5000);
//
//
//			BaseTest.select_text(driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]")),BaseTest.getExcelDatappnegative("Sheet1", 1, 2));
//
//			System.out.println("Age is 22 to 21 ");
//			
//			Thread.sleep(5000);
//
//			
//            WebElement agegrater = driver.findElement(By.id("tageSpan"));
//
//			Thread.sleep(5000);
//
//            if (agegrater.isDisplayed()) {
//				System.out.println("Age to should not grater than Age from = Selected ");
//			}else {
//				
//				System.out.println("Age to should not grater than Age from = Not Selected");
//
//			}
//			 
//			Thread.sleep(5000);
//			
//			BaseTest.select_text(driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]")),BaseTest.getExcelDatappnegative("Sheet1", 2, 1));
//			//age to//
//			Thread.sleep(5000);
//
//			BaseTest.select_text(driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]")),BaseTest.getExcelDatappnegative("Sheet1", 2, 2));
//
//			System.out.println("Age is 22 to 29 ");
//			
//		
//		
//		
			//--
			///height//
//			Thread.sleep(5000);
//
//			//driver.findElement(By.id("select2-heightFrom-container")).click();
//			Thread.sleep(5000);
//
//			WebElement heightfrom = driver.findElement(By.id("heightTo"));
//			Thread.sleep(5000);
//
//			BaseTest.select_index(heightfrom, 3);
//			Thread.sleep(5000);
//
//			try {
//				Robot robot = new Robot();
//				robot.delay(5000);
//				robot.keyPress(KeyEvent.VK_ESCAPE);
//				robot.keyRelease(KeyEvent.VK_ESCAPE);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//			Thread.sleep(5000);
//			System.out.println("Height to less than 6 inch has been setup");
//			Thread.sleep(5000);
//			WebElement ageless = driver.findElement(By.id("heightToSpan"));
//			Thread.sleep(5000);
//			String  ageis = ageless.getText();
//			
//			System.out.println("Height less than message = " + ageis );
//			
//			Thread.sleep(5000);
//
//			BaseTest.select_index(heightfrom, 8);
//			
//			System.out.println("More than 6 inch height has been setup");
//			Thread.sleep(5000);
//
//			
//			///physical status//
//			driver.findElement(By.id("physicalStatus0")).click();
//			
			

			//--
					
		Thread.sleep(5000);
		
		
		
//		String physical_status = BaseTest.getExcelDatappnegative("Sheet1", 1, 5);
//		if (physical_status.contains("Doesn't matter")&&!g.getphydoest().isSelected()) {
//			 BaseTest.click(g.getphydoest());
//			 System.out.println("physcial doesnt matter selected");
//			 
//				
//			}else if (physical_status.contains("Normal")&&!g.getphynormal().isSelected()) {
//				 BaseTest.click(g.getphynormal());
//				 System.out.println("physical normal selected");
//				 
//			}else if (physical_status.contains("Physically Challenged")&&!g.getphysicalchaleng().isSelected()) {
//				 BaseTest.click(g.getphysicalchaleng());
//				 System.out.println("physical challenged selected");
//				 
//			
//			}else {
//			
//			}
				
		////mother  tounge//
		try {
			  Select listbox = new Select(driver.findElement(By.id("motherTongue")));
				Thread.sleep(5000);

			   listbox.deselectAll();
				Thread.sleep(5000);

				
				BaseTest.select_text(driver.findElement(By.id("motherTongue")),BaseTest.getExcelDatappnegative("Sheet1", 1, 6));

              
		} catch (Exception e) {
   System.out.println("ds");
}
		
		
	Thread.sleep(5000);
	////star///
	
	try {
		  Select listbox = new Select(driver.findElement(By.id("star")));
			Thread.sleep(5000);

		   listbox.deselectAll();
			Thread.sleep(5000);

			BaseTest.select_text(driver.findElement(By.id("motherTongue")),BaseTest.getExcelDatappnegative("Sheet1", 1, 7));

        
	} catch (Exception e) {
System.out.println("star");
}
///manglik//
try {
	driver.findElement(By.id("manglik3")).click();
} catch (Exception e) {
	// TODO: handle exception
}
	

////religion///

try {
	  Select listbox = new Select(driver.findElement(By.id("religion")));
		Thread.sleep(5000);

	   listbox.deselectAll();
		Thread.sleep(5000);

		BaseTest.select_text(driver.findElement(By.id("religion")),BaseTest.getExcelDatappnegative("Sheet1", 1, 9));

    
} 
catch (Exception e) {
System.out.println("dst");
}
///
//education//


driver.findElement(By.id("educationTempradio1")).click();

///occupation//

try {
	  Select listbox = new Select(driver.findElement(By.id("occupation")));
		Thread.sleep(5000);

	   listbox.deselectAll();
		Thread.sleep(5000);

		BaseTest.select_text(driver.findElement(By.id("occupation")),BaseTest.getExcelDatappnegative("Sheet1", 1, 11));

  
} 
catch (Exception es) {
System.out.println("dst");
}

//citizen

try {
	  Select listbox = new Select(driver.findElement(By.id("citizenship")));
		Thread.sleep(5000);

	   listbox.deselectAll();
		Thread.sleep(5000);

		BaseTest.select_text(driver.findElement(By.id("citizenship")),BaseTest.getExcelDatappnegative("Sheet1", 1, 12));


} 
catch (Exception esd) {
System.out.println("dst");
}

//countrylivin

try {
	  Select listbox = new Select(driver.findElement(By.id("countryLivingIn")));
		Thread.sleep(5000);

	   listbox.deselectAll();
		Thread.sleep(5000);

		BaseTest.select_text(driver.findElement(By.id("countryLivingIn")),BaseTest.getExcelDatappnegative("Sheet1", 1, 13));


} 
catch (Exception esd) {
System.out.println("dst");
}

Thread.sleep(5000);

driver.findElement(By.id("eatingHabits2")).click();
Thread.sleep(5000);

driver.findElement(By.id("smokingHabits0")).click();

Thread.sleep(5000);

driver.findElement(By.id("drinkingHabits3")).click();

Thread.sleep(5000);
///anualincomefrom

try {
	  Select listbox = new Select(driver.findElement(By.id("fromIncomeINR")));
		Thread.sleep(5000);

	   listbox.deselectAll();
		Thread.sleep(5000);

		BaseTest.select_text(driver.findElement(By.id("fromIncomeINR")),BaseTest.getExcelDatappnegative("Sheet1", 1, 17));


} 
catch (Exception esd) {
System.out.println("dst");
}

///anualincometo
try {
	  Select listbox = new Select(driver.findElement(By.id("fromIncomeINR")));
		Thread.sleep(5000);

	   listbox.deselectAll();
		Thread.sleep(5000);

		BaseTest.select_text(driver.findElement(By.id("fromIncomeINR")),BaseTest.getExcelDatappnegative("Sheet1", 1, 17));


} 
catch (Exception esd) {
System.out.println("dst");
}

Thread.sleep(5000);



					driver.findElement(By.id("partnerDescription")).sendKeys("TestTestTestTest");
					Thread.sleep(5000);

					driver.findElement(By.id("btnSubmit")).click();
					
					
					
					
					
					
					
									

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
				
				
				
			
		
	
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				 
			
		
		

		
	}		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		





