package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.ActitimeHomePage;
import pom.createtypeofwork;

public class loginctowlogout extends BaseTest
{
@Test
public void lctowl() throws InterruptedException, IOException
{
	ActitimeHomePage hp=new ActitimeHomePage(driver);
	hp.settingsMethod();
	hp.ctow();
	createtypeofwork ctow=new createtypeofwork(driver);
	ctow.createtyeofwork();
}
}
