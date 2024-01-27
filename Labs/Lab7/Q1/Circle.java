class Circle
{
  double radius = 1.0;
  Circle(){}
  Circle(double newRadius)
  {
    radius = newRadius;
  }
  double getArea()
  {
    return radius * radius * 3.14159;
  }
  @Override
  public String toString()
  {
    return "radius = " + radius;
  }
}
