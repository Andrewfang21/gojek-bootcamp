package com.bootcamp;

import com.bootcamp.models.Line;
import com.bootcamp.models.Point;

public class LineClient {

    public double calculateLength(int x1, int y1, int x2, int y2) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        return new Line(p1, p2).getLength();
    }
}
