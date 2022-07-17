package pl.kurs.task1.models;

public class Prostokat extends Figura {
    private int a;
    private int b;

    public Prostokat() {
        super();
    }

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getObwod() {
        return (2 * a) + (2 * b);
    }

    @Override
    public double getPole() {
        return a * b;
    }


    @Override
    public String toString() {
        return super.toString() + " o bokach " + a + 'x' + b + '.';
    }
}
