package day22_string_manipulation_continued;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
//last ,
        System.out.println(technologies.lastIndexOf(","));
        
        System.out.println("" + technologies.indexOf("j") + technologies.indexOf("a") +
                technologies.indexOf("v") + technologies.indexOf("a"));
        
        int idxOfCss = technologies.indexOf("css");
        System.out.println("idxOfCss = " + idxOfCss);
        
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("indexOfCucumber = " + indexOfCucumber);

        //search a string that is not present
        int indexOfSql = technologies.indexOf("sql");
        System.out.println("indexOfSql = " + indexOfSql);

        if(technologies.contains("maven")) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
        if(technologies.indexOf("maven") > 1) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
    }
}
