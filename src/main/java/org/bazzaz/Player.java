package org.bazzaz;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Player {

    private Shape shape = null;
    public Player() {
        this.shape = new Rectangle(100, 100);
    }

    public void move(double xVelocity, double yVelocity) {
        this.shape.setTranslateX(this.shape.getTranslateX() + xVelocity);
        this.shape.setTranslateY(this.shape.getTranslateY() + yVelocity);
    }

    public Shape draw() {
        return this.shape;
    }

}
