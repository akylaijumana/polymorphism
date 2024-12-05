package org.example;
class Cylinder implements Shape3DInterface {
    private double height, radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    @Override
    public double surfaceArea(){
        return 2* Math.PI*radius*(radius+height);
    }
    @Override
    public double volume(){
        return Math.PI*Math.pow(radius,2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
