package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Thread thread = new DigitThread();
		//thread.run();
		//start()는 아래에 있는 로직과 DigitThread의 run을 동시에 실행 시키지만 그냥 run()을 사용하면 run()이 끝날때까지 아래에 있는 로직을 실행하지 않음
		thread.start();
		
		for(char c = 'A'; c <= 'Z'; c++) {
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
