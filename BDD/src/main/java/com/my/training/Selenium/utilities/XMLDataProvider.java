package com.my.training.Selenium.utilities;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLDataProvider {

	static Logger logger = LogManager.getLogger(ConfigDataProvider.class);
	NodeList list;

	public XMLDataProvider() {
		try {
			File file = new File("./XMLFiles/xmlDataFile.xml");

			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			list = doc.getElementsByTagName("searchData");
		} catch (Exception e) {
			logger.info("could not read xml file");
			e.printStackTrace();
		}

	}

	public String getXMLData() {
		Element ele = (Element) list.item(0);
		return ele.getElementsByTagName("name").item(0).getTextContent();
	}

}
