package mzerek.javapatterns.kreacyjne.singleton;

public class DatabaseAppSingleton {

    public static void main(String[] str) {
        DatabaseConnection singleton = DatabaseConnection.getInstance();
        System.out.println(singleton.getValue());

        DatabaseConnection anotherSingleton = DatabaseConnection.getInstance();
        anotherSingleton.setValue("New class info");


        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }
}
