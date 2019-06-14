package org.hillel.homework.dom_parser;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomParserDemo {

    private static List<Event> eventList = new ArrayList<>();

    private static String fileName = "C:\\Users\\SunBunny\\IdeaProjects\\homework_18\\src\\main\\resources\\test_file.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //преобразовать указанный XML в List<Event>

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(fileName));
        document.getDocumentElement().normalize();

        Element rootElement = document.getDocumentElement();
        System.out.println(printAllDocumentNodes(rootElement.getChildNodes()));
    }

    private static List<Event> printAllDocumentNodes(NodeList nodeList) {
        List<Event> eventList = new ArrayList<>();
        List<EventParameter> eventParameterList = new ArrayList<>();
        Event event = null;

        EventParameter eventParameter = null;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                event = new Event();
                event.setEventId(element.getElementsByTagName("event_id").item(0).getTextContent());
                event.setEventDate(element.getElementsByTagName("event_date").item(0).getTextContent());

                eventParameter = new EventParameter();
                eventParameter.setPriority(Integer.parseInt(element.getElementsByTagName("priority").item(0).getTextContent()));
                eventParameter.setLogLevel(element.getElementsByTagName("log_level").item(0).getTextContent());
                eventParameter.setSource(element.getElementsByTagName("source").item(0).getTextContent());

                eventParameterList.add(eventParameter);
                event.setEventParameter(eventParameter);
                eventList.add(event);
            }
        }
        return eventList;
    }
}


