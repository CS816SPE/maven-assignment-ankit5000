package com.mycompany.app;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter the operation (+,-,*,/):" );

        Scanner input = new Scanner(System.in);

        char c = input.next().charAt(0);

        System.out.println( "Enter 2 numbers:" );

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        if(c=='+'){
        	double ans = add(num1,num2);
        	System.out.println(ans);
        }
        if(c=='-'){
        	double ans = sub(num1,num2);
        	System.out.println(ans);
        }
        if(c=='*'){
        	double ans = mult(num1,num2);
        	System.out.println(ans);
        }
        if(c=='/'){
        	if(num2 == 0){
        		System.out.println("Division by 0 not defined");
        		return;
        	}
        	double ans = div(num1,num2);
        	System.out.println(ans);
        }

    }

    public static double add(double num1, double num2){
    	return num1 + num2;
    }

    public static double sub(double num1, double num2){
    	return num1 - num2;
    }

    public static double mult(double num1, double num2){
    	return num1*num2;
    }

    public static double div(double num1, double num2){
    	return num1/num2;
    }

}
