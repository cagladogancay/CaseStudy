package page;

import static constant.Constants.CLICK_BUTTON_LOGIN;
import static constant.Constants.CLICK_BUTTON_SEARCH;
import static constant.Constants.CLICK_SECOND_PAGE;
import static constant.Constants.LOGIN;
import static constant.Constants.MOVE;
import static constant.Constants.PASSWORD_FIELD;
import static constant.Constants.SEARCH_FIELD;
import static constant.Constants.USERNAME_FIELD;

import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage {



	public HomePage(WebDriver driver) {
		super(driver);

	}

	public HomePage moveToLogin() {
		hoverElement(MOVE);
		return this;
	}


	public HomePage clickLogin() {
		click(LOGIN);
		return this;
	}

	public HomePage sendEmail() {
		sendKeys(USERNAME_FIELD, "caglacagla711086");
		return this;
	}

	public HomePage sendPassword() {
		sendKeys(PASSWORD_FIELD, "cagla1234");
		return this;
	}


	public HomePage submitButton() {
		click(CLICK_BUTTON_LOGIN);
		return this;
	}
	
public HomePage search() {
		sendKeys(SEARCH_FIELD, "bilgisayar");
		return this;
	}
public HomePage submitSearch() {
	click(CLICK_BUTTON_SEARCH);
	return this;
}
public HomePage goSecondPage() {
	click(CLICK_SECOND_PAGE);
	return this;
}
}




