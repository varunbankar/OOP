package com.practice;

public class Point3D extends Point2D {
    private int z;
    public Point3D(int z) {
        super(0,0);
        this.z = z;
    }

    public static void main(String[] args) {
        Point2D p = new Point2D(3, 4);
        Point3D p1 = new Point3D(5);
        p1.print();
    }
}
