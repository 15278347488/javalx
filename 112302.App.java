package com.app;

public class App {
	public static void main(String[] args) throws InterruptedException {
	int arr[][]={
			{100,100},
			{200,200},
			{300,300},
			{400,400},
	};
		while (true) {
		Thread.sleep(1000);
		System.out.println("没事才过去一秒\r");
		int cmd=(int)(Math.random()*10%4);
		System.err.println(arr[cmd][0]+","+arr[cmd][1]);
	}	
	}
}
