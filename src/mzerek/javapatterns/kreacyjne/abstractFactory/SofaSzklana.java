package mzerek.javapatterns.kreacyjne.abstractFactory;

public class SofaSzklana implements Sofa {

    public void dodajOparcie() {
        System.out.println("Przezroczyste oparcie");
    }

    public void dodajGuziki() {
        System.out.println("Nie ma guzikow");
    }
}
