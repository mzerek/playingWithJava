package mzerek.javapatterns.kreacyjne.abstractFactory;

public class KrzesloNowoczesne implements Krzeslo {

    public void dodajNogi() {
        System.out.println("Lewituje krzeslo");
    }

    public void dodajObicie() {
        System.out.println("Obicie z plastiku");
    }
}
