package mzerek.javapatterns.kreacyjne.factorymethod;

public class Truck implements Transport {
    @Override
    public void doStuff() {
        System.out.println("Jedziemy po lądzie ciężarówką");
    }
}
