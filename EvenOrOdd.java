package com.java.javaprograms.datatypes;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter the number1 and number2");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1%2==0 && num2%2==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
