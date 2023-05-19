package mzerek.java8to17;

import java.time.Month;

public class SolutionJava15 {

    public static void main(String[] args) {
        System.out.println(oldStringOldWay());
        System.out.println("==================");
        System.out.println(oldStringNewWay());

    }

    public static String oldStringOldWay() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "     <head>\n" +
                "        <title>Example</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p>This is an example of a simple HTML " +
                "page with one paragraph.</p>\n" +
                "    </body>\n" +
                "</html>\n";
    }

    //Java15 - Using text blocks
    public static String oldStringNewWay() {
        return """ 
                <!DOCTYPE html>
                <html>
                    <head>
                        <title>Example</title>
                    </head>
                    <body>
                        <p>This is an example of a simple HTML
                        page with one paragraph.</p>
                    </body>
                </html>  
                """;
    }

}
