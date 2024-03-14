package Testcases;

import org.testng.annotations.Test;

public class TC_VerifyMenuToggle extends Baseclass {
	
	@Test
	public void Homepage()
	{
		Pageobjects.Homepage hm=new Pageobjects.Homepage(driver);
		hm.printmenutoggles();
	}
	

}
