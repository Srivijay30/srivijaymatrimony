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


public class Search_Regularsearch extends BaseTest {
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
			
			
			
			Thread.sleep(5000);
//            try {
//				driver.findElement(By.xpath("//a[text()='My Home']")).click();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			Thread.sleep(5000);

			
			try {
				driver.findElement(By.xpath("//a[text()='Search']")).click();
			} catch (Exception e) {
				System.out.println("5");
			}
//			Thread.sleep(7000);
////			try {
//				driver.findElement(By.xpath("//a[text()='Search']")).click();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			Thread.sleep(4000);
//
//			try {
//				driver.findElement(By.xpath("//a[text()='Search']")).click();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			// age///
			
			Thread.sleep(5000);
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
				if (marital_status.contains("Unmarried")&&!g.getunmarried().isEnabled()) {
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
				 	
				Thread.sleep(5000);
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
			   driver.findElement(By.id("casteTemp")).click();
			Thread.sleep(5000);
	       
	        	WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 1, 22)+"']"));
	    		
	    		//acc.contextClick(ele).perform();
	    		acc.doubleClick(ele).perform();
			} catch (Exception e) {
				System.out.println("ele");
			}
			
			//denominatioh for sri///
			
			// if active  srilanka we need to delete  pakistan clan
			try {
				
			
			 driver.findElement(By.id("casteTemp")).click();
				Thread.sleep(5000);
		       
		        	WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 1, 22)+"']"));
		    		
		    		//acc.contextClick(ele).perform();
		    		acc.doubleClick(ele).perform();
				} catch (Exception e) {
					System.out.println("ele");
				}
			

		    
						
