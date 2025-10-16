package com.example.shapes;

import java.util.Scanner;

/**
 * Główna klasa uruchamiająca kalkulator pól figur geometrycznych.
 */
public final class Main {

    /** Opcja wyboru koła. */
    private static final int CHOICE_CIRCLE = 1;

    /** Opcja wyboru prostokąta. */
    private static final int CHOICE_RECTANGLE = 2;

    /** Opcja wyboru trójkąta. */
    private static final int CHOICE_TRIANGLE = 3;

    /** Opcja wyjścia z programu. */
    private static final int CHOICE_EXIT = 4;

    /** Prywatny konstruktor, aby nie tworzyć instancji klasy. */
    private Main() {
        // Nie można tworzyć instancji
    }

    /**
     * Główna metoda programu.
     * @param args argumenty wiersza poleceń.
     */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Kalkulator pól figur ===");
            System.out.println("1. Koło");
            System.out.println("2. Prostokąt");
            System.out.println("3. Trójkąt");
            System.out.println("4. Zakończ");
            System.out.print("Wybierz figurę: ");

            final int choice = scanner.nextInt();
            final Shape shape;

            switch (choice) {
                case CHOICE_CIRCLE:
                    System.out.print("Podaj promień: ");
                    final double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case CHOICE_RECTANGLE:
                    System.out.print("Podaj szerokość: ");
                    final double width = scanner.nextDouble();
                    System.out.print("Podaj wysokość: ");
                    final double height = scanner.nextDouble();
                    shape = new Rectangle(width, height);
                    break;
                case CHOICE_TRIANGLE:
                    System.out.print("Podaj podstawę: ");
                    final double base = scanner.nextDouble();
                    System.out.print("Podaj wysokość: ");
                    final double triHeight = scanner.nextDouble();
                    shape = new Triangle(base, triHeight);
                    break;
                case CHOICE_EXIT:
                    System.out.println("Do widzenia!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór.");
                    continue;
            }

            System.out.printf("Pole figury: %.2f%n", shape.calculateArea());
        }
    }
}
