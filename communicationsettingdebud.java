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


public class communicationsettingdebud extends BaseTest {
	int i = 1;

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
			
			
			Thread.sleep(5000);
           driver.findElement(By.xpath("(//a[text()='Communication Settings'])[1]")).click();
			Thread.sleep(5000);

			//email//
			///select all catagories and check enable all button invisible//
			
			
			
			//request//
//try {
//				
//				if (driver.findElement(By.id("Request")).isSelected()) {
//					System.out.println("request selected");
//				}else {
//					System.out.println("request not selected");
//				}
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
////shorlist//
//try {
//	
//	if (driver.findElement(By.id("Shortlist")).isSelected()) {
//		System.out.println("Shortlist selected");
//	}else {
//		System.out.println("Shortlist not selected");
//	}
//	
//} catch (Exception e) {
//	// TODO: handle exception
//}
////ProfileViews//
//try {
//	
//	if (driver.findElement(By.id("ProfileViews")).isSelected()) {
//		System.out.println("ProfileViews selected");
//	}else {
//		System.out.println("ProfileViews not selected");
//	}
//	
//} catch (Exception e) {
//	// TODO: handle exception
//}
////InterestAcceptance//
//try {
//	
//	if (driver.findElement(By.id("InterestAcceptance")).isSelected()) {
//		System.out.println("InterestAcceptance selected");
//	}else {
//		System.out.println("InterestAcceptance not selected");
//	}
//	
//} catch (Exception e) {
//	// TODO: handle exception
//}
////more email alert//
//Thread.sleep(3000);
//try {
//	driver.findElement(By.id("toggle_more")).click();
//} catch (Exception e) {
//	// TODO: handle exception
//}
//
////interst received//
//
//try {
//	driver.findElement(By.id("InterestReceived_2")).click();
//} catch (Exception e) {
//	// TODO: handle exception
//}
//
////reply received//
//try {
//	driver.findElement(By.id("ReplyReceived_2")).click();
//} catch (Exception e) {
//	// TODO: handle exception
//}
//
//
////id="RecentlyJoined"//
//try {
//	
//	if (driver.findElement(By.id("id=RecentlyJoined")).isSelected()) {
//		System.out.println("id=RecentlyJoined selected");
//	}else {
//		System.out.println("id=RecentlyJoined not selected");
//	}
//	
//} catch (Exception e) {
//	// TODO: handle exception
//}
////start matches//
//try {
//	
//	if (driver.findElement(By.id("StarMatches")).isSelected()) {
//		System.out.println("StarMatches selected");
//	}else {
//		System.out.println("StarMatches not selected");
//	}
//	
//} catch (Exception e) {
//	// TODO: handle exception
//}
////PhotoMatches//
//try {
//	
//	if (driver.findElement(By.id("PhotoMatches")).isSelected()) {
//		System.out.println("PhotoMatches selected");
//	}else {
//		System.out.println("PhotoMatches not selected");
//	}
//	
//} catch (Exception e) {
//	// TODO: handle exception
//}
////SimilarMatches//
//try {
//	
//	if (driver.findElement(By.id("SimilarMatches")).isSelected()) {
//		System.out.println("SimilarMatches selected");
//	}else {
//		System.out.println("SimilarMatches not selected");
//	}
//	
//} catch (Exception e) {
//	// TODO: handle exception
//}
//
////premium//
//
//
//
//try {
//	
//	if (driver.findElement(By.id("Premium")).isSelected()) {
//		System.out.println("Premium selected");
//	}else {
//		System.out.println("Premium not selected");
//	}
//	
//} catch (Exception e) {
//	// TODO: handle exception
//}
//			
//			
//			
//			
//			
//			
//			
//			
//				if (driver.findElement(By.id("Enable_all")).isSelected()) {
//					System.out.println("Enabled all sselected");
//				}else {
//					System.out.println("Enabled all not sselected");
//			
//			
//			
//			
//			
//	}
				
