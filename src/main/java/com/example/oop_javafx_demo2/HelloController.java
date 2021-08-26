package com.example.oop_javafx_demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

public class HelloController {
    private static final int DIST = 5;
    @FXML
    private StackPane myPane;

    @FXML
    private Circle myCircle;

    @FXML
    private Button enlargeButton;

    @FXML
    private Button shrinkButton;

    @FXML
    protected void onEnlargeClicked() {
        if ((myCircle.getRadius() + DIST) * 2 < myPane.getHeight() && ((myCircle.getRadius() + DIST) * 2) < myPane.getWidth()) {
            myCircle.setRadius(myCircle.getRadius() + DIST);
        }
    }

    @FXML
    protected void onShrinkClicked() {
        myCircle.setRadius(myCircle.getRadius() - DIST > 0 ? myCircle.getRadius() - DIST : myCircle.getRadius());
    }
}