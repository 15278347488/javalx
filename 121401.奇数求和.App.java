package com.lx;


public class Lx {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		 while (i <= 2147483647){
		        if (i % 2 == 1){
		            sum =sum + i;
		        }
		        i++;
		    }
		    System.out.println("sum = "+sum);
		}}	
	


