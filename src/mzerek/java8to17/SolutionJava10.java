package mzerek.java8to17;

import java.util.List;

public class SolutionJava10 {

    public static void main(String[] args) {

    }

    //Java8 and Java9 with types
    public void explicitTypes() {
        Person roland = new Person("Rodlan", "Kowalski");
        Person franek = new Person("Franek", "Kimono");
        Person adam = new Person("Adam", "Pierwszy");

        List<Person> persons = List.of(roland, franek, adam);

        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getLastName());
        }
    }

    //Java10 var keyword
    public void withVarKeyword() {
        var roland = new Person("Rodlan", "Kowalski");
        var franek = new Person("Franek", "Kimono");
        var adam = new Person("Adam", "Pierwszy");

        var persons = List.of(roland, franek, adam);

        for (var person : persons) {
            System.out.println(person.getName() + " " + person.getLastName());
        }
    }
}

class Person {
    private String name;

    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }
}
