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


public class inbox extends BaseTest {
	int i = 1;
	String abclogin =  "NEP140707" ;
	String xyzlogin = "NEP140675";
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
		BaseTest.typeData(g.getMatriID(), "nep140707");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		
		Thread.sleep(3000);
		BaseTest.click(g.getLogin_btn());
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

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
			
			
			Thread.sleep(3000);
			String searchprofile = "NEP768795" ;
			//NEP768795 = ashokumar

			//search started//
			try {
				WebElement search =	driver.findElement(By.xpath("//a[text()='Search']"));
				acc.moveToElement(search).build().perform();
				Thread.sleep(2000);	
				
				driver.findElement(By.xpath("//input[@class='searchbox bg']")).sendKeys("NEP768795");
				Thread.sleep(3000);
//
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);

			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Thread.sleep(10000);

			String parentwindow = driver.getWindowHandle();
			Set<String> childwindow = driver.getWindowHandles();
			for(String wh : childwindow) {
				if (!parentwindow.equals(wh)) {
					driver.switchTo().window(wh);
					
				}
			}
			
			String title = driver.getCurrentUrl();
			
			System.out.println("title" + title);
		
			Thread.sleep(30000);

			// to shortlist one profile//
			///clicked int to one profile//
			driver.findElement(By.xpath("//span[@class='vp-shortlistIcon']")).click();
			
			Thread.sleep(5000);

			
			//driver.findElement(By.xpath("(//span[@class='drpiconshin block-downarw'])[1]")).click();
			
		//	driver.findElement(By.id("Newfavouriteshow")).click();
			
			Thread.sleep(5000);

			
			//driver.findElement(By.xpath("(//div[@title='Shortlist this member'])[1]")).click();
			
			Thread.sleep(5000);


		//	WebElement sk = driver.findElement(By.xpath("(//a[text()='Skip'])[1]"));
			
			
			
		//	driver.findElement(By.id("Newfavouriteshow")).click();
			Thread.sleep(5000);

//			driver.findElement(By.xpath("(//a[@class='send-active-btn'])[1]")).click();
//			Thread.sleep(5000);
//
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ESCAPE);
				r.keyRelease(KeyEvent.VK_ESCAPE);

			} catch (Exception e) {
				// TODO: handle exception
			}
