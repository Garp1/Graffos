package com.example.fadi.graffos;

/**
 * Created by Diego on 16/08/2017.
 */

public class Arista {
    //El punto 1 es el del nodo A y el punto 2 sera del nodo B para asi poder unirlos y luego hacer verificacion de conexiones
    private float x1,y1,x2,y2;
    private boolean dir = false;

    public Arista(float x1, float y1, float x2, float y2, boolean dir) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.dir = dir;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    public boolean isDir() {
        return dir;
    }

    public void setDir(boolean dir) {
        this.dir = dir;
    }
}
