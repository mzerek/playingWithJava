package mzerek.javapatterns.kreacyjne.singleton;

public class DatabaseConnection {

    private static DatabaseConnection INSTANCE;

    private String value = "Initial info class";

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnection();
        }
        return INSTANCE;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
