package mzerek.javapatterns.strukturalne.most;

public class NiebieskiFigura implements Kolor {

    protected Figura figura;

    public NiebieskiFigura(Figura figura) {
        this.figura = figura;
    }

    public void ustawKolor(){
        figura.setKolor("Niebieski");
    }

    public String wezKolor(){
        return figura.getKolor();
    }
}
