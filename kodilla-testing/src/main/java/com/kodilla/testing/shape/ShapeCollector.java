package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures ;

    public ShapeCollector() {
        figures = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape) {
        if(shape!=null) {
            figures.add(shape);
        }
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;

        result = figures.remove(shape);

        return result;
    }

    public Shape getFigure(int n) {
        Shape result = null;

        if(n>=0 && n<figures.size()) {
            result = figures.get(n);
        }

        return result;
    }

    public int returnFiguresQuantity() {
        return figures.size();
    }

    public void showFigures() {

       for(Shape s : figures) {
           System.out.println(s);
       }
    }
}
