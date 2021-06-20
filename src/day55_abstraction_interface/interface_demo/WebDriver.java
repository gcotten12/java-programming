package day55_abstraction_interface.interface_demo;

public interface WebDriver {
    void get(String url); // public abstract is there automatically when we create our methods in interface
    void findElement(String locator);
    void quit();
    String getTitle();
}

class ChromeDriver implements WebDriver {

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - quitting out of session");
    }

    @Override
    public String getTitle() {
        return "Wooden Spoon";
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating element by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quitting out of session");
    }

    @Override
    public String getTitle() {
        return "Wooden Spoon";
    }
}
