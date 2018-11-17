package com.darshni;

public abstract class Cube extends Shape {
	private double width=0;
	

	public Cube(){
		this(1);
	}
	public Cube(double width){
		
		this.width=width;
		
	}
	@Override
	public double area() {
		
		return width*width;
	}
	@Override
	public double perimeter() {
		
		return 6*width;
	}
	

}