//			
//			
//			
			Thread.sleep(5000);

			try {

	             WebElement element = driver.findElement(By.xpath("//div[text()='Basic Details']"));
	             ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	             
			} catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(5000);

			//request body type//
			try {
				driver.findElement(By.xpath("(//span[@class='request-for-icon clr6'])[1]")).click();
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			

			Thread.sleep(5000);
			driver.findElement(By.id("accept_close")).click();
			
			Thread.sleep(5000);
			
			
        //inbox message-> send started//
		WebElement abc =	driver.findElement(By.id("menuMsgCnt"));
		Thread.sleep(5000);

		acc.moveToElement(abc).build().perform();
		Thread.sleep(2000);	
			//message sent//
		driver.findElement(By.xpath("//*[@id='msgpop']/div[2]/div/div[1]/ul[1]/li[2]/a")).click();	
			
		Thread.sleep(10000);	
		
		WebElement profile = driver.findElement(By.xpath("//span[text()='(NEP768795) ']"));
		String profileid = profile.getText();
		System.out.println("profileid" + profileid);
		Thread.sleep(2000);	
         ///send int to NEP768795
		String check = driver.findElement(By.id("msgdata0")).getText();
		System.out.println(check);
		Thread.sleep(5000);	

		if (profileid.equals(searchprofile)) {
			System.out.println("Sent interest matched");
		}else {
			System.out.println("Sent interest not matched");

		}
		
		
		//requesst sent started///
		
		
		
		Thread.sleep(10000);	

		WebElement abcd =	driver.findElement(By.id("menuMsgCnt"));
		Thread.sleep(5000);

		acc.moveToElement(abcd).build().perform();
		Thread.sleep(5000);	
		
		
		driver.findElement(By.xpath("//*[@id='msgpop']/div[2]/div/div[1]/ul[2]/li[2]/a")).click();	

		Thread.sleep(5000);	


		WebElement profile5 = driver.findElement(By.xpath("//span[text()='(NEP140675) ']"));
		String profileid5 = profile5.getText();
		System.out.println("profileid" + profileid5);
		Thread.sleep(2000);	

		String check5 = driver.findElement(By.id("msg_txtvalue0")).getText();
		System.out.println("sent request sentence " + check5);
		Thread.sleep(2000);	

		if (profile5.equals(searchprofile)) {
			System.out.println("Sent request matched");
		}else {
			System.out.println("Sent request not matched");

		}
		
		///logout//
        Thread.sleep(5000);

		 try {
	   			acc.moveToElement(g.getMenu_btn()).build().perform();
	   			} catch (Exception e) {
	   				acc.moveToElement(g.getMenu_btn1()).build().perform();
	   			}
	           
	           
	           
	           Thread.sleep(5000);
	           driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Thread.sleep(5000);
				
		
		/// relogin//
				
				Thread.sleep(1000);
				BaseTest.click(g.getMatriID());
				BaseTest.typeData(g.getMatriID(), "nep140707");
				
				Thread.sleep(1000);
				BaseTest.click(g.getPasswordClear());
				BaseTest.typeData(g.getPassword(), "cbstest");
				
				Thread.sleep(3000);
				BaseTest.click(g.getLogin_btn());
				Thread.sleep(3000);

				driver.navigate().refresh();
				Thread.sleep(3000);

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
					
					
					//inbox - message-message//
					
					
					Thread.sleep(10000);	

					WebElement abcde =	driver.findElement(By.id("menuMsgCnt"));
					Thread.sleep(5000);

					acc.moveToElement(abcde).build().perform();
					Thread.sleep(2000);	
					
					
					driver.findElement(By.id("menuMsgs")).click();	

					Thread.sleep(10000);	
					
					try {
					driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();	

					} catch (Exception e) {
						// TODO: handle exception
					}
                      
					Thread.sleep(10000);	

                      /// need to give interest received id///
					WebElement profiled = driver.findElement(By.xpath("//span[text()='(NEP140675) ']"));
					String profileidint = profiled.getText();
					System.out.println("profileid int" + profileidint);
					Thread.sleep(2000);	

					String checkf = driver.findElement(By.id("msgtext0")).getText();
					System.out.println("interest received sentence = " + checkf);
					Thread.sleep(2000);	

					
					String interestid = "NEP140675" ;
					
					if (profileidint.equals(interestid)) {
						System.out.println("opposite profile interest received matched");
					}else {
						System.out.println("opposite profile interest received not matched");

					}
					
					
					///inbox-received-request received start//
					

					Thread.sleep(10000);	

					WebElement abcdc =	driver.findElement(By.id("menuMsgCnt"));
					Thread.sleep(5000);

					acc.moveToElement(abcdc).build().perform();
					Thread.sleep(5000);
					
					
					driver.findElement(By.xpath("//*[@id='msgpop']/div[2]/div/div[1]/ul[2]/li[1]/a")).click();	

					Thread.sleep(5000);

					
					try {
						driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();	

						} catch (Exception e) {
							// TODO: handle exception
						}
					
					Thread.sleep(10000);	

					WebElement profile55 = driver.findElement(By.xpath("//span[text()='(NEP140675) ']"));
					String profileid551 = profile55.getText();
					System.out.println("profileid" + profileid551);
					Thread.sleep(2000);	

					String check551 = driver.findElement(By.id("msg_txtvalue0")).getText();
					System.out.println(check551);
					Thread.sleep(5000);	

					if (profileid551.equals(interestid)) {
						System.out.println("Opposite profile received request matched");
					}else {
						System.out.println("Opposite profile received request not matched");

					}
					
					///in xyz login///
					//123456 completed///
				
		/// accepted started///
//					Thread.sleep(10000);	
//
//					WebElement abcdef =	driver.findElement(By.id("menuMsgCnt"));
//					Thread.sleep(5000);
//
//					acc.moveToElement(abcdef).build().perform();
//					Thread.sleep(2000);	
//					
//					
//					driver.findElement(By.id("menuMsgs")).click();	
//					Thread.sleep(5000);
//					//clicked pending  - interest//
//					driver.findElement(By.id("RMPENDINGINT1")).click();	
//					Thread.sleep(5000);
//					//accept one profile//
//					driver.findElement(By.id("acceptdiv0")).click();
//					///accepted /// 
//					driver.findElement(By.id("RMACCEPTEDINT1")).click();
//					//
//
//					
//					abclogin = "NEP140707" ;
//					
//					WebElement profile55f = driver.findElement(By.xpath("//span[text()='(nep140707) ']"));
//					String profileid551f = profile55f.getText();
//					System.out.println("profileid" + profileid551f);
//					Thread.sleep(2000);	
//
//					String check551f = driver.findElement(By.id("msgdata0")).getText();
//					System.out.println("accepted sentence " + check551f);
//					Thread.sleep(2000);	
//
//					if (profileid551f.equals(abclogin)) {
//						System.out.println("Accepted id matched");
//					}else {
//						System.out.println("Accepted id not matched");
//
//					}
//					
//                     
					
					///decline strated in xyz login ///
					
					Thread.sleep(10000);	

					//clicked pending  - interest//
				//	driver.findElement(By.id("RMPENDINGINT1")).click();	
					
					//// decline clicked///
					driver.findElement(By.id("declinediv0")).click();	
					Thread.sleep(5000);
					//confirm decline//
					driver.findElement(By.xpath("//a[text()='Confirm']")).click();
					Thread.sleep(5000);
					//decline - > all//
					driver.findElement(By.id("RMDECLINEDALL1")).click();	
					Thread.sleep(5000);
                    String abclogin = "NEP140707" ;
                    Thread.sleep(5000);
					WebElement profile55fa = driver.findElement(By.xpath("//span[text()='(nep140707) ']"));
					String profileid551fa = profile55fa.getText();
					System.out.println("profileid" + profileid551fa);
					Thread.sleep(2000);	

					String check551fa = driver.findElement(By.id("msgdata0")).getText();
					System.out.println("decline sentence " + check551fa);
					Thread.sleep(2000);	

					if (profileid551fa.equals(abclogin)) {
						System.out.println("Decline id matched");
					}else {
						System.out.println("Decline id not matched");

					}
					
					
					/// accepted started in same page - change your mind//
                    Thread.sleep(5000);

					
					driver.findElement(By.id("accept0")).click();
                    Thread.sleep(5000);

					try {
						Robot robot = new Robot();
						robot.delay(5000);
						robot.keyPress(KeyEvent.VK_ESCAPE);
						robot.keyRelease(KeyEvent.VK_ESCAPE);
					} catch (Exception e) {
						// TODO: handle exception
					}
                    Thread.sleep(5000);

					driver.findElement(By.id("RMACCEPTEDINT1")).click();
					//
                    Thread.sleep(5000);

					
					abclogin = "NEP140707" ;
                    Thread.sleep(5000);

					WebElement profile55f = driver.findElement(By.xpath("//span[text()='(nep140707) ']"));
					String profileid551f = profile55f.getText();
					System.out.println("profileid" + profileid551f);
					Thread.sleep(2000);	

					String check551f = driver.findElement(By.id("msgdata0")).getText();
					System.out.println("accepted sentence " + check551f);
					Thread.sleep(2000);	

					if (profileid551f.equals(abclogin)) {
						System.out.println("Accepted id matched");
					}else {
						System.out.println("Accepted id not matched");

					}
					

					// need to login abc and check the inbox - sent - accepted message//
                    Thread.sleep(5000);

					
					 try {
				   			acc.moveToElement(g.getMenu_btn()).build().perform();
				   			} catch (Exception e) {
				   				acc.moveToElement(g.getMenu_btn1()).build().perform();
				   			}
				           
				           

				           Thread.sleep(5000);
				           driver.findElement(By.xpath("//a[text()='Logout']")).click();
							Thread.sleep(5000);
		                    Thread.sleep(5000);

					
					/// relogin//
							
							Thread.sleep(1000);
							BaseTest.click(g.getMatriID());
							BaseTest.typeData(g.getMatriID(), "nep140707");
							
							Thread.sleep(1000);
							BaseTest.click(g.getPasswordClear());
							BaseTest.typeData(g.getPassword(), "cbstest");
							
							Thread.sleep(3000);
							BaseTest.click(g.getLogin_btn());
							Thread.sleep(3000);

							driver.navigate().refresh();
							Thread.sleep(3000);

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
			                    Thread.sleep(5000);

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
								
								
								//inbox - message-message//
								
								
								Thread.sleep(10000);	

								WebElement abcdel =	driver.findElement(By.id("menuMsgCnt"));
								Thread.sleep(5000);

								acc.moveToElement(abcdel).build().perform();
								Thread.sleep(2000);	
								
								//send
								driver.findElement(By.xpath("//*[@id='msgpop']/div[2]/div/div[1]/ul[2]/li[2]/a")).click();	

								Thread.sleep(2000);	

								//sent - interest//
								driver.findElement(By.id("RMACCEPTEDINT1")).click();
			                    Thread.sleep(5000);

                               xyzlogin = "NEP140675";
                               Thread.sleep(5000);

								WebElement profile5x = driver.findElement(By.xpath("//span[text()='(NEP140675) ']"));
								String profileid5x = profile5x.getText();
								System.out.println("profileid" + profileid5x);
								Thread.sleep(2000);	

								String check5x = driver.findElement(By.id("msg_txtvalue0")).getText();
								System.out.println(check5x);
								Thread.sleep(2000);	

								if (profileid5x.equals(xyzlogin)) {
									System.out.println("opposite profile Interest accpted matched");
								}else {
									System.out.println("opposite profile Interest accpted not matched");

								}
								
					
					


					
		
	}
				}