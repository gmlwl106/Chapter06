package com.javaex.ex02;

public class LowerThread extends Thread {

	@Override
	public void run() {
		
		for(char c='a'; c<='z'; c++) {
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
