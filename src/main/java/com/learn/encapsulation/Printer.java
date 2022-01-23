package com.learn.encapsulation;

public class Printer {

	private int tonerLevel = -1;
	private int pagesPrinted = 0;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		}

		this.duplex = duplex;

	}

	public int addToner(int tonerAmount) {
		int newTonerLevel = this.tonerLevel + tonerAmount;
		if (tonerAmount > 0 && tonerAmount <= 100 && newTonerLevel <= 100) {
			this.tonerLevel = newTonerLevel;
			return newTonerLevel;

		}
		return -1;

	}

	public int printPages(int pageCount) {
		
		int pagesToPrint = duplex ? pageCount / 2 + pageCount%2 : pageCount;

		this.pagesPrinted += pagesToPrint;

		return pagesToPrint;
	}

	public int getPagesPrinted() {

		return this.pagesPrinted;
	}
}
