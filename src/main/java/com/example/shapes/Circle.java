package com.example.shapes;

/**
 * Klasa reprezentująca koło.
 */
public final class Circle implements Shape {

    /** Promień koła. */
    private final double radius;

    /**
     * Konstruktor koła.
     *
     * @param radiusValue promień koła
     */
    public Circle(final double radiusValue) {
        this.radius = radiusValue;
    }

    /**
     * Oblicza pole koła.
     *
     * @return pole powierzchni
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
