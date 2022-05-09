package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) {
		
		/*Runnable digit = new DigitImpl();
		Thread thread = new Thread(digit);*/
		
		Thread thread = new Thread(new DigitImpl());
		
		thread.start();
		
		for(char c='A'; c<='Z'; c++) {
			System.out.println(c);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
