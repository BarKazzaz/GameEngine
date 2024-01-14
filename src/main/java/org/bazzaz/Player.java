package org.bazzaz;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Player implements GameObject {

    private Shape shape = null;
    private final Collider collider;
    public Player() {
        this.shape = new Rectangle(100, 100);
        this.collider = new Collider(100, 100);
    }

    public void move(Movement move) {
        this.shape.setTranslateX(this.shape.getTranslateX() + move.getVelocityX());
        this.shape.setTranslateY(this.shape.getTranslateY() + move.getVelocityY());
    }

    public void moveTo(Movement movement) {
        this.shape.setTranslateX(movement.getVelocityX());
        this.shape.setTranslateY(movement.getVelocityY());
    }

    @Override
    public Shape draw() {
        return this.shape;
    }

    @Override
    public void update() {
        // this.move(1, 0);
    }

    public Collider getCollider() {
        return collider;
    }
}
