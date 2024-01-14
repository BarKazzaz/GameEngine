package org.bazzaz;

import javafx.scene.shape.Rectangle;

public class Collider {
    double width, height;
    Rectangle boundriesRect;

    public Collider(double width, double height) {
        this.width = width;
        this.height = height;
        this.boundriesRect = new Rectangle(this.width, this.height);
    }

    public Rectangle draw() {
        return this.boundriesRect;
    }
}
