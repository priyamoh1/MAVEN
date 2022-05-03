package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.ActitimeHomePage;
import pom.createacustomerr;

public class logincclogout extends BaseTest  
{
@Test
public void logincclogout1() throws InterruptedException, IOException 

{
	ActitimeHomePage acth=new ActitimeHomePage(driver);
	acth.taskMethod();
	createacustomerr cc=new createacustomerr(driver);
	cc.createacustomer1();
	
}


}

