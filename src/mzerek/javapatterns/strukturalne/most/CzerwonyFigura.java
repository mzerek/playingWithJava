package mzerek.javapatterns.strukturalne.most;

public class CzerwonyFigura implements Kolor {

    protected Figura figura;

    public CzerwonyFigura(Figura figura) {
        this.figura = figura;
    }

    public void ustawKolor(){
        figura.setKolor("Czerwony");
    }

    public String wezKolor(){
        return figura.getKolor();
    }
}
