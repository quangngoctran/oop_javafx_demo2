package com.example.oop_javafx_demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Pane myPane;

    @FXML
    private Circle myCircle;

    @FXML
    private Button enlargeButton;

    @FXML
    private Button shrinkButton;

    @FXML
    protected void onEnlargeClicked() {
        if (myCircle.getCenterX() - myCircle.getRadius() - 5 > 0 &&
                myCircle.getCenterX() + myCircle.getRadius() + 5 < myPane.getWidth() &&
                myCircle.getCenterY() - myCircle.getRadius() - 5 > 0 &&
                myCircle.getCenterX() + myCircle.getRadius() + 5 < myPane.getHeight() ) {
            myCircle.setRadius(myCircle.getRadius() + 5);
        }
    }

    @FXML
    protected void onShrinkClicked() {
        myCircle.setRadius(myCircle.getRadius() - 5 > 2 ? myCircle.getRadius() - 5 : myCircle.getRadius());
    }
}