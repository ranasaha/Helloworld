package testing01;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;


public class Asserthardsoft {

//	Hard assert
	@Test(priority=3)
	public void test1(){
	try{
	Assert.assertTrue(2>1);
	System.out.println("a");
	Assert.assertFalse(1>0);
	System.out.println("b");
	Assert.assertEquals(12, 12);
	System.out.println("c");
	} catch(AssertionError ae){
	ae.printStackTrace();
	}
	}

	@Test(priority=2)
	public void test2(){
	try{
	Assert.assertTrue(2>1);
	System.out.println("a2");
	Assert.assertFalse(12>10, "good");
	System.out.println("b2");
	Assert.assertEquals(12, 13);
	System.out.println("c2");
	} catch(AssertionError ae){
	ae.printStackTrace();
	}
	}
//Soft assert	
	@Test(priority=1)
	public void test3(){
	SoftAssert sa = new SoftAssert();
	System.out.println("asoft");
	sa.assertEquals(12,13);
	System.out.println("bsoft");
	sa.assertAll();
	
//	System.out.println("csoft");
//	Verify.verify(10>9);
//	System.out.println("dsoft");
	}
}

