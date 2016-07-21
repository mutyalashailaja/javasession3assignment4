package session3ass4;

import java.util.Scanner;

public class calculator {
	int a=20;
	int b=30;
	int c,d,e,f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


 
calculator program=new calculator();
program.add();
program.substract();
program.multiplication();
program.divide();

	}
	public int add(){
		c=a+b;
		System.out.println("sum of two numbers is :"+c);
		return c;

}
	public int substract(){
		d=a-b;
		System.out.println("substraction of two numbers is :"+d);
		return d;
		
		}
	public int multiplication(){
		e=a*b;
		System.out.println("multiplication of two numbers is :"+e);
		return e;
	}
	public int divide(){
		f=a/b;
		System.out.println("division of two numbers is :"+f);
		return f;
	}
	}
