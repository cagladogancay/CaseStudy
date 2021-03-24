package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import base.BaseTest;
import page.HomePage;

public class HomePageTest extends BaseTest {
	HomePage homePage;
	
	@Before
	public void before() {
		homePage = new HomePage(getDriver());
	}
	
	@Test
	public void test() {
		homePage.moveToLogin().clickLogin().sendEmail().sendPassword().submitButton().search().submitSearch();
		//GoSecondPage() methodu çalışmıyor
		//homePage.moveToLogin().clickLogin().sendEmail().sendPassword().submitButton().search().submitSearch().goSecondPage();
	}
	
	@After 
	public void after() {
		tearDown();
	}
	
	

}
