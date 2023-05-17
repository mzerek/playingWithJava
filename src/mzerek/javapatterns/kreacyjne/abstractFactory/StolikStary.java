
package mzerek.javapatterns.kreacyjne.abstractFactory;

public class StolikStary implements Stolik {

    public void dodajKsztalt() {
        System.out.println("Prostokatny");
    }

    public void dodajRozmiar() {
        System.out.println("200x100");
    }
}
