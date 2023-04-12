package org.example.pictures;

import java.awt.*;

public abstract class Picture {
    private Color color;
    private int x;
    private int y;

    public Picture() {}

    public Picture(Color color, int height, int width) {
        this.color = color;
        this.x = height;
        this.y = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
