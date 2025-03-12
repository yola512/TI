package src;

public class Prostokat {
    int a;
    int b;

    public Prostokat(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Boki prostokata musza byc dodatnie");
        }
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    public String wyswietlDane() {
        return "Bok a = " + a + " Bok b = " + b;
    }

    public float obliczPole() {
        return a * b;
    }

    public String wyswietlWynik() {
        return "Pole prostokata wynosi: " + obliczPole();
    }

}
