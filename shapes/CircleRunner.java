package com.xworkz.methodOverriding.shapes;

import com.xworkz.methodOverriding.shapes.circle.Circle;
import com.xworkz.methodOverriding.shapes.shape.Shape;

public class CircleRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.calculateArea();
        shape.calculatePerimeter();
        shape.rotate();
        shape.resize();

        Shape shape1 = new Circle();
        shape1.draw();
        shape1.calculateArea();
        shape1.calculatePerimeter();
        shape1.rotate();
        shape1.resize();

        Circle circle = new Circle();
        circle.draw();
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.rotate();
        circle.resize();
    }
}
