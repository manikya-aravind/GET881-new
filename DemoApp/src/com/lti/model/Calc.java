package com.lti.model;

public class Calc {
	public void add(int num1,int num2){
		System.out.println("Summation = "+num1+num2);
	}
	public void subs(int num1,int num2){
		System.out.println("Sub = "+(num1-num2));
	}
	
	public void mul(int num1,int num2){
		System.out.println("mul = "+(num1*num2));
	}
	
	public void div(int num1,int num2){
		System.out.println("div = "+(num1/num2));
	}
	public void exp(int num1, int num2){
		System.out.println(num1^num2);
	}

	public void square(int num1,int num2){
		System.out.println(num1*num2);
	
	public void cube(int num1, int num2,int num3){
		System.out.println(num1*num2*num3);
	}

}
