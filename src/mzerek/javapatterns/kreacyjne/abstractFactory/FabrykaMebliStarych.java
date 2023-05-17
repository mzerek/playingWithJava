package mzerek.javapatterns.kreacyjne.abstractFactory;

public class FabrykaMebliStarych  implements FabrykaMebli {
    public Krzeslo utworzKrzeslo() {
        return new KrzesloStare();
    }

    public Sofa utworzSofe() {
        return new SofaStara();
    }

    public Stolik utworzStolik() {
        return new StolikStary();
    }
}
