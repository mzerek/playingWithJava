package mzerek.javapatterns.kreacyjne.factorymethod;

public class Ship implements Transport {
    @Override
    public void doStuff() {
        System.out.println("Płyniemy przez ocean statkiem");
    }
}
