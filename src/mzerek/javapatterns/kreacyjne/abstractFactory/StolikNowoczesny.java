
package mzerek.javapatterns.kreacyjne.abstractFactory;

public class StolikNowoczesny implements Stolik {

    public void dodajKsztalt() {
        System.out.println("Koło");
    }

    public void dodajRozmiar() {
        System.out.println("R 10");
    }
}
