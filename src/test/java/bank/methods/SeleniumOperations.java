package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	//browserlaunch
	public static Hashtable<String,Object> BrowserLaunch(Object[]inputParameters)
	{
		try 
		{
		String browser=(String) inputParameters[0];
		String exepath=(String) inputParameters[1];
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", exepath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", exepath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
		   outputParameters.put("STATUS", "PASS");
		   outputParameters.put("MESSAGE", "Action:BrowserLaunch,Input given:"+inputParameters[0].toString());
		}
		catch(Throwable e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:BrowserLaunch,Input given:"+inputParameters[0].toString());
		}
		return outputParameters;
	}
	//applctn launch
	public static Hashtable<String,Object> appLaunch(Object[]inputParameters)
	{
		try 
		{
		String url=(String) inputParameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    outputParameters.put("STATUS", "PASS");
		    outputParameters.put("MESSAGE", "Action:BrowserLaunch,Input given:"+inputParameters[0].toString());
	    }
		catch(Throwable e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:BrowserLaunch,Input given:"+inputParameters[0].toString());
		}
		return outputParameters;
	}
	
    //sendkeys
	public static Hashtable<String,Object> sendKey(Object[]inputParameters)
	{
		try 
		{		
		String xpath=(String) inputParameters[0];        
		String value=(String) inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action:SendKey,Input given:"+inputParameters[1].toString()); 
		}
		catch(Throwable e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "Action:SendKey,Input given:"+inputParameters[1].toString()); 
		}
		return outputParameters;
	}
	//click
	public static Hashtable<String,Object> click(Object[]inputParameters)
	{
		try
		{
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    outputParameters.put("STATUS", "PASS");
            outputParameters.put("MESSAGE", "Action:Click,Input given:"+inputParameters[0].toString()); 
		}
		catch(Throwable e)
		{
			outputParameters.put("STATUS", "FAIL");
            outputParameters.put("MESSAGE", "Action:Click,Input given:"+inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//dropdown
	public static Hashtable<String,Object> drop(Object[]inputParameters)
	{
		try 
		{
		String xpath=(String) inputParameters[0];
		String name=(String) inputParameters[1];
		Select abc=new Select(driver.findElement(By.xpath(xpath)));
		abc.selectByVisibleText(name);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action:dropdown,Input given:"+inputParameters[1].toString()); 
		}
		catch(Throwable e)
		{
			outputParameters.put("STATUS", "FAIL");
	        outputParameters.put("MESSAGE", "Action:dropdown,Input given:"+inputParameters[1].toString());
		}
		return outputParameters;
	}
	
	//cucumber validation step
	public static Hashtable<String,Object> valid(Object[]inputParameters)
	{
		String xpath=(String) inputParameters[0];
		String string1=(String) inputParameters[1];
		
		WebElement web=driver.findElement(By.xpath(xpath));
		String string2=web.getText();
		
	try
	{
		if(string1.equalsIgnoreCase(string2))
		{
			System.out.println("Test case passed");
	    }
		else
		{
			System.out.println("Test case failed");
		}
		    outputParameters.put("STATUS", "PASS");
	        outputParameters.put("MESSAGE", "Action:valid,Input given:"+inputParameters[1].toString());
	}
	catch(Throwable e)
		{
		    outputParameters.put("STATUS", "FAIL");
            outputParameters.put("MESSAGE", "Action:valid,Input given:"+inputParameters[1].toString());
		}
	return outputParameters;
    }
	
	//cucumber search step
	public static Hashtable<String,Object> fnd(Object[]inputParameters)
	{
	     String xpath=(String) inputParameters[0];
	     String string2=(String) inputParameters[1];
	     
	     WebElement web1=driver.findElement(By.xpath(xpath));
	     String string3=web1.getText();
	     
	     try
	 	{
	 		if(string2.equalsIgnoreCase(string3))
	 		{
	 			System.out.println("Test case passed");
	 	    }
	 		else
	 		{
	 			System.out.println("Test case failed");
	 		}
	 		 outputParameters.put("STATUS", "PASS");
	         outputParameters.put("MESSAGE", "Action:fnd,Input given:"+inputParameters[1].toString());
	 	}
	 	catch(Throwable e)
	 		{
	 		 outputParameters.put("STATUS", "FAIL");
	         outputParameters.put("MESSAGE", "Action:fnd,Input given:"+inputParameters[1].toString());
	 		}
	     return outputParameters;
	     }    
}