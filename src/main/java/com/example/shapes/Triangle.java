package com.example.shapes;

/**
 * Klasa reprezentująca trójkąt.
 */
public final class Triangle implements Shape {

    /** Podstawa trójkąta. */
    private final double base;

    /** Wysokość trójkąta. */
    private final double height;

    /** Współczynnik używany do obliczania pola trójkąta. */
    private static final double TRIANGLE_FACTOR = 0.5;

    /**
     * Konstruktor trójkąta.
     *
     * @param baseValue podstawa trójkąta
     * @param heightValue wysokość trójkąta
     */
    public Triangle(final double baseValue, final double heightValue) {
        this.base = baseValue;
        this.height = heightValue;
    }

    /**
     * Oblicza pole trójkąta.
     *
     * @return pole powierzchni
     */
    @Override
    public double calculateArea() {
        return TRIANGLE_FACTOR * base * height;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ", height=" + height + "]";
    }
}
