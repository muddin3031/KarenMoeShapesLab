package com.company;

public class Circle extends Shape{
    private int side;
    public Circle(int side)
    {
        super(type:"circle");
        this.side=side;
    }
    @Override
    public double getArea()
    {
        return 3.14*side*side;

    }
  @Override
    public double getPerimeter()
    {
        return 3.14*side*2;
    }
}
