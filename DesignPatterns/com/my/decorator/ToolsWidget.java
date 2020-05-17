package com.my.decorator;

public class ToolsWidget extends PageDecorator {

	int point = 20;

	public ToolsWidget(WebPage webPage) {
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
