package com.company;

public class ETriangle extends Shape{
  private int side;
  public ETriangle(int side)
  {
    super(type:"ETriangle");
    this.side=side;
  }
  @Override
  public double getArea()
  {
    return 1/2*side*Math.sqrt(3)*side*1/2;
    
  }
  @Override
  public double getPerimeter()
  {
    return side*3;
  }
}
