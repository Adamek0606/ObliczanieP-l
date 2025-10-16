package com.example.shapes;

/**
 * Klasa reprezentująca prostokąt.
 */
public final class Rectangle implements Shape {

    /** Szerokość prostokąta. */
    private final double width;

    /** Wysokość prostokąta. */
    private final double height;

    /**
     * Konstruktor prostokąta.
     *
     * @param widthValue szerokość
     * @param heightValue wysokość
     */
    public Rectangle(final double widthValue, final double heightValue) {
        this.width = widthValue;
        this.height = heightValue;
    }

    /**
     * Oblicza pole prostokąta.
     *
     * @return pole powierzchni
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }
}
