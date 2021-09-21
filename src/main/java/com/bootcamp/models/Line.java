package com.bootcamp.models;

public class Line {
    private final Point startPoint;
    private final Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getLength() {
        return Math.sqrt(
            Math.pow(startPoint.getCoorX() - endPoint.getCoorX(), 2)
                + Math.pow(startPoint.getCoorY() - endPoint.getCoorY(), 2)
        );
    }
}
