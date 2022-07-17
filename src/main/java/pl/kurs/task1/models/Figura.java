package pl.kurs.task1.models;

import pl.kurs.task1.exceptions.NullElementInArray;

public abstract class Figura {

    private double Obwod;
    private double Pole;

    public Figura() {
    }

    public Figura(double obwod, double pole) {
        Obwod = obwod;
        Pole = pole;
    }

    public double getObwod() {
        return Obwod;
    }

    public double getPole() {
        return Pole;
    }

    public static Kwadrat stworzKwadrat(int a) throws IllegalArgumentException {
        if (a < 0)
            throw new IllegalArgumentException("Parament figury jest ujemny!");
        Kwadrat kwadrat = new Kwadrat();
        kwadrat.setA(a);
        return kwadrat;
    }

    public static Prostokat stworzProstokat(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Parament figury jest ujemny!");
        Prostokat prostokat = new Prostokat();
        prostokat.setA(a);
        prostokat.setB(b);
        return prostokat;
    }

    public static Kolo stworzKolo(int r) throws IllegalArgumentException {
        if (r < 0)
            throw new IllegalArgumentException("Parament figury jest ujemny!");
        Kolo kolo = new Kolo();
        kolo.setR(r);
        return kolo;
    }

    public static void sprawdzTablice(Figura[] figuras) throws NullElementInArray {
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] == null)
                throw new NullElementInArray("Jeden z elementów tablicy jest null!");
        }
    }

    public static void getNajwiekszyObwod(Figura[] figuras) {
        Figura najmniejszyObw = figuras[0];
        Figura najwiekszyObw = figuras[0];
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i].getObwod() < najmniejszyObw.getObwod())
                najmniejszyObw = figuras[i];
            if (figuras[i].getObwod() > najwiekszyObw.getObwod())
                najwiekszyObw = figuras[i];
        }
        System.out.println("Figura, która ma największy obwód to : " + najwiekszyObw);
    }


    public static void getNajwiekszePole(Figura[] figuras) {
        Figura najmniejszePole = figuras[0];
        Figura najwiekszyPole = figuras[0];
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i].getPole() < najmniejszePole.getPole())
                najmniejszePole = figuras[i];
            if (figuras[i].getPole() > najwiekszyPole.getPole())
                najwiekszyPole = figuras[i];
        }
        System.out.println("Figura, która ma największe pole to : " + najwiekszyPole);
    }


    public String toString() {
        return "Figura nr " + ": " + getClass().getSimpleName();
    }

}
