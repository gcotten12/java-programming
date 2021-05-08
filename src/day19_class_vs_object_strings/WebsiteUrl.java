package day19_class_vs_object_strings;

public class WebsiteUrl {
    public static void main(String[] args) {
        String url = "youtube.com";
        if (url.endsWith(".com")) {
            System.out.println("commercial");
        }else if (url.endsWith(".org")) {
            System.out.println("government");
        }else if (url.endsWith(".edu")) {
            System.out.println("education");
        }else {
            System.out.println("Invalid website address");
        }
    }
}
