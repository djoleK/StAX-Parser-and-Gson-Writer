package djole;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StAXParser {

	public static Nutrition process(String xmlFilePath) throws FileNotFoundException, XMLStreamException {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(xmlFilePath));
		DailyValues dailyValues = null;
		Food food = null;
		List<Food> foodList = new ArrayList<>();

//		Daily Values

		while (reader.hasNext()) {
			XMLEvent nextEvent = reader.nextEvent();
			if (nextEvent.isStartElement()) {
				StartElement startElement = nextEvent.asStartElement();
				switch (startElement.getName().getLocalPart()) {
				case "daily-values":
					dailyValues = new DailyValues();
					break;
				case "total-fat":
					nextEvent = reader.nextEvent();
					dailyValues.setTotalFat(Integer.parseInt(nextEvent.asCharacters().getData()));
					Attribute totalFatUnits = startElement.getAttributeByName(new QName("units"));
					if (totalFatUnits != null) {
						dailyValues.setTotalFatUnits(totalFatUnits.getValue());
					}
					break;
				case "saturated-fat":
					nextEvent = reader.nextEvent();
					dailyValues.setSaturatedFat(Integer.parseInt(nextEvent.asCharacters().getData()));
					Attribute saturatedFatUnits = startElement.getAttributeByName(new QName("units"));
					if (saturatedFatUnits != null) {
						dailyValues.setSaturatedFatUnits(saturatedFatUnits.getValue());
					}
					break;
				case "cholesterol":
					nextEvent = reader.nextEvent();
					dailyValues.setCholesterol(Integer.parseInt(nextEvent.asCharacters().getData()));
					Attribute cholesterolUnits = startElement.getAttributeByName(new QName("units"));
					if (cholesterolUnits != null) {
						dailyValues.setCholesterolUnits(cholesterolUnits.getValue());
					}
					break;
				case "sodium":
					nextEvent = reader.nextEvent();
					dailyValues.setSodium(Integer.parseInt(nextEvent.asCharacters().getData()));
					Attribute sodiumUnits = startElement.getAttributeByName(new QName("units"));
					if (sodiumUnits != null) {
						dailyValues.setSodiumUnits(sodiumUnits.getValue());
					}
					break;
				case "carb":
					nextEvent = reader.nextEvent();
					dailyValues.setCarb(Integer.parseInt(nextEvent.asCharacters().getData()));
					Attribute carbUnits = startElement.getAttributeByName(new QName("units"));
					if (carbUnits != null) {
						dailyValues.setCarbUnits(carbUnits.getValue());
					}
					break;
				case "fiber":
					nextEvent = reader.nextEvent();
					dailyValues.setFiber(Integer.parseInt(nextEvent.asCharacters().getData()));
					Attribute fiberUnits = startElement.getAttributeByName(new QName("units"));
					if (fiberUnits != null) {
						dailyValues.setFiberUnits(fiberUnits.getValue());
					}
					break;
				case "protein":
					nextEvent = reader.nextEvent();
					dailyValues.setProtein(Integer.parseInt(nextEvent.asCharacters().getData()));
					Attribute proteinUnits = startElement.getAttributeByName(new QName("units"));
					if (proteinUnits != null) {
						dailyValues.setProteinUnits(proteinUnits.getValue());
					}
					break;
				}
			}
			if (nextEvent.isEndElement()) {
				EndElement endElement = nextEvent.asEndElement();
				if (endElement.getName().getLocalPart().equals("daily-values")) {
					break;
				}
			}
		}

		// Food

		while (reader.hasNext()) {
			XMLEvent nextEvent = reader.nextEvent();
			if (nextEvent.isStartElement()) {
				StartElement startElement = nextEvent.asStartElement();
				switch (startElement.getName().getLocalPart()) {
				case "food":
					food = new Food();
					break;
				case "name":
					nextEvent = reader.nextEvent();
					food.setName(nextEvent.asCharacters().getData());
					break;
				case "serving":
					nextEvent = reader.nextEvent();
					food.setServing(Double.parseDouble(nextEvent.asCharacters().getData()));
					Attribute servingUnits = startElement.getAttributeByName(new QName("units"));
					if (servingUnits != null) {
						food.setServingUnits(servingUnits.getValue());
					}
					break;
				case "calories":
					Attribute caloriesTotal = startElement.getAttributeByName(new QName("total"));
					Attribute caloriesFat = startElement.getAttributeByName(new QName("fat"));
					if (caloriesTotal != null && caloriesFat != null) {
						food.setCaloriesTotal(Integer.parseInt(caloriesTotal.getValue()));
						food.setCaloriesFat(Integer.parseInt(caloriesFat.getValue()));
					}
					break;
				case "total-fat":
					nextEvent = reader.nextEvent();
					food.setTotalFat(Double.parseDouble(nextEvent.asCharacters().getData()));
					break;
				case "saturated-fat":
					nextEvent = reader.nextEvent();
					food.setSaturatedFat(Double.parseDouble(nextEvent.asCharacters().getData()));
					break;
				case "cholesterol":
					nextEvent = reader.nextEvent();
					food.setCholesterol(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				case "sodium":
					nextEvent = reader.nextEvent();
					food.setSodium(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				case "carb":
					nextEvent = reader.nextEvent();
					food.setCarb(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				case "fiber":
					nextEvent = reader.nextEvent();
					food.setFiber(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				case "protein":
					nextEvent = reader.nextEvent();
					food.setProtein(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				case "a":
					nextEvent = reader.nextEvent();
					food.setVitaminA(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				case "c":
					nextEvent = reader.nextEvent();
					food.setVitaminC(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				case "ca":
					nextEvent = reader.nextEvent();
					food.setMineralCa(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				case "fe":
					nextEvent = reader.nextEvent();
					food.setMineralFe(Integer.parseInt(nextEvent.asCharacters().getData()));
					break;
				}

			}
			if (nextEvent.isEndElement()) {
				EndElement endElement = nextEvent.asEndElement();
				if (endElement.getName().getLocalPart().equals("food")) {
					foodList.add(food);
				}
			}
		}
		return new Nutrition(dailyValues, foodList);
	}

}
