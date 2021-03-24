package constant;

import org.openqa.selenium.By;

public class Constants {
	public static final By MOVE = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]");
	public static final By LOGIN = By
			.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a");
	public static final By USERNAME_FIELD = By.id("L-UserNameField");
	public static final By PASSWORD_FIELD = By.id("L-PasswordField");
	public static final By CLICK_BUTTON_LOGIN = By.id("gg-login-enter");
	public static final By SEARCH_FIELD = By.name("k");
	public static final By CLICK_BUTTON_SEARCH = By.cssSelector("button.qjixn8-0.sc-1bydi5r-0.hKfdXF");
	public static final By CLICK_SECOND_PAGE=By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");
	
		
}
