package com.bootcamp.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {

    private static final double EPS = 1e-9;

    @Test
    public void whenGivenDifferentCoordinatePoints_shouldReturnCorrectLength() {
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 4);
        Line line = new Line(startPoint, endPoint);

        assertEquals(5.0, line.getLength(), EPS);
    }

    @Test
    public void whenGivenSameCoordinatePoints_shouldReturnZeroLength() {
        Point startPoint = new Point(10000, 10000);
        Point endPoint = new Point(10000, 10000);
        Line line = new Line(startPoint, endPoint);

        assertEquals(0, line.getLength(), EPS);
    }
}
