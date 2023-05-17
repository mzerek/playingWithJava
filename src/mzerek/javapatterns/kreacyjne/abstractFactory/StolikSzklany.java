
package mzerek.javapatterns.kreacyjne.abstractFactory;

public class StolikSzklany implements Stolik {

    public void dodajKsztalt() {
        System.out.println("Kwadrat szklany");
    }

    public void dodajRozmiar() {
        System.out.println("10x10");
    }
}
