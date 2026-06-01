package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;

import model.Choice;
import model.Scene;
import service.StoryEngine;

import java.awt.BorderLayout;

public class MainWindow extends JFrame {

    private StoryEngine engine;

    private JTextArea storyArea;
    private JPanel choicePanel;
    private JTextArea statusArea;

    public MainWindow(StoryEngine engine) {

        this.engine=engine;

        setTitle("AI Horror Story Studio");

        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());



        JPanel mainPanel =
                new JPanel(new BorderLayout());



        storyArea = new JTextArea();
        statusArea=new JTextArea();

        statusArea.setEditable(false);

        statusArea.setText("Fear Level: 0");

        storyArea.setText(
                "Welcome to Horror Story Studio"
        );

        choicePanel=new JPanel();
        choicePanel.setLayout(
                new GridLayout(0, 1) //unlimited rows, 1 col
        );


        storyArea.setEditable(false);
        storyArea.setLineWrap(true);
        storyArea.setWrapStyleWord(true);

        storyArea.setFont(
                new Font("Serif",
                        Font.PLAIN,
                        20)
        );



        JScrollPane scrollPane =
                new JScrollPane(storyArea);



        add(mainPanel, BorderLayout.CENTER);

        mainPanel.add(scrollPane,
                BorderLayout.CENTER);

        mainPanel.add(statusArea,
                BorderLayout.NORTH);

        mainPanel.add(choicePanel,
                BorderLayout.SOUTH);



        displayChoices();






        setVisible(true);
    }

    public void displayScene(String title,
                             String content) {

        storyArea.setText(
                title + "\n\n" + content
        );
    }

    public void displayChoices(){
        choicePanel.removeAll();

        Scene currentScene =
                engine.getCurrentScene();

        if (currentScene.getChoices().isEmpty()) {

            JButton endButton =
                    new JButton("Story Ended");

            endButton.setEnabled(false);

            choicePanel.add(endButton);

            choicePanel.revalidate();

            choicePanel.repaint();

            return;
        }

        for (Choice choice :
                currentScene.getChoices()) {

            JButton button =
                    new JButton(choice.getChoiceText());

            button.addActionListener(e -> {

                engine.chooseChoice(choice);

                Scene nextScene =
                        engine.getCurrentScene();

                renderScene(nextScene);

                displayChoices();

            });

            choicePanel.add(button);
        }



        choicePanel.revalidate();

        choicePanel.repaint();
    }

    public void renderScene(Scene scene){
        displayScene(
                scene.getTitle(),
                scene.getContent()
        );
        updateStatus();
        displayChoices();

    }
    public void updateStatus() {
        statusArea.setText(
                "Fear Level: " +
                        engine.getPlayerState().getFearLevel()
        );
    }
}