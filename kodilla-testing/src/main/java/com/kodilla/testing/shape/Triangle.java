package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name = "Triangle";
    private double a;
    private double height;

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return 0.5*a*height;
    }

    public Triangle(double a, double height) {
        this.a = a;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", height=" + height +
                '}';
    }
}
