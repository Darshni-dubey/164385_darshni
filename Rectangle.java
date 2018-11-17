package com.darshni;

public abstract class Rectangle extends Shape {
private double width=0;
private double length=0;

public Rectangle(){
	this(1,1);
	
}
public Rectangle(double width, double length){
	
	this.width=width;
	this.length=length;
}
@Override
public double area() {
	
	return width*length;
}
@Override
public double perimeter() {
	
	return 2*(width+length);
}

}
