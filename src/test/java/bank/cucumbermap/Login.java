package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	@When("^user opens \"([^\"]*)\" browser and exe \"([^\"]*)\"$")
	public void user_opens_browser_and_exe(String browser, String exepath) throws Throwable 
	{
		Object[]input1=new Object[2];
		input1[0]=browser;
		input1[1]=exepath;
		SeleniumOperations.BrowserLaunch(input1);
	 }

	@When("^user enters url \"([^\"]*)\"$")
	public void user_enters_url(String url) throws Throwable 
	{
		Object[]input2=new Object[1];
		input2[0]=url;
		SeleniumOperations.appLaunch(input2);
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String value) throws Throwable 
	{
		Object[]input3=new Object[2];
		input3[0]="//*[@id='txtuId']";
		input3[1]=value;
		Hashtable<String,Object>input2op=SeleniumOperations.sendKey(input3);
	HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"user enters\"([^\"]*)\" as username",input2op.get("MESSAGE").toString());
		
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String pass) throws Throwable 
	{ 
		Object[]input4=new Object[2];
		input4[0]="//*[@id='txtPword']";
		input4[1]=pass;
		Hashtable<String,Object>input3op=SeleniumOperations.sendKey(input4);
		HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"user enters\"([^\"]*)\" as password",input3op.get("MESSAGE").toString());
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable 
	{
		Object[]input5=new Object[1];
		input5[0]="//*[@id='login']";
		Hashtable<String,Object>input4op=SeleniumOperations.click(input5);
		HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"user clicks on login button",input4op.get("MESSAGE").toString());
	}

	@Then("^user is on the \"([^\"]*)\" main page and get message as Welcome to Admin$")
	public void user_is_on_the_main_page_and_get_message_as_Welcome_to_Admin(String msg) throws Throwable
	{
		Object[]input11=new Object[2];
		input11[0]="//*[@size='3']";
		input11[1]=msg;
		Hashtable<String,Object>input5op=SeleniumOperations.valid(input11);
		HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"user is on the \"([^\"]*)\" main page and get message as Welcome to Admin",input5op.get("MESSAGE").toString());
	}
}
