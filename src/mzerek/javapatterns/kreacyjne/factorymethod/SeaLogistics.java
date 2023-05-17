package mzerek.javapatterns.kreacyjne.factorymethod;

public class SeaLogistics extends Logistic{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
