package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String name = "Circle";
    private double radius;

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return Math.PI *(radius*radius);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

