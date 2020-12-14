package com.lx;

import java.util.Scanner;

public class Lx1001 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入年份：");
			int year = sc.nextInt();
			if(year%4==0&&year%100!=0||year%400==0) {
				System.out.println(year+"是闰年!");
			}
			else {
				System.out.println(year+"是平年!");
			}

		}}
