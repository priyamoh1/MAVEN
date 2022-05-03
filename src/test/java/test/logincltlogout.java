package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.ActitimeHomePage;
import pom.createleavetype;

public class logincltlogout extends BaseTest
{
@Test
public void lcltl() throws InterruptedException, IOException
{
	ActitimeHomePage hp= new ActitimeHomePage(driver);
	hp.settingsMethod();
	hp.lcltl();
	createleavetype clt=new createleavetype(driver);
	clt.createaleavetype();
	
}
}
