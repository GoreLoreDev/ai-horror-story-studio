package model;

public class SceneData {
    private String id;

    private String title;

    private String content;

    private String sceneType;

    private int fearEffect;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    public int getFearEffect() {
        return fearEffect;
    }

    public void setFearEffect(int fearEffect) {
        this.fearEffect = fearEffect;
    }
}
