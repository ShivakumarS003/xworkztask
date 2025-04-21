package com.xworkz.methodOverriding.shapes.circle;

import com.xworkz.methodOverriding.shapes.shape.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle: Drawing a circle");
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle: Area = π * r * r");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circle: Perimeter = 2 * π * r");
    }

    @Override
    public void rotate() {
        System.out.println("Circle: Rotation has no visual effect");
    }

    @Override
    public void resize() {
        System.out.println("Circle: Resizing based on radius");
    }
}
