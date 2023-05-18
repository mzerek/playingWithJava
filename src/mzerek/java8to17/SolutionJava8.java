package mzerek.java8to17;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class SolutionJava8 {

    public static void main(String[] args) {

    }

    //Java 8 lambra Expressions
    public static List<Car> findCars(List<Car> cars) {
        return cars.stream()
                .filter(car -> car.getKilometers() > 5000)
                .collect(toList());
    }

    //Java 8 method reference
    public static List<String> methodReference(List<Car> cars) {
        return cars.stream()
                .map(Car::toString)
                .collect(toList());
    }

    static  void beforeJava8() {
        //Before Java8 try/catch
        BufferedReader br = new BufferedReader(new StringReader("Hello world example"));
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void withJava8() {
        try(BufferedReader reader = new BufferedReader(new StringReader("Hello world example"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error happened");
        }
    }

    //Java required <String> example new StringAppender<String>()
    // in java9 only <> example new StringAppender<>()
    StringAppender<String> appending = new StringAppender<String>() {
        @Override
        public String append(String a, String b) {
            return new StringBuilder(a).append("-").append(b).toString();
        }
    };

    public abstract static class StringAppender<T> {
        public abstract T append(String a, String b);
    }

}

interface CarInterface {
    String getColor();

    //Java 8 - interface default methods
    default String getColorById(Long id) {
        return "green";
    }
}

class Car implements CarInterface{
    private int kilometers;

    public int getKilometers() {
        return this.kilometers;
    }

    @Override
    public String getColor() {
        return "red";
    }
}

