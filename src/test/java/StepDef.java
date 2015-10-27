import java.util.Map;

import cucumber.api.java.en.*;
import main.Login;

/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with CloudAxis. This 
 * information shall not be distributed or copied without written 
 * permission from the CloudAxis.
 *
 ***************************************************************************/

/***************************************************************************
 *<PRE>
 * 
 *  Creation Date   : Oct 26, 2015
 * 
 *  Author          : Uwen
 * 
 *  Purpose         : TODO
 * 
 * 
 *  History         : TODO
 * 
 *</PRE>
 ***************************************************************************/
public class StepDef {
	Map<String, String> mp = Login.list();
	static String username ;
	static String password ;
	static boolean yesOrNot = false;
	
	
	@Given("^I have a username is (.*)$")
	public void i_have_a_username(String username) throws Throwable {
		StepDef.username = username;
	}

	@When("^I have a password is (.*)$")
	public void i_have_a_password(String password) throws Throwable {
		StepDef.password = password;
	}

	@Then("^I will login the system$")
	public void i_will_login_the_system() throws Throwable {
		yesOrNot = Login.check(mp, username, password);
	}
	
	@And("^The system will reply me a result$")
	public void the_system_will_reply_me() throws Throwable {
		if (yesOrNot) {
			System.out.println("\n\n\n\nthe system reply a true");
		}else{
			System.err.println("the system reply a false");
		}
		
	}

}
