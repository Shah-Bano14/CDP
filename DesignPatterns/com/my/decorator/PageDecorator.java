package com.my.decorator;

public class PageDecorator implements WebPage {

	WebPage webPage;

	public PageDecorator(WebPage webPage) {
		this.webPage = webPage;

	}

	@Override
	public int calculateRank() {

		return webPage.calculateRank();
	}

}
