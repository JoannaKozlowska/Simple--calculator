package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getField() {
        return width * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(width);
    }
}
