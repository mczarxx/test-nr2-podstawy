package pl.kurs.task1.models;

public class Kwadrat extends Prostokat {
    private int a;

    public Kwadrat() {
        super();
    }

    public Kwadrat(int a) {
        this.a = a;
    }


    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getObwod() {
        return 4 * a;
    }

    @Override
    public double getPole() {
        return a * a;
    }


    public String toString() {
        return "Figura nr " + ": " + getClass().getSimpleName() + " o boku " + a + '.';
    }
}
