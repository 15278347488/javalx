package com.lx;

import java.util.Scanner;

public class Lx {
	
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入年份：");
			
			int year = scanner.nextInt();
			
			if (year>-3200&&year<0) {
					int year2=Math.abs(year);
					if(year2%4==1&&year2%100!=1||year2%400==1) {
						System.out.println("公元前"+year2+"年是闰年!");
					}
					else {
						System.out.println("公元前"+year2+"年是平年!");
					}
			}else if (year<3200&&year>0) {
					if(year%4==0&&year%100!=0||year%400==0) {
						System.out.println("公元后"+year+"年是闰年!");
					}
					else {
						System.out.println("公元后"+year+"年是平年!");
					}	
			} else if (year==0) {
					System.out.println(year+"年不是润年也不是平年哟!");
			}else {
					System.out.println("只可以输入-3200到3200之间的年份哟");
			}
	
			System.out.println();
		
		}

	}

}
