package mzerek.javapatterns.strukturalne.most;

public class Trojkat implements Figura {

    private String kolor;

    @Override
    public String getKolor() {
        return this.kolor;
    }

    @Override
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