//////// mother tounge////////////
			//WebElement menu = driver.findElement(By.id("motherTongueTemp"));
				//WebElement	option = menu.findElement(By.xpath("//option[@title='Hindi']"));

					//acc.doubleClick(option).perform();
			
			Thread.sleep(5000);

		driver.findElement(By.id("motherTongueTemp")).click();
		Thread.sleep(5000);
        try {
        	WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 1, 6)+"']"));
    		
    		//acc.contextClick(ele).perform();
    		acc.doubleClick(ele).perform();
		} catch (Exception e) {
			System.out.println("ele");
		}
		Thread.sleep(5000);

        try {
        	 WebElement button = driver.findElement(By.xpath("//dt[text()='Country living in']"));
             JavascriptExecutor jse = (JavascriptExecutor)driver;
             jse.executeScript("arguments[0].scrollintoView(true)", button);
		} catch (Exception e) {
			// TODO: handle exception
		}
        Thread.sleep(2000);
       try {
    	   driver.findElement(By.id("countryTemp")).click();
   		Thread.sleep(5000);
    	   
    	   WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 1, 10)+"']"));
   		acc.doubleClick(ele).perform();
	} catch (Exception e) {
		// TODO: handle exception
	}
        
  		Thread.sleep(5000);

       try {
    	   driver.findElement(By.id("educationTemp")).click();
   		Thread.sleep(5000);
    	   
    	   WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 1, 8)+"']"));
   		acc.doubleClick(ele).perform();
	} catch (Exception e) {
		// TODO: handle exception
	}
       
      ///show profile with//////
  		Thread.sleep(5000);
  		 try {
        	 WebElement button = driver.findElement(By.xpath("//dt[text()='Show profiles with']"));
             JavascriptExecutor jse = (JavascriptExecutor)driver;
             jse.executeScript("arguments[0].scrollintoView(true)", button);
		} catch (Exception e) {
			// TODO: handle exception
		}
  		

  		Thread.sleep(7000);
		
			String shwoprofilewithpho = BaseTest.getExcelDatasearch("Sheet1", 1, 11);
			if (shwoprofilewithpho.contains("Photo")&&!g.getphotoOpt().isSelected()) {
				 BaseTest.click(g.getphotoOpt());
				 System.out.println("photo selected");
				 
					
				}
			
			 try {
	        	 WebElement button = driver.findElement(By.xpath("//dt[text()='Show profiles with']"));
	             JavascriptExecutor jsew = (JavascriptExecutor)driver;
	             jsew.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e5) {
				// TODO: handle exception
			}
			
			
	  		Thread.sleep(3000);

			String shwoprofilewithhor = BaseTest.getExcelDatasearch("Sheet1", 1, 31);

			if (shwoprofilewithhor.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
					 BaseTest.click(g.gethoroscopeOpt());
					 System.out.println("horoscope selected");
					 
				}else {
					
				}
			
		
  		Thread.sleep(5000);

		////dont show/// first two selected
		
		try {
			String dnotshow = BaseTest.getExcelDatasearch("Sheet1", 1, 12);
			if (dnotshow.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
				 BaseTest.click(g.getalreadyContOpt());
				 System.out.println("profile already contacted selected");
				 
					
				}		
			String dnotshows = BaseTest.getExcelDatasearch("Sheet1", 1, 27);

			if (dnotshows.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
					 BaseTest.click(g.getalreadyViewedOpt());
					 System.out.println("Profiles already viewed selected");
					 
				}
			if (dnotshow.contains("Shortlisted profiles")&&!g.getshortlistOpt().isSelected()) {
					 BaseTest.click(g.getshortlistOpt());
					 System.out.println("Shortlisted profiles  selected");
					 
				}
			if (dnotshow.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
					 BaseTest.click(g.getignoredOpt());
					 System.out.println("Profiles i have blocked selected");
				}
			if (dnotshow.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
					 BaseTest.click(g.getigOpt());
				
					 System.out.println("Profiles i have ignored selected");
				}
			else {
					
				}				
			
			
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			
			Thread.sleep(10000);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(10000);
		try {
			Thread.sleep(10000);
			
			WebElement agefrom =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
			String age = agefrom.getText();
			System.out.println("Age  = " + age);
			String[] split3 = age.split(" yrs");
			int ageis = Integer.parseInt(split3[0]);
			System.out.println("ageis:" + ageis);


			int agefro = 22;
			
			int ageto = 29;
			
			if (agefro<=ageis && ageis>=ageto) {
				System.out.println("age matched");
				
				
			}else {
				System.out.println("age not matched");
			}
			
				

			WebElement heigh =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
			String height = heigh.getText();
			System.out.println("height  = " + height);
			String[] split35 = age.split(",");
			String[] split351 = age.split(" ft");

			int heights = Integer.parseInt(split351[0]);
			System.out.println("heights:" + heights);
			
			int heighfrom = 4;
            int heighto = 5;
            
            if (heighfrom<=heights && heights>=heighto) {
				System.out.println("height matched");
				
				
			}else {
				System.out.println("height not matched");
			}
            
            
		} catch (Exception e) {
			// TODO: handle exception
		}
			try {
				//religon//
				
				String religion = driver.findElement(By.xpath("(//span[@class='input-data'])[2]")).getText();
				System.out.println("location = " + religion);
				if (religion.equalsIgnoreCase(BaseTest.getExcelDatasearch("Sheet1", 1, 21))) {
					
				}
			
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			try {
				//clan//
				
				String religion = driver.findElement(By.xpath("(//span[@class='input-data'])[3]")).getText();
				System.out.println("location = " + religion);
				if (religion.equalsIgnoreCase(BaseTest.getExcelDatasearch("Sheet1", 1, 22))) {
					
				}
			
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
		
		
		
		/// modify search//
		
		if (driver.findElement(By.xpath("//input[@value='Modify Search']")).isDisplayed()) {
			try {
				driver.findElement(By.xpath("//a[text()='Search']")).click();
				Thread.sleep(10000);
				driver.findElement(By.xpath("//a[text()='Search']")).click();
			} catch (Exception e) {
				System.out.println("5");
			}
             ///2nd line excel parameters////
			// age///
			
			Thread.sleep(5000);
			BaseTest.select_text(g.getageFrom(), BaseTest.getExcelDatasearch("Sheet1", 2, 1));
			Thread.sleep(5000);
			BaseTest.select_text(g.getageTo(), BaseTest.getExcelDatasearch("Sheet1", 2, 2));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelDatasearch("Sheet1", 2, 3));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelDatasearch("Sheet1", 2, 4));
			Thread.sleep(5000);
			
			///marital status//
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
				String marital_status5 = BaseTest.getExcelDatasearch("Sheet1", 2, 0);
				if (marital_status5.contains("Unmarried")&&!g.getunmarried().isEnabled()) {
					 BaseTest.click(g.getunmarried());
					 System.out.println("unmarried selected");
					 Thread.sleep(5000);
	
					}
				
				marital_statuswid5 = BaseTest.getExcelDatasearch("Sheet1", 2, 23);
	
				if (marital_statuswid5.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
						 BaseTest.click(g.getwidow());
						 System.out.println("widow selected");
						 
						 marital_statusdiv = BaseTest.getExcelDatasearch("Sheet1", 2, 24);
	
					} if (marital_statusdiv.contains("Divorced")&&!g.getdivorced().isSelected()) {
						 BaseTest.click(g.getdivorced());
						 System.out.println("divorced selected");
						 
						// marital_statusany = BaseTest.getExcelDatasearch("Sheet1", 1, 25);
	
					//} if (marital_statusany.contains("Any")&&!g.getany().isSelected()) {
						// BaseTest.click(g.getany());
						 //System.out.println("Any selected");
						 
	
					}
					try {
						 marital_statussep5 = BaseTest.getExcelDatasearch("Sheet1", 2, 25);
	
							if (marital_statussep5.contains("Separated")&&!g.getseprated().isSelected()) {
								 BaseTest.click(g.getseprated());
								 System.out.println("seprated selected");
							}else {
								
							}	
					} catch (Exception e) {
						// TODO: handle exception
					}
				 	
				Thread.sleep(5000);
			/// children//
				try {
					String children = BaseTest.getExcelDatasearch("Sheet1", 2, 26);
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
				BaseTest.select_text(g.getreli(), BaseTest.getExcelDatasearch("Sheet1", 2, 21));

			
			
			
			///clan for pak//
			   driver.findElement(By.id("casteTemp")).click();
			Thread.sleep(5000);
	       
	        	WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 2, 22)+"']"));
	    		
	    		//acc.contextClick(ele).perform();
	    		acc.doubleClick(ele).perform();
			} catch (Exception e) {
				System.out.println("ele");
			}
			
			//denominatioh for sri///
			
			// if active  srilanka we need to delete  pakistan clan
			try {
				
			
			 driver.findElement(By.id("casteTemp")).click();
				Thread.sleep(5000);
		       
		        	WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 2, 22)+"']"));
		    		
		    		//acc.contextClick(ele).perform();
		    		acc.doubleClick(ele).perform();
				} catch (Exception e) {
					System.out.println("ele");
				}
			

		    
						
