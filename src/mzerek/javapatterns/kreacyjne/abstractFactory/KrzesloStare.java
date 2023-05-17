package mzerek.javapatterns.kreacyjne.abstractFactory;

public class KrzesloStare implements Krzeslo {

    public void dodajNogi() {
        System.out.println("4 nogi starego krzesla");
    }

    public void dodajObicie() {
        System.out.println("Obicie starego krzesla");
    }
}
