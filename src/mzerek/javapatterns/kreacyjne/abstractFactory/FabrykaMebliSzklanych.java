package mzerek.javapatterns.kreacyjne.abstractFactory;

public class FabrykaMebliSzklanych implements FabrykaMebli {
    public Krzeslo utworzKrzeslo() {
        return new KrzesloSzklane();
    }

    public Sofa utworzSofe() {
        return new SofaSzklana();
    }

    public Stolik utworzStolik() {
        return new StolikSzklany();
    }
}
