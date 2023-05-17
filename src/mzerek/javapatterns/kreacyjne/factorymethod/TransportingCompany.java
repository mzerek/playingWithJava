package mzerek.javapatterns.kreacyjne.factorymethod;

//https://refactoring.guru/pl/design-patterns/factory-method
public class TransportingCompany {

    public static void main(String[] str) {
        Logistic logistic;
        if(str[0].equals("Truck")) {
            logistic = new RoadLogistics();
        } else {
            logistic = new SeaLogistics();
        }

        logistic.planDelivery();
    }
}