		/// enabled all completed////
		
				/// disabled all need to be valid and enabled button should shown///
				
				try {
					
					if (driver.findElement(By.id("Request")).isSelected()) {
						driver.findElement(By.id("Request")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//a[text()='Cancel']")).click();
						Thread.sleep(3000);
						System.out.println("request is  unselected");

						
					}else {
						System.out.println("request is already unselected");
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
	//shorlist//
				Thread.sleep(3000);

				
try {
					
					if (driver.findElement(By.id("Shortlist")).isSelected()) {
						driver.findElement(By.id("Shortlist")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//a[text()='Cancel']")).click();
						Thread.sleep(3000);
						System.out.println("Shortlist is  unselected");

						
					}else {
						System.out.println("Shortlist is already unselected");
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}

Thread.sleep(3000);

	
	//ProfileViews//
try {
	
	if (driver.findElement(By.id("ProfileViews")).isSelected()) {
		driver.findElement(By.id("ProfileViews")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		Thread.sleep(3000);
		System.out.println("ProfileViews is  unselected");

		
	}else {
		System.out.println("ProfileViews is already unselected");
	}
	
} catch (Exception e) {
	// TODO: handle exception
}
Thread.sleep(3000);

	
	//InterestAcceptance//
try {
	
	if (driver.findElement(By.id("InterestAcceptance")).isSelected()) {
		driver.findElement(By.id("InterestAcceptance")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		Thread.sleep(3000);
		System.out.println("InterestAcceptance is  unselected");

		
	}else {
		System.out.println("InterestAcceptance is already unselected");
	}
	
} catch (Exception e) {
	// TODO: handle exception
}


	
	//more email alert//
	Thread.sleep(3000);
	try {
		driver.findElement(By.id("toggle_more")).click();
	} catch (Exception e) {
		// TODO: handle exception
	}

	//interst received//
	Thread.sleep(3000);

	try {
		driver.findElement(By.id("InterestReceived_2")).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
	Thread.sleep(3000);

	//reply received//
	try {
		driver.findElement(By.id("ReplyReceived_2")).click();
	} catch (Exception e) {
		// TODO: handle exception
	}

	Thread.sleep(3000);

	//id="RecentlyJoined"//
	try {
		
		if (driver.findElement(By.id("RecentlyJoined")).isSelected()) {
			driver.findElement(By.id("RecentlyJoined")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Cancel']")).click();
			Thread.sleep(3000);
			System.out.println("RecentlyJoined is  unselected");

			
		}else {
			System.out.println("RecentlyJoined is already unselected");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	Thread.sleep(3000);

	//start matches//
try {
		
		if (driver.findElement(By.id("StarMatches")).isSelected()) {
			driver.findElement(By.id("StarMatches")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Cancel']")).click();
			Thread.sleep(3000);
			System.out.println("StarMatches is  unselected");

			
		}else {
			System.out.println("StarMatches is already unselected");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
Thread.sleep(3000);

	//PhotoMatches//		Thread.sleep(3000);

try {
	
	if (driver.findElement(By.id("PhotoMatches")).isSelected()) {
		driver.findElement(By.id("PhotoMatches")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		Thread.sleep(3000);
		System.out.println("PhotoMatches is  unselected");

		
	}else {
		System.out.println("PhotoMatches is already unselected");
	}
	
} catch (Exception e) {
	// TODO: handle exception
}
Thread.sleep(3000);

	//SimilarMatches//
try {
	
	if (driver.findElement(By.id("SimilarMatches")).isSelected()) {
		driver.findElement(By.id("SimilarMatches")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		Thread.sleep(3000);
		System.out.println("SimilarMatches is  unselected");

		
	}else {
		System.out.println("SimilarMatches is already unselected");
	}
	
} catch (Exception e) {
	// TODO: handle exception
}

Thread.sleep(3000);

	//premium//


driver.findElement(By.id("Premium")).click();
Thread.sleep(3000);

try {
	
	if (driver.findElement(By.id("Premium")).isSelected()) {
		driver.findElement(By.id("Premium")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		Thread.sleep(3000);
		System.out.println("Premium is  unselected");

		
	}else {
		System.out.println("Premium is already unselected");
	}
	
} catch (Exception e) {
	// TODO: handle exception
}		
				
				
	Thread.sleep(3000);

				
				
					if (driver.findElement(By.id("Enable_all")).isSelected()) {
						System.out.println("Enabled all sselected");
					}else {
						System.out.println("Enabled all not sselected");
				
				
				
				
				
		}
					
					////chrome notification///
					
					driver.findElement(By.xpath("//a[text()='Chrome Notifications']")).click();
					
					///select all catagories and check enable all button invisible//

			
					//request//
					//try {
//									
//									if (driver.findElement(By.id("Request")).isSelected()) {
//										System.out.println("request selected");
//									}else {
//										System.out.println("request not selected");
//									}
//									
//								} catch (Exception e) {
//									// TODO: handle exception
//								}
					////shorlist//
					//try {
					//	
//						if (driver.findElement(By.id("Shortlist")).isSelected()) {
//							System.out.println("Shortlist selected");
//						}else {
//							System.out.println("Shortlist not selected");
//						}
					//	
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					////ProfileViews//
					//try {
					//	
//						if (driver.findElement(By.id("ProfileViews")).isSelected()) {
//							System.out.println("ProfileViews selected");
//						}else {
//							System.out.println("ProfileViews not selected");
//						}
					//	
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					////InterestAcceptance//
					//try {
					//	
//						if (driver.findElement(By.id("InterestAcceptance")).isSelected()) {
//							System.out.println("InterestAcceptance selected");
//						}else {
//							System.out.println("InterestAcceptance not selected");
//						}
					//	
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					////more email alert//
					//Thread.sleep(3000);
					//try {
//						driver.findElement(By.id("toggle_more")).click();
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					//
					////interst received//
					//
					//try {
//						driver.findElement(By.id("InterestReceived_2")).click();
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					//
					////reply received//
					//try {
//						driver.findElement(By.id("ReplyReceived_2")).click();
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					//
					//
					////id="RecentlyJoined"//
					//try {
					//	
//						if (driver.findElement(By.id("id=RecentlyJoined")).isSelected()) {
//							System.out.println("id=RecentlyJoined selected");
//						}else {
//							System.out.println("id=RecentlyJoined not selected");
//						}
					//	
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					////start matches//
					//try {
					//	
//						if (driver.findElement(By.id("StarMatches")).isSelected()) {
//							System.out.println("StarMatches selected");
//						}else {
//							System.out.println("StarMatches not selected");
//						}
					//	
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					////PhotoMatches//
					//try {
					//	
//						if (driver.findElement(By.id("PhotoMatches")).isSelected()) {
//							System.out.println("PhotoMatches selected");
//						}else {
//							System.out.println("PhotoMatches not selected");
//						}
					//	
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					////SimilarMatches//
					//try {
					//	
//						if (driver.findElement(By.id("SimilarMatches")).isSelected()) {
//							System.out.println("SimilarMatches selected");
//						}else {
//							System.out.println("SimilarMatches not selected");
//						}
					//	
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
					//
					////premium//
					//
					//
					//
					//try {
					//	
//						if (driver.findElement(By.id("Premium")).isSelected()) {
//							System.out.println("Premium selected");
//						}else {
//							System.out.println("Premium not selected");
//						}
					//	
					//} catch (Exception e) {
//						// TODO: handle exception
					//}
//								
//								
//								
//								
//								
//								
//								
//								
//									if (driver.findElement(By.id("Enable_all")).isSelected()) {
//										System.out.println("Enabled all sselected");
//									}else {
//										System.out.println("Enabled all not sselected");
//								
//								
//								
//								
//								
//						}
									
							/// enabled all completed////
							
									/// disabled all need to be valid and enabled button should shown///
									
									try {
										
										if (driver.findElement(By.id("Request")).isSelected()) {
											driver.findElement(By.id("Request")).click();
											Thread.sleep(3000);
											driver.findElement(By.xpath("//a[text()='Cancel']")).click();
											Thread.sleep(3000);
											System.out.println("request is  unselected");

											
										}else {
											System.out.println("request is already unselected");
										}
										
									} catch (Exception e) {
										// TODO: handle exception
									}
						//shorlist//
									Thread.sleep(3000);

									
					try {
										
										if (driver.findElement(By.id("Shortlist")).isSelected()) {
											driver.findElement(By.id("Shortlist")).click();
											Thread.sleep(3000);
											driver.findElement(By.xpath("//a[text()='Cancel']")).click();
											Thread.sleep(3000);
											System.out.println("Shortlist is  unselected");

											
										}else {
											System.out.println("Shortlist is already unselected");
										}
										
									} catch (Exception e) {
										// TODO: handle exception
									}

					Thread.sleep(3000);

						
						//ProfileViews//
					try {
						
						if (driver.findElement(By.id("ProfileViews")).isSelected()) {
							driver.findElement(By.id("ProfileViews")).click();
							Thread.sleep(3000);
							driver.findElement(By.xpath("//a[text()='Cancel']")).click();
							Thread.sleep(3000);
							System.out.println("ProfileViews is  unselected");

							
						}else {
							System.out.println("ProfileViews is already unselected");
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					Thread.sleep(3000);

						
						//InterestAcceptance//
					try {
						
						if (driver.findElement(By.id("InterestAcceptance")).isSelected()) {
							driver.findElement(By.id("InterestAcceptance")).click();
							Thread.sleep(3000);
							driver.findElement(By.xpath("//a[text()='Cancel']")).click();
							Thread.sleep(3000);
							System.out.println("InterestAcceptance is  unselected");

							
						}else {
							System.out.println("InterestAcceptance is already unselected");
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}


						
						//more sms alert//
						Thread.sleep(3000);
						try {
							driver.findElement(By.id("toggle_more")).click();
						} catch (Exception e) {
							// TODO: handle exception
						}

						//interst received//
						Thread.sleep(3000);

						try {
							driver.findElement(By.id("InterestReceived_2")).click();
						} catch (Exception e) {
							// TODO: handle exception
						}
						Thread.sleep(3000);

						//reply received//
						try {
							driver.findElement(By.id("ReplyReceived_2")).click();
						} catch (Exception e) {
							// TODO: handle exception
						}

						Thread.sleep(3000);

						//id="RecentlyJoined"//
						try {
							
							if (driver.findElement(By.id("RecentlyJoined")).isSelected()) {
								driver.findElement(By.id("RecentlyJoined")).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//a[text()='Cancel']")).click();
								Thread.sleep(3000);
								System.out.println("RecentlyJoined is  unselected");

								
							}else {
								System.out.println("RecentlyJoined is already unselected");
							}
							
						} catch (Exception e) {
							// TODO: handle exception
						}
						Thread.sleep(3000);

						//start matches//
					try {
							
							if (driver.findElement(By.id("StarMatches")).isSelected()) {
								driver.findElement(By.id("StarMatches")).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//a[text()='Cancel']")).click();
								Thread.sleep(3000);
								System.out.println("StarMatches is  unselected");

								
							}else {
								System.out.println("StarMatches is already unselected");
							}
							
						} catch (Exception e) {
							// TODO: handle exception
						}
					Thread.sleep(3000);

						//PhotoMatches//		

					try {
						
						if (driver.findElement(By.id("PhotoMatches")).isSelected()) {
							driver.findElement(By.id("PhotoMatches")).click();
							Thread.sleep(3000);
							driver.findElement(By.xpath("//a[text()='Cancel']")).click();
							Thread.sleep(3000);
							System.out.println("PhotoMatches is  unselected");

							
						}else {
							System.out.println("PhotoMatches is already unselected");
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					Thread.sleep(3000);

						//SimilarMatches//
					try {
						
						if (driver.findElement(By.id("SimilarMatches")).isSelected()) {
							driver.findElement(By.id("SimilarMatches")).click();
							Thread.sleep(3000);
							driver.findElement(By.xpath("//a[text()='Cancel']")).click();
							Thread.sleep(3000);
							System.out.println("SimilarMatches is  unselected");

							
						}else {
							System.out.println("SimilarMatches is already unselected");
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}

					Thread.sleep(3000);

						//premium//


					driver.findElement(By.id("Premium")).click();
					Thread.sleep(3000);

					try {
						
						if (driver.findElement(By.id("Premium")).isSelected()) {
							driver.findElement(By.id("Premium")).click();
							Thread.sleep(3000);
							driver.findElement(By.xpath("//a[text()='Cancel']")).click();
							Thread.sleep(3000);
							System.out.println("Premium is  unselected");

							
						}else {
							System.out.println("Premium is already unselected");
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}		
									
									
						Thread.sleep(3000);

									
									
										if (driver.findElement(By.id("Enable_all")).isSelected()) {
											System.out.println("Enabled all sselected");
										}else {
											System.out.println("Enabled all not sselected");
									
									
									
									
									
							}	
										
										
							///sms///
										
										
										driver.findElement(By.xpath("//a[text()='SMS']")).click();
										
										///select all catagories and check enable all button invisible//

									////shorlist//
										//try {
										//	
//											if (driver.findElement(By.id("Shortlist")).isSelected()) {
//												System.out.println("Shortlist selected");
//											}else {
//												System.out.println("Shortlist not selected");
//											}
										//	
										//} catch (Exception e) {
//											// TODO: handle exception
										//}
										
									////ProfileViews//
										//try {
										//	
//											if (driver.findElement(By.id("ProfileViews")).isSelected()) {
//												System.out.println("ProfileViews selected");
//											}else {
//												System.out.println("ProfileViews not selected");
//											}
										//	
										//} catch (Exception e) {
//											// TODO: handle exception
										//}
										////InterestAcceptance//
										//try {
										//	
//											if (driver.findElement(By.id("InterestAcceptance")).isSelected()) {
//												System.out.println("InterestAcceptance selected");
//											}else {
//												System.out.println("InterestAcceptance not selected");
//											}
										//	
										//} catch (Exception e) {
//											// TODO: handle exception
										//}
										////more email alert//
										//Thread.sleep(3000);
										//try {
//											driver.findElement(By.id("toggle_more")).click();
										//} catch (Exception e) {
//											// TODO: handle exception
										//}
										//
										////interst received//
										//
										//try {
//											driver.findElement(By.id("InterestReceived_2")).click();
										//} catch (Exception e) {
//											// TODO: handle exception
										//}
										//
										////reply received//
										//try {
//											driver.findElement(By.id("ReplyReceived_2")).click();
										//} catch (Exception e) {
//											// TODO: handle exception
										//}
										//
										
									////PhotoMatches//
										//try {
										//	
//											if (driver.findElement(By.id("PhotoMatches")).isSelected()) {
//												System.out.println("PhotoMatches selected");
//											}else {
//												System.out.println("PhotoMatches not selected");
//											}
										//	
										//} catch (Exception e) {
//											// TODO: handle exception
										//}
										//try {
										//	
//											if (driver.findElement(By.id("Premium")).isSelected()) {
//												System.out.println("Premium selected");
//											}else {
//												System.out.println("Premium not selected");
//											}
										//	
										//} catch (Exception e) {
//											// TODO: handle exception
										//}
										
				//						if (driver.findElement(By.id("Enable_all")).isSelected()) {
//											System.out.println("Enabled all sselected");
//										}else {
//											System.out.println("Enabled all not sselected");
//									
//									
//									
//									
//									
//							}
										
								/// enabled all completed////
								
										/// disabled all need to be valid and enabled button should shown///
										
										//shorlist//
										Thread.sleep(3000);

										
						try {
											
											if (driver.findElement(By.id("Shortlist")).isSelected()) {
												driver.findElement(By.id("Shortlist")).click();
												Thread.sleep(3000);
												driver.findElement(By.xpath("//a[text()='Cancel']")).click();
												Thread.sleep(3000);
												System.out.println("Shortlist is  unselected");

												
											}else {
												System.out.println("Shortlist is already unselected");
											}
											
										} catch (Exception e) {
											// TODO: handle exception
										}

						Thread.sleep(3000);

							
							//ProfileViews//
						try {
							
							if (driver.findElement(By.id("ProfileViews")).isSelected()) {
								driver.findElement(By.id("ProfileViews")).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//a[text()='Cancel']")).click();
								Thread.sleep(3000);
								System.out.println("ProfileViews is  unselected");

								
							}else {
								System.out.println("ProfileViews is already unselected");
							}
							
						} catch (Exception e) {
							// TODO: handle exception
						}
						Thread.sleep(3000);

							
							//InterestAcceptance//
						try {
							
							if (driver.findElement(By.id("InterestAcceptance")).isSelected()) {
								driver.findElement(By.id("InterestAcceptance")).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//a[text()='Cancel']")).click();
								Thread.sleep(3000);
								System.out.println("InterestAcceptance is  unselected");

								
							}else {
								System.out.println("InterestAcceptance is already unselected");
							}
							
						} catch (Exception e) {
							// TODO: handle exception
						}
						//more sms alert//
						Thread.sleep(3000);
						try {
							driver.findElement(By.id("toggle_more")).click();
						} catch (Exception e) {
							// TODO: handle exception
						}

						//interst received//
						Thread.sleep(3000);

						try {
							driver.findElement(By.id("InterestReceived_2")).click();
						} catch (Exception e) {
							// TODO: handle exception
						}
						Thread.sleep(3000);

						//reply received//
						try {
							driver.findElement(By.id("ReplyReceived_2")).click();
						} catch (Exception e) {
							// TODO: handle exception
						}

						Thread.sleep(3000);

						//id="RecentlyJoined"//
						try {
							
							if (driver.findElement(By.id("RecentlyJoined")).isSelected()) {
								driver.findElement(By.id("RecentlyJoined")).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//a[text()='Cancel']")).click();
								Thread.sleep(3000);
								System.out.println("RecentlyJoined is  unselected");

								
							}else {
								System.out.println("RecentlyJoined is already unselected");
							}
							
						} catch (Exception e) {
							// TODO: handle exception
						}
			
			
						//PhotoMatches//		

						try {
							
							if (driver.findElement(By.id("PhotoMatches")).isSelected()) {
								driver.findElement(By.id("PhotoMatches")).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//a[text()='Cancel']")).click();
								Thread.sleep(3000);
								System.out.println("PhotoMatches is  unselected");

								
							}else {
								System.out.println("PhotoMatches is already unselected");
							}
							
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						try {
							
							if (driver.findElement(By.id("Premium")).isSelected()) {
								driver.findElement(By.id("Premium")).click();
								Thread.sleep(3000);
								driver.findElement(By.xpath("//a[text()='Cancel']")).click();
								Thread.sleep(3000);
								System.out.println("Premium is  unselected");

								
							}else {
								System.out.println("Premium is already unselected");
							}
							
						} catch (Exception e) {
							// TODO: handle exception
						}		
										
										
							Thread.sleep(3000);

										
										
											if (driver.findElement(By.id("Enable_all")).isSelected()) {
												System.out.println("Enabled all sselected");
											}else {
												System.out.println("Enabled all not sselected");
										
										
										
										
										
								}	
											
											
											
									
		
	}	
		
		
}









































































































































		
		
		

//for (int i = 3; i < 12; i++) {
//	
//	Thread.sleep(10000);
//
//	             
////			try {
////
////	             WebElement element = driver.findElement(By.xpath("(//ul[@class='comm_list'])["+i+"]"));
////	             ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
////	             
////			} catch (Exception e) {
////				// TODO: handle exception
////			}
//
//	
//	if (driver.findElement(By.xpath("(//span[@class='cbox_title'])["+i+"]")).isSelected()) {
//		WebElement Activitys = driver.findElement(By.xpath("(//span[@class='cbox_title'])["+i+"]"));
//
//		String Activitynames = Activitys.getText();
//		Thread.sleep(10000);
//
//		System.out.println( Activitynames + " Already selected ");
//		
//		
//	}  else {
//		Thread.sleep(10000);
//		WebElement Activity = driver.findElement(By.xpath("(//span[@class='cbox_title'])["+i+"]"));
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//span[@class='cbox_title'])["+i+"]")).click();
//		
//		Thread.sleep(10000);
//
//		String Activityname = Activity.getText();
//		Thread.sleep(10000);
//
//		System.out.println( Activityname + " ticked ");
//		
//		Thread.sleep(10000);
//	} 
//	
//	Thread.sleep(10000);
//
//	try {
//		driver.findElement(By.id("comm_sett")).click();
//		Thread.sleep(5000);
//        driver.findElement(By.xpath("//span[@class='loginclose']")).click();
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
//	
//    }
//	
//	Thread.sleep(10000);
//
//	if (driver.findElement(By.id("Enable_all")).isSelected()) {
//		System.out.println("Enabled all selected");
//	}else {
//		System.out.println("Enabled all not selected");
//
//	
//	
//
//		
//										
//}
//
//
//
//	
//}
//
////@Test
////public void setup5() throws Throwable {
////
//////driver.findElement(By.xpath("//a[text()='Chrome Notifications']")).click();
////for (int i = 1; i < 10; i++) {
//
////Thread.sleep(10000);
//
//     
////try {
////
////     WebElement element = driver.findElement(By.xpath("(//ul[@class='comm_list'])["+i+"]"));
////     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
////     
////} catch (Exception e) {
////	// TODO: handle exception
////}
////
////
////if (driver.findElement(By.xpath("(//span[@class='cbox_title'])["+i+"]")).isEnabled()) {
////WebElement Activitys = driver.findElement(By.xpath("(//span[@class='cbox_title'])["+i+"]"));
////
////String Activitynames = Activitys.getText();
////Thread.sleep(10000);
////
////System.out.println( Activitynames + " Already selected ");
////
////}  else {
////Thread.sleep(10000);
////WebElement Activity = driver.findElement(By.xpath("(//span[@class='cbox_title'])["+i+"]"));
////Thread.sleep(2000);
////
////driver.findElement(By.xpath("(//span[@class='cbox_title'])["+i+"]")).click();
////
////Thread.sleep(10000);
////
////String Activityname = Activity.getText();
////Thread.sleep(10000);
////
////System.out.println( Activityname + " ticked ");
////
////Thread.sleep(10000);
////} 
////
////Thread.sleep(10000);
//////
////try {
////driver.findElement(By.id("comm_sett")).click();
////Thread.sleep(5000);
////driver.findElement(By.xpath("//span[@class='loginclose']")).click();
////
////} catch (Exception e) {
////// TODO: handle exception
////}
////
////// }
//////
//////Thread.sleep(10000);
////
////if (driver.findElement(By.id("Enable_all")).isSelected()) {
////System.out.println("Enabled all selected");
////}else {
////System.out.println("Enabled all not selected");
////////
//////
//
//
//
//							
//
//
////
////
////
////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		





