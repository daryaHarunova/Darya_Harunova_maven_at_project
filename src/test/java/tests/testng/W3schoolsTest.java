package tests.testng;

import org.testng.annotations.Test;
import pages.Google.HomePageGoogle;
import pages.Google.ResultPageGoogle;
import pages.W3schools.HomePageW3School;
import tests.BaseTestNG;

public class W3schoolsTest extends BaseTestNG {
    HomePageW3School homePageW3School = new HomePageW3School();
    HomePageGoogle homePageGoogle = new HomePageGoogle();
    ResultPageGoogle resulPageGoogle = new ResultPageGoogle();

    @Test
    public void copyTitle() {
        homePageW3School.open("https://www.w3schools.com/java/");
        homePageW3School.copyText("//span[@class = 'color_h1']");
        homePageGoogle.open("https://www.google.com/");
        homePageGoogle.pasteTextToSearch();
        resulPageGoogle.assertElementsTextByRegex(".*(tutorial|туториал).*");
    }
}