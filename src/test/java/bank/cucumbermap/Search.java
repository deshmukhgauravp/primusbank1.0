package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 
{
	@When("^user clicks on branches$")
	public void user_clicks_on_branches() throws Throwable
	{
		Object[]input6=new Object[1];
		input6[0]="//*[@src='images/Branches_but.jpg']";
		Hashtable<String,Object>input6op=SeleniumOperations.click(input6);
		HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(),"user clicks on branches",input6op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as country$")
	public void user_select_as_country(String drop) throws Throwable
	{
		Object[]input7=new Object[2];
		input7[0]="//*[@id='lst_countryS']";
		input7[1]=drop;
		Hashtable<String,Object>input7op=SeleniumOperations.drop(input7);
		HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(),"user select \"([^\"]*)\" as country",input7op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as state$")
	public void user_select_as_state(String drop) throws Throwable 
	{
		Object[]input8=new Object[2];
		input8[0]="//*[@id='lst_stateS']";
		input8[1]=drop;
		Hashtable<String,Object>input8op=SeleniumOperations.drop(input8);
		HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(),"user select\"([^\"]*)\" as state",input8op.get("MESSAGE").toString());
	}

	@When("^user select \"([^\"]*)\" as city$")
	public void user_select_as_city(String drop) throws Throwable 
	{
		Object[]input9=new Object[2];
		input9[0]="//*[@id='lst_cityS']";
		input9[1]=drop;
		Hashtable<String,Object>input9op=SeleniumOperations.drop(input9);
		HTMLReportGenerator.StepDetails(input9op.get("STATUS").toString(),"user select\"([^\"]*)\" as city",input9op.get("MESSAGE").toString());
	}

	@When("^user clicks on Search button$")
	public void user_clicks_on_Search_button() throws Throwable
	{
		Object[]input10=new Object[1];
		input10[0]="//*[@id='btn_search']";
		Hashtable<String,Object>input10op=SeleniumOperations.click(input10);
		HTMLReportGenerator.StepDetails(input10op.get("STATUS").toString(),"user clicks on Search button",input10op.get("MESSAGE").toString());
	}

	@Then("^application shows listed branches from \"([^\"]*)\" city$")
	public void application_shows_listed_branches_from_city(String abc) throws Throwable 
	{
	    Object[]input12=new Object[2];
	    input12[0]="//*[@id='lab19']";
	    input12[1]=abc;
	    Hashtable<String,Object>input11op=SeleniumOperations.click(input12);
		HTMLReportGenerator.StepDetails(input11op.get("STATUS").toString(),"application shows listed branches from \"([^\"]*)\" city",input11op.get("MESSAGE").toString());
	}
}
