package djole;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonWriter {

	public GsonWriter() {

	}

	public void writeToJson(Nutrition nutrition, String gsonFilePath) throws IOException {
		FileWriter fileWriter = new FileWriter(gsonFilePath);
		Gson gson = new GsonBuilder()
				.serializeNulls()
				.setPrettyPrinting()
				.create();
		String klopa = gson.toJson(nutrition);
		fileWriter.write(klopa);
		fileWriter.flush();
		fileWriter.close();
	}

}
