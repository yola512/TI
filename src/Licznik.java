package src;

public class Licznik {
    private float poczatkowyStan;
    private float biezacyStan;

    // constructor
    public Licznik(float poczatkowyStan, float biezacyStan) {
        if (biezacyStan < poczatkowyStan) {
            throw new IllegalArgumentException("Poczatkowy biezacy stan nie moze byc mniejszy od poczatkowego stanu");
        }
        this.poczatkowyStan = poczatkowyStan;
        this.biezacyStan = biezacyStan;
    }

    // getters + setters
    public float getPoczatkowyStan() {
        return poczatkowyStan;
    }
    public void setPoczatkowyStan(float poczatkowyStan) {
        this.poczatkowyStan = poczatkowyStan;
    }

    public float getBiezacyStan() {
        return biezacyStan;
    }
    public void setBiezacyStan(float biezacyStan) {
        this.biezacyStan = biezacyStan;
    }

    public double calculateUsedPower(float poczatkowyStan, float biezacyStan) {
        return biezacyStan - poczatkowyStan;
    }
}