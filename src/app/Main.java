package app;
import model.Choice;
import model.Scene;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scene introScene=new Scene();
        Scanner sc=new Scanner(System.in);

        introScene.setTitle("Abandoned cabin");

        introScene.setContent("You enterd a cold abandoned cabin deep in the forest");

        Scene basementScene=new Scene();
        basementScene.setTitle("Dark Basement");

        basementScene.setContent("The basement smeels like rotten flesh");

        Scene escapeScene = new Scene();

        escapeScene.setTitle("Forest Escape");

        escapeScene.setContent("You sprint back into the forest while something follows you.");

        Choice basementChoice = new Choice();

        basementChoice.setChoiceText("Open the basement door");

        basementChoice.setNextScene(basementScene);


        Choice runChoice = new Choice();

        runChoice.setChoiceText("Run outside");

        runChoice.setNextScene(escapeScene);

        List<Choice> introChoices = new ArrayList<>();



        introChoices.add(basementChoice);

        introChoices.add(runChoice);

        introScene.setChoices(introChoices);

        System.out.println("SCENE:");
        System.out.println(introScene.getTitle());

        System.out.println(introScene.getContent());

        System.out.println("\nCHOICES:");



        for (Choice choice : introScene.getChoices()) {

            System.out.println("- " + choice.getChoiceText());

        }

        System.out.println("/n Choose an option");
        int userChoice=sc.nextInt();
        Choice selectedChoice = introChoices.get(userChoice - 1);

        Scene nextScene= selectedChoice.getNextScene();

        System.out.println("\nNEXT SCENE:");

        System.out.println(nextScene.getTitle());

        System.out.println(nextScene.getContent());
    }
}