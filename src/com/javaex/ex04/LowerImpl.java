package com.javaex.ex04;

public class LowerImpl implements Runnable {

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
