package com.my.decorator;

public class WebPageDriver {

	public static void main(String[] args) {

		ToolsWidget toolsWidgetWithDesktopVersion = new ToolsWidget(new PageDecorator(new DeskTopVersion()));
		System.out.println(toolsWidgetWithDesktopVersion.calculateRank());

		ComponentWidget componentWidgetWithMobileVersion = new ComponentWidget(new PageDecorator(new MobileVersion()));
		System.out.println(componentWidgetWithMobileVersion.calculateRank());
	}

}