//////// mother tounge////////////
			
			
			Thread.sleep(5000);

		driver.findElement(By.id("motherTongueTemp")).click();
		Thread.sleep(5000);
        try {
        	WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 2, 6)+"']"));
    		
    		//acc.contextClick(ele).perform();
    		acc.doubleClick(ele).perform();
		} catch (Exception e) {
			System.out.println("ele");
		}
		Thread.sleep(5000);

        try {
        	 WebElement button = driver.findElement(By.xpath("//dt[text()='Country living in']"));
             JavascriptExecutor jse = (JavascriptExecutor)driver;
             jse.executeScript("arguments[0].scrollintoView(true)", button);
		} catch (Exception e) {
			// TODO: handle exception
		}
        Thread.sleep(2000);
       try {
    	   driver.findElement(By.id("countryTemp")).click();
   		Thread.sleep(5000);
    	   
    	   WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 2, 10)+"']"));
   		acc.doubleClick(ele).perform();
	} catch (Exception e) {
		// TODO: handle exception
	}
        
  		Thread.sleep(5000);

       try {
    	   driver.findElement(By.id("educationTemp")).click();
   		Thread.sleep(5000);
    	   
    	   WebElement ele = driver.findElement(By.xpath("//option[text()='"+getExcelDatasearch("Sheet1", 2, 8)+"']"));
   		acc.doubleClick(ele).perform();
	} catch (Exception e) {
		// TODO: handle exception
	}
       
      ///show profile with//////
  		Thread.sleep(5000);
  		 try {
        	 WebElement button = driver.findElement(By.xpath("//dt[text()='Show profiles with']"));
             JavascriptExecutor jse = (JavascriptExecutor)driver;
             jse.executeScript("arguments[0].scrollintoView(true)", button);
		} catch (Exception e) {
			// TODO: handle exception
		}
  		

  		Thread.sleep(7000);
		
			String shwoprofilewithpho5 = BaseTest.getExcelDatasearch("Sheet1", 2, 11);
			if (shwoprofilewithpho5.contains("Photo")&&!g.getphotoOpt().isSelected()) {
				 BaseTest.click(g.getphotoOpt());
				 System.out.println("photo selected");
				 
					
				}
			
			 try {
	        	 WebElement button = driver.findElement(By.xpath("//dt[text()='Show profiles with']"));
	             JavascriptExecutor jsew = (JavascriptExecutor)driver;
	             jsew.executeScript("arguments[0].scrollintoView(true)", button);
			} catch (Exception e5) {
			}
			
			
	  		Thread.sleep(3000);

			String shwoprofilewithhor5 = BaseTest.getExcelDatasearch("Sheet1", 2, 31);

			if (shwoprofilewithhor5.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
					 BaseTest.click(g.gethoroscopeOpt());
					 System.out.println("horoscope selected");
					 
				}else {
					
				}
			
		
  		Thread.sleep(5000);

		////dont show/// first two selected
		
		try {
			String dnotshow = BaseTest.getExcelDatasearch("Sheet1", 2, 12);
			if (dnotshow.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
				 BaseTest.click(g.getalreadyContOpt());
				 System.out.println("profile already contacted selected");
				 
					
				}		
			String dnotshows = BaseTest.getExcelDatasearch("Sheet1", 2, 27);

			if (dnotshows.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
					 BaseTest.click(g.getalreadyViewedOpt());
					 
					 
					 System.out.println("Profiles already viewed selected");
					 
				}
			if (dnotshow.contains("Shortlisted profiles")&&!g.getshortlistOpt().isSelected()) {
					 BaseTest.click(g.getshortlistOpt());
					 System.out.println("Shortlisted profiles  selected");
					 
				}
			if (dnotshow.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
					 BaseTest.click(g.getignoredOpt());
					 System.out.println("Profiles i have blocked selected");
				}
			if (dnotshow.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
					 BaseTest.click(g.getigOpt());
				
					 System.out.println("Profiles i have ignored selected");
				}
			else {
					
				}				
			
			
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			
			Thread.sleep(10000);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(10000);
		try {
			Thread.sleep(10000);
			
			WebElement agefrom =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
			String age = agefrom.getText();
			System.out.println("Age  = " + age);
			String[] split3 = age.split(" yrs");
			int ageis = Integer.parseInt(split3[0]);
			System.out.println("ageis:" + ageis);


			int agefro = 22;
			
			int ageto = 33;
			
			if (agefro<=ageis && ageis>=ageto) {
				System.out.println("age matched");
				
				
			}else {
				System.out.println("age not matched");
			}
			
				

			WebElement heigh =driver.findElement(By.xpath("(//span[@class='input-data'])[1]"));
			String height = heigh.getText();
			System.out.println("height  = " + height);
			String[] split35 = age.split(",");
			String[] split351 = age.split(" ft");

			int heights = Integer.parseInt(split351[0]);
			System.out.println("heights:" + heights);
			
			int heighfrom = 4;
            int heighto = 5;
            
            if (heighfrom<=heights && heights>=heighto) {
				System.out.println("height matched");
				
				
			}else {
				System.out.println("height not matched");
			}
            
            
		} catch (Exception e) {
			// TODO: handle exception
		}
			try {
				//religon//
				
				String religion = driver.findElement(By.xpath("(//span[@class='input-data'])[2]")).getText();
				System.out.println("location = " + religion);
				if (religion.equalsIgnoreCase(BaseTest.getExcelDatasearch("Sheet1", 2, 21))) {
					
				}
			
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			try {
				//clan//
				
				String religion = driver.findElement(By.xpath("(//span[@class='input-data'])[3]")).getText();
				System.out.println("location = " + religion);
				if (religion.equalsIgnoreCase(BaseTest.getExcelDatasearch("Sheet1", 2, 22))) {
					
				}
			
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		
		
		//// advance search////
		
		
	}	
	}		
}