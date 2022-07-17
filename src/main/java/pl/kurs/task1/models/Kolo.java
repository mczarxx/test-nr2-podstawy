package pl.kurs.task1.models;

public class Kolo extends Figura {
    private int r;

    public Kolo() {
        super();
    }

    public void setR(int r) {
        this.r = r;
    }


    @Override
    public double getObwod() {
        return 2 * Math.PI * r;
    }


    @Override
    public double getPole() {
        return Math.PI * r * r;
    }



    @Override
    public String toString() {
        return super.toString() + " o promieniu " + r + '.';
    }


}
