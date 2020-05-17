package com.my.decorator;

public class ComponentWidget extends PageDecorator {

	int point = 15;

	public ComponentWidget(WebPage webPage) {
		super(webPage);
	}

	@Override
	public int calculateRank() {
		return webPage.calculateRank() + widgetRank();
	}

	private int widgetRank() {

		return point;
	}

}
