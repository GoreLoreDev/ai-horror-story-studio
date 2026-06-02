package service;

import java.io.FileReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonLoader {
    public void loadStory() {
        try {

            FileReader reader =
                    new FileReader(
                            "resources/story.json"
                    );

            JsonObject jsonObject =
                    JsonParser.parseReader(reader)
                            .getAsJsonObject();

            System.out.println(
                    jsonObject.get("title").getAsString()
            );

        }
        catch (Exception e) {

            e.printStackTrace();

        }
    }
}
