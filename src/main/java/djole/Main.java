package djole;

import java.io.IOException;

import javax.xml.stream.XMLStreamException;

public class Main {

	public static void main(String[] args) throws XMLStreamException, IOException {
		
		GsonWriter gsonWriter = new GsonWriter();
		gsonWriter.writeToJson(StAXParser.process(FilepathConstants.XML_FILEPATH), FilepathConstants.GSON_FILEPATH);

	}

}
