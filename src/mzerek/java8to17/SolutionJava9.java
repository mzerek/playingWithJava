package mzerek.java8to17;

public class SolutionJava9 {

    public static void main(String[] args) {

    }

    //Java9 diamond operator inside the inner anonymous class
    StringAppender<String> appending = new StringAppender<>() {
        @Override
        public String append(String a, String b) {
            return new StringBuilder(a).append("-").append(b).toString();
        }
    };

    public abstract static class StringAppender<T> {
        public abstract T append(String a, String b);
    }
}

//Java9 private method in interface
interface ExampleInterface {
    String getColor();

    //Java 8 - interface default methods
    default String getColorById(Long id) {
        return readValue("Adam");
    }

    private String readValue(String name){
        return name;
    }
}


