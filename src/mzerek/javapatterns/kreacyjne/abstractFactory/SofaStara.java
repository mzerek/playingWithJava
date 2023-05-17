package mzerek.javapatterns.kreacyjne.abstractFactory;

public class SofaStara implements Sofa {

    public void dodajOparcie() {
        System.out.println("Miekkie oparcie");
    }

    public void dodajGuziki() {
        System.out.println("Puszyste guziki");
    }
}
