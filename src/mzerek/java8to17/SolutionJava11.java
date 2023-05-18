package mzerek.java8to17;

import java.util.List;
import java.util.stream.Collectors;

public class SolutionJava11 {

    public static void main(String[] args) {
        explicitTypes();
        withVarKeyword();
        withVarKeywordInLambda();

    }

    //Java8 and Java9 with types
    public static void explicitTypes() {
        PersonEleven roland = new PersonEleven("Rodlan", "Kowalski");
        PersonEleven franek = new PersonEleven("Franek", "Kimono");
        PersonEleven adam = new PersonEleven("Adam", "Pierwszy");

        List<PersonEleven> persons = List.of(roland, franek, adam);

        for (PersonEleven person : persons) {
            System.out.println(person.getName() + " " + person.getLastName());
        }
    }

    //Java10 var keyword
    public static void withVarKeyword() {
        var roland = new PersonEleven("Rodlan", "Kowalski");
        var franek = new PersonEleven("Franek", "Kimono");
        var adam = new PersonEleven("Adam", "Pierwszy");

        var persons = List.of(roland, franek, adam);

        for (var person : persons) {
            System.out.println(person.getName() + " " + person.getLastName());
        }
    }

    //Java10 var keyword in lambda expressions

    public static void withVarKeywordInLambda() {
        var roland = new PersonEleven("Rodlan", "Kowalski");
        var franek = new PersonEleven("Franek", "Kimono");
        var adam = new PersonEleven("Adam", "Pierwszy");

        var persons = List.of(roland, franek, adam)
                .stream()
                .filter((var x) -> x.getName().contains("a"))
                .collect(Collectors.toList());

        System.out.println(persons);
    }

}

class PersonEleven {
    private String name;

    private String lastName;

    public PersonEleven(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
