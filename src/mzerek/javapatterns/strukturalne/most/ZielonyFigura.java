package mzerek.javapatterns.strukturalne.most;

public class ZielonyFigura implements Kolor {

    protected Figura figura;

    public ZielonyFigura(Figura figura) {
        this.figura = figura;
    }

    public void ustawKolor(){
        figura.setKolor("Zilony");
    }

    public String wezKolor(){
        return figura.getKolor();
    }
}
