package model;

import java.util.List;

public class Scene {

    private int id;
    private String title;
    private String content;
    private Story story;
    private List<Choice> choices;

    public Scene() {
    }

    public Scene(int id, String title, String content, List<Choice> choices, Story story) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.choices = choices;
        this.story=story;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", choices=" + choices +
                '}';
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}