package mzerek.javapatterns.kreacyjne.factorymethod;

public abstract class Logistic {
    void planDelivery() {
        Transport transport = createTransport();
        transport.doStuff();
    }
    abstract Transport  createTransport();
}
