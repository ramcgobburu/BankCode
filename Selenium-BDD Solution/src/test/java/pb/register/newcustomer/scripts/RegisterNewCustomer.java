package pb.register.newcustomer.scripts;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import jxl.read.biff.BiffException;
import net.thucydides.core.annotations.Steps;
import pb.register.common.folder.SerenityVo;
import pb.register.newcustomer.steps.RegisterNewCustomerSteps;

public class RegisterNewCustomer {
	
	@Steps
	RegisterNewCustomerSteps registerNewCustomerSteps;
	

	
	
	@Given("Launch the Bank HomePage")
	public void launchWebPage() {
		
		System.setProperty("webdriver.safari.driver","/usr/bin/safaridriver");
		WebDriver driver = new SafariDriver();
		
		String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		
	}
	
	

		

}
