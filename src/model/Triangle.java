package model;

import model.base.Polygon;

public class Triangle extends Polygon {

    public Triangle(Double a, Double b, Double c) throws Exception {
        super(3, new Double[]{a, b, c});
        if (!(a + b > c && a + c > b && b + c > a))
            throw new Exception("Невозможно создать треугольник с заданными сторонами!");
    }

    @Override
    public Double getArea() {
        Double p = super.getPeremetr() / 2;
        // Формула Герона
        return Math.sqrt(p * (p - getlSides()[0]) * (p - getlSides()[1]) * (p - getlSides()[2]));
    }
}
