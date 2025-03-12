package src;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ex.1
        System.out.printf("ZAD.1%n");
        System.out.println("Podaj dlugosc boku a: ");
        int a = scanner.nextInt();
        if (a <= 0) {
            throw new IllegalArgumentException("Bok musi byc dodatni");
        }

        System.out.println("Podaj dlugosc boku b: ");
        int b = scanner.nextInt();
        if (b <= 0) {
            throw new IllegalArgumentException("Bok musi byc dodatni");
        }

        double area1 = calculateRectangleArea(a,b);
        System.out.printf("Pole prostokata wynosi: %.2f%n", area1);

        // ex.2
        System.out.printf("%nZAD.2%n");
        System.out.println("Podaj dlugosc boku a: ");
        double a1 = scanner.nextInt();
        if (a1 <= 0) {
            throw new IllegalArgumentException("Bok musi byc dodatni");
        }
        System.out.println("Podaj dlugosc boku b: ");
        double b1 = scanner.nextInt();
        if (b1 <= 0) {
            throw new IllegalArgumentException("Bok musi byc dodatni");
        }
        System.out.println("Podaj dlugosc boku c: ");
        double c1 = scanner.nextInt();
        if (c1 <= 0) {
            throw new IllegalArgumentException("Bok musi byc dodatni");
        }
//
        boolean canBeTriangle = validateTriangle(a1, b1, c1);
        String triangleType = typeOfTriangle(a1, b1, c1);

        System.out.println("Czy z podanych bokow mozna stworzyc trojkat?");
        if (canBeTriangle) {
            System.out.println("Tak");
        }
        else {
            System.out.println("Nie");
        }

        System.out.println("Co to za trojkat?\n" + triangleType);

        // ex.3
        System.out.printf("%nZAD.3%n");
        System.out.println("Podaj wspolczynnik a: ");
        double a2 = scanner.nextDouble();
        if (a2 == 0) {
            throw new IllegalArgumentException("Nie mozna obliczyc pierwiastkow rownania kwadratowego. Funkcja jest liniowa.");
        }

        System.out.println("Podaj wspolczynnik b: ");
        double b2 = scanner.nextDouble();

        System.out.println("Podaj wyraz wolny c: ");
        double c2 = scanner.nextDouble();

        // calculate quadratic equation roots
        double delta = Math.pow(b2,2) - 4 * a2 * c2;

        if (delta > 0) {
            double x1 = (-b2 - Math.sqrt(delta))/2*a2;
            double x2 = (-b2 + Math.sqrt(delta))/2*a2;
            System.out.format("Rownanie kwadratowe ma 2 pierwiastki: %.2f %.2f", x1, x2);
        }
        if (delta == 0) {
            double x0 = -b2/2*a2;
            System.out.printf("Rownanie ma 1 pierwiastek: %.2f", x0);
        }
        if (delta < 0) {
            System.out.println("Brak pierwiastkow");
        }

        // ex. 4
        System.out.printf("%nZAD.4%n");
        Random rand = new Random();
        System.out.printf("Podaj rozmiar tablicy: %n");
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt(20); //np do 20 dla latwiejszego sprawdzania
        }

        System.out.printf("Wartosci w tablicy: %n");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }

//        // max value
        int max = tab[0];
        for (int i = 0; i < n; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.printf("%nNajwieksza liczba w tablicy: %d%n", max);

//        // min value
        int min = tab[0];
        for (int i = 0; i < n; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.printf("%nNajmniejsza liczba w tablicy: %d%n", min);

//        // average
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += tab[i];
        }
        float avg = sum/n;
        System.out.printf("%nSrednia: %.2f%n", avg);

        // ex. 5
        System.out.printf("%nZAD.5%n");
        for (int i = 1; i <= 100; i ++) {
            for (int j = 1; j <= 10; j ++) {
                System.out.printf("%d * %d = %d%n", i, j, (i*j));
            }
            System.out.println();
        }

        // ex. 6
        System.out.printf("%nZAD.6%n");
        System.out.println("Podaj bok a prostokata: ");
        int a3 = scanner.nextInt();
        if (a3 <= 0) {
            throw new IllegalArgumentException("Bok prostokata musi byc dodatni");
        }
        System.out.println("Podaj bok b prostokata: ");
        int b3 = scanner.nextInt();
        if (b3 <= 0) {
            throw new IllegalArgumentException("Bok prostokata musi byc dodatni");
        }
        Prostokat p1 = new Prostokat(a3, b3);
        System.out.println(p1.wyswietlDane());
        System.out.println(p1.wyswietlWynik());

        // ex. 7,8
        System.out.printf("%nZAD.7/8%n");
        System.out.println("Podaj poczatkowy stan licznika: ");
        float poczSt = scanner.nextFloat();
        if (poczSt < 0) {
            throw new IllegalArgumentException("Poczatkowy stan licznika nie moze byc ujemny");
        }

        System.out.println("Podaj biezacy stan licznika: ");
        float biezSt = scanner.nextFloat();
        if (biezSt < 0 || biezSt < poczSt) {
            throw new IllegalArgumentException("Biezacy stan licznika nie moze byc ujemny/mniejszy niz poczatkowy stan");
        }

        Licznik licznik = new Licznik(poczSt, biezSt);
        System.out.printf("Poczatkowy stan licznika: %.2f%n", licznik.getPoczatkowyStan());
        System.out.printf("Biezacy stan licznika: %.2f%n", licznik.getBiezacyStan());
        System.out.printf("Zuzyta energia: %.2f%n", licznik.calculateUsedPower(licznik.getPoczatkowyStan(), licznik.getBiezacyStan()));


    }

    // ex.1
    public static double calculateRectangleArea(int a, int b) {
        return a*b;
    }

    // ex.2
    public static boolean validateTriangle(double a, double b, double c) {
        if (a + b > c && b+c > a && c+a > b) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String typeOfTriangle(double a, double b, double c) {
        if (Math.pow(a,2) + Math.pow(b,2) > Math.pow(c,2)) {
            return "Trojkat jest ostrokatny";
        }
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
            return "Trojkat jest prostokatny";
        }
        else {
            return "Trojkat jest rozwartokatny";
        }
    }





}
