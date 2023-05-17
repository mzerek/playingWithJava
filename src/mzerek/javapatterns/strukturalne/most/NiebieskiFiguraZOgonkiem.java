package mzerek.javapatterns.strukturalne.most;

public class NiebieskiFiguraZOgonkiem extends NiebieskiFigura {

    private String ogonek;

    public NiebieskiFiguraZOgonkiem(Figura figura) {
        super(figura);
        this.ogonek = ogonek;
    }

    public void ustawOgonek() {
       this.ogonek = "Jakis ogonek";
    }

    public void ustawNiebieskiOgonek() {
        this.figura.setKolor(this.figura.getKolor() + " " + this.ogonek);
    }

    public String wezOgonek() {
        return this.ogonek;
    }

    public String wezFigureZOgonek() {
        return figura.getKolor();
    }
}
