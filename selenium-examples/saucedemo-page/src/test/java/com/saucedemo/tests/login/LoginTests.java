package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

    @Test
    //prueba que el mensaje de error al ingresar una contraseña mal aparezca
    public void testLoginErrorMessage(){
        //Puedo utilizar el loginPage gracias a definirlo en el BaseTest
        loginPage.setUsername("standard_user");
        loginPage.setPassword("standard_user");
        loginPage.clickLoginButton();

        String actualMessage = loginPage.getErrorMessage();
        Assertions.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
