package com.levelup.lesson1.task1;

import java.lang.Math;

class Entry {
	public static void main(String [] args) {
		if (args.length > 0) {
			Calc c = new Calc(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
			System.out.println("a = " + c.getA() + "\t b= " + c.getB());
			System.out.println("a + b =\t" + c.sum());
			System.out.println("a - b =\t" + c.minus());
			System.out.println("a ^ b =\t" + c.pow());
			System.out.println("a * b =\t" + c.mul());
			System.out.println("a / b =\t" + c.div());
		}
		else {
			System.out.println("No specified paremeters. Two numbers requiered.");
		}
	}
}
class Calc {
	private int a,b;//ToDo setters and getters
	
	public int getA() { return a; }
	public void setA(int value) { a = value; } 
	
	public int getB() { return b; }
	public void setB(int value) { b = value; } 
	
	public Calc () {}
	public Calc (int arg1, int arg2) {
		this.a = arg1;
		this.b = arg2;
	}
	
	public int sum() { return (int)(a + b); }
	public double div(){ return (double)a / (double)b; }
	public double pow(){ return Math.pow((double)a,(double)b); }
	public int mul(){ return a * b; }
	public int minus(){ return a - b; }

}
