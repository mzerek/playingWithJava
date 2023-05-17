package mzerek.javapatterns.kreacyjne.abstractFactory;

public class KrzesloSzklane implements Krzeslo {

    public void dodajNogi() {
        System.out.println("7 nog krzesla ze szkla");
    }

    public void dodajObicie() {
        System.out.println("Odlew szkla na obicie");
    }
}
