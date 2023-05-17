package mzerek.javapatterns.strukturalne.most;

public class MainFigrua {

    public static void main(String[] str) {
        CzerwonyFigura czerwonyKwadrat = new CzerwonyFigura(new Kwadrat());
        czerwonyKwadrat.ustawKolor();
        System.out.println(czerwonyKwadrat.wezKolor());

        CzerwonyFigura czerwonyOkrag = new CzerwonyFigura(new Okrąg());
        czerwonyOkrag.ustawKolor();
        System.out.println(czerwonyOkrag.wezKolor());

        CzerwonyFigura czerwonyTrojkat = new CzerwonyFigura(new Trojkat());
        czerwonyTrojkat.ustawKolor();
        System.out.println(czerwonyTrojkat.wezKolor());

        NiebieskiFiguraZOgonkiem okragZOgonkiem = new NiebieskiFiguraZOgonkiem(new Okrąg());
        okragZOgonkiem.ustawKolor();
        okragZOgonkiem.ustawOgonek();
        okragZOgonkiem.ustawNiebieskiOgonek();
        System.out.println(okragZOgonkiem.wezFigureZOgonek());
    }
}
