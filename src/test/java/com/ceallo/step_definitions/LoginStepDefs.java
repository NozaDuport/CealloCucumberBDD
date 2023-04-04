package com.ceallo.step_definitions;

import com.ceallo.pages.LoginPage;
import com.ceallo.utilities.ConfigurationReader;
import com.ceallo.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("User logged in successfully")
    public void user_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web_url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
    }
}
