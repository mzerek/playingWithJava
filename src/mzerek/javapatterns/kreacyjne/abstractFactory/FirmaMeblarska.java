package mzerek.javapatterns.kreacyjne.abstractFactory;

public class FirmaMeblarska {

    public static void main(String[] str) {
        FabrykaMebli fabrykaMebli;

        if (str[0].equals("Nowy")) {
            fabrykaMebli = new FabrykaMebliNowoczesnych();
        } else if (str[0].equals("Stare")) {
            fabrykaMebli = new FabrykaMebliStarych();
        } else {
            fabrykaMebli = new FabrykaMebliSzklanych();
        }

        Stolarnia stolarnia = new Stolarnia(fabrykaMebli);
        stolarnia.utworzZestawMebli();
    }
}
