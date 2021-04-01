package homedepot;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 extends Base {
	@Parameters({"email","password","zipcode","phone"})
	@Test
	public void RegTest(@Optional("robfanio81@gmail.com")String email,@Optional("Softwaretester")String password,@Optional("08401")String zipcode,@Optional("6097052255") String phone) {
		register.ClickAccount();
		register.ClickRegister();
		register.SelectAccount();
		register.Email(email);
		register.PassWordInput(password);
		register.zipcodeInput(zipcode);
		register.phoneInput(phone);
		register.btnAcct();
	}
}
