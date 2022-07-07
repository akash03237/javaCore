package com.rays3.tst;

public class Circle extends Shape1 {
private  int radius ;
public Circle() {
	

}
public Circle(int r) {
	radius=r;
}
public double area() {
	double area = Shape.getPi()*radius*radius;
System.out.println("the area circle is "+area);
return area;
}
}
