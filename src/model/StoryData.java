package model;
import java.util.List;

//THIS CLASS EXISTS FOR JSON DATA MAPPING

public class StoryData {
    private String title;

    private String description;

    private String startingScene;

    private List<SceneData> scenes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartingScene() {
        return startingScene;
    }

    public void setStartingScene(String startingScene) {
        this.startingScene = startingScene;
    }

    public List<SceneData> getScenes() {
        return scenes;
    }

    public void setScenes(List<SceneData> scenes) {
        this.scenes = scenes;
    }
}
