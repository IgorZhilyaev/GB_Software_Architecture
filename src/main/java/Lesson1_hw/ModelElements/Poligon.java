package Lesson1_hw.ModelElements;

import Lesson1_hw.Stuff.Point3D;

import java.util.ArrayList;

/**
 * полигон
 */
public class Poligon {

    public ArrayList<Point3D> points = new ArrayList<Point3D>();

    /**
     * конструктор
     * @param point
     */
    public Poligon(Point3D point) {
        points.add(point);
    }
}
