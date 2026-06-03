package service;

import java.io.FileReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.Gson;
import model.StoryData;

public class JsonLoader {
    public void loadStory() {
        try {

            FileReader reader =
                    new FileReader(
                            "resources/story.json"
                    );

            Gson gson = new Gson();

            StoryData storyData =
                    gson.fromJson(
                            reader,
                            StoryData.class
                    );

            System.out.println(
                    storyData.getTitle()
            ); //GSON NOW READS JSON, CREATES JAVA OBJECT, FILLS FIELDS AUTOMATICALLY

            System.out.println(
                    storyData.getScenes()
            );

        }
        catch (Exception e) {

            e.printStackTrace();

        }
    }
}
