package com.practise;

import java.util.concurrent.TimeUnit;

public class CountDown {

	public static void main(String[] args) {

		int i = 100;
		int time;

		// Using While
		while (i > 0) {
			time = i * 100;

			System.out.println("Your life stops in " + time + " milliseconds");

			i--;

			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException ex) {
				System.out.println("You cannot escape your destiny");
			}

			if (i == 0) {
				System.out.println("Bye, Baby!");
			}
		}

	}

}
