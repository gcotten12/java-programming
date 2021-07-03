package day59_polymorphism_exceptions;

public class WebElementUtil {
    public static void clickElement(WebElement element) { // static so we dont have to create an object to call it
        System.out.println("clicking on element");
        element.click();
    }

    public static WebElement getLinkWithText(String txt) {
        System.out.println("searching for a link with txt = " + txt);
        return new Link(); // can return any object created from WebElement
    }

}
