
//We don't need step executor file in company. This is for understanding only

package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor
{
	public static void main(String[] args)
	{
		//browserlaunch
		Object[]input1=new Object[2];
		input1[0]="Chrome";
		input1[1]="C:\\Project1\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.BrowserLaunch(input1);
		
		//applctn launch
		Object[]input2=new Object[1];
		input2[0]="http://primusbank.qedgetech.com/";
		SeleniumOperations.appLaunch(input2);
		
		//username
		Object[]input3=new Object[2];
		input3[0]="//*[@id='txtuId']";
		input3[1]="Admin";
		SeleniumOperations.sendKey(input3);
		
		//password
		Object[]input4=new Object[2];
		input4[0]="//*[@id='txtPword']";
		input4[1]="Admin";
		SeleniumOperations.sendKey(input4);
		
		//click on login
		Object[]input5=new Object[1];
		input5[0]="//*[@id='login']";
		SeleniumOperations.click(input5);
		
		//click on branches
		Object[]input6=new Object[1];
		input6[0]="//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.click(input6);
		
		//select country
		Object[]input7=new Object[2];
		input7[0]="//*[@id='lst_countryS']";
		input7[1]="INDIA";
		SeleniumOperations.drop(input7);
		
		//select state
		Object[]input8=new Object[2];
		input8[0]="//*[@id='lst_stateS']";
		input8[1]="MAHARASTRA";
		SeleniumOperations.drop(input8);
		
		//select city
		Object[]input9=new Object[2];
		input9[0]="//*[@id='lst_cityS']";
		input9[1]="MUMBAI";
		SeleniumOperations.drop(input9);
		
		//search button
		Object[]input10=new Object[1];
		input10[0]="//*[@id='btn_search']";
		SeleniumOperations.click(input10);
		
		//cucumber validation
		Object[]input11=new Object[2];
		input11[0]="//*[@size='3']";
		input11[1]="Welcome to Admin";
		SeleniumOperations.valid(input11);
		
		//cucumber search
		Object[]input12=new Object[2];
		input12[0]="//*[@id='lab19']";
		input12[1]="Branch Details";
		SeleniumOperations.fnd(input12);
	}
}
