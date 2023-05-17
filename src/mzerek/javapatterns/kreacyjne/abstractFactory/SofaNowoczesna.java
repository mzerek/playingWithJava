package mzerek.javapatterns.kreacyjne.abstractFactory;

public class SofaNowoczesna implements Sofa {

    public void dodajOparcie() {
        System.out.println("Brak oparcia");
    }

    public void dodajGuziki() {
        System.out.println("Swieca guziki");
    }
}
