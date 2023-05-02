package model;

import model.base.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(Double width, Double height) throws Exception {
        super(4, new Double[]{width, height, width, height});
        if (width.equals(height))
            throw new Exception("Для квадрата существует отдельный класс Square!");

    }

    public Rectangle(Double width) throws Exception {
        super(4, new Double[]{width, width, width, width});
    }

    @Override
    public Double getArea() {
        return getlSides()[0] * getlSides()[1];
    }
}
