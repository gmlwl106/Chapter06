package com.javaex.ex03;

public class DigitImpl implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
