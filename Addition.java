package main;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b;
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a = ");
		a = sc.nextFloat();
		System.out.print("Enter b = ");
		b = sc.nextFloat();
		
		System.out.println("Addition : " + a + " + " + b + " = " + Tong(a,b));

	}
	
	public static float Tong(float x, float y) {
		return x + y;
	}
}

