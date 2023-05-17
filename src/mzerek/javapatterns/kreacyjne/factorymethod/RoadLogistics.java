package mzerek.javapatterns.kreacyjne.factorymethod;

public class RoadLogistics extends Logistic {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
