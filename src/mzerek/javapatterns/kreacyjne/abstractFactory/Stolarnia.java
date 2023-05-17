package mzerek.javapatterns.kreacyjne.abstractFactory;

public class Stolarnia {
    private FabrykaMebli fabrykaMebli;
    private Krzeslo krzeslo;
    private Stolik stolik;
    private Sofa sofa;

    public Stolarnia(FabrykaMebli fabrykaMebli){
        this.fabrykaMebli = fabrykaMebli;
    }

    public void utworzZestawMebli(){
        this.krzeslo = fabrykaMebli.utworzKrzeslo();
        this.sofa = fabrykaMebli.utworzSofe();
        this.stolik = fabrykaMebli.utworzStolik();

        krzeslo.dodajNogi();
        krzeslo.dodajObicie();

        stolik.dodajKsztalt();
        stolik.dodajRozmiar();

        sofa.dodajGuziki();
        sofa.dodajOparcie();
    }
}
