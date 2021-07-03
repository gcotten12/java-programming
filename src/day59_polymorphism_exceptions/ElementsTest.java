package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        // WebElement loginLink = new WebElement(); -> cannot create object of abstract/interface class
        WebElement loginLink = new Link(); // we will only see the methods from the WebElement class
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        loginLink.sendKeys("hello");

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();
        username.getText();

        WebElementUtil.clickElement(username);
        WebElementUtil.clickElement(loginLink);
        // WebElementUtil.clickElement(new String("hello")); String is not subclass of WebElement class
        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();
    }
}
