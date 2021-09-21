package com.bootcamp.models;

public class Point {
    private final int coorX;
    private final int coorY;

    public Point(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public int getCoorX() {
        return coorX;
    }

    public int getCoorY() {
        return coorY;
    }
}
