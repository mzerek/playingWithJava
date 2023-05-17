package mzerek.javapatterns.kreacyjne.abstractFactory;

public class FabrykaMebliNowoczesnych implements FabrykaMebli{
    public Krzeslo utworzKrzeslo() {
        return new KrzesloNowoczesne();
    }

    public Sofa utworzSofe() {
        return new SofaNowoczesna();
    }

    public Stolik utworzStolik() {
        return new StolikNowoczesny();
    }
}
