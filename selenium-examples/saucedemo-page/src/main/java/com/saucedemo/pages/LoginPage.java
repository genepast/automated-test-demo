package com.saucedemo.pages;

import org.openqa.selenium.By;

    public class LoginPage extends BasePage {

        private By usernameField = By.id("user-name");
        private By passwordField = By.className("input_error");
        private By errorMessage = By.cssSelector("#login_button_container h3");
        private By loginButton = By.id("login-button");

        public void setUsername(String username){
            set(username, usernameField);
        }

        public void setPassword(String password){
            set(password, passwordField);
        }
    public ProductsPage clickLoginButton(){
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage logIntoApp(String username, String password){
            setUsername(username);
            setPassword(password);
            return clickLoginButton();
    }

    public String getErrorMessage(){
            return find(errorMessage).getText();
    }

    }


