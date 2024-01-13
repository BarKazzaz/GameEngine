package org.bazzaz;

public class Movement {
    private double x = 0;
    private double y = 0;

    public Movement(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getVelocityX() {
        return this.x;
    }
    public double getVelocityY() {
        return this.y;
    }
    public static Movement LEFT = new Movement(-1, 0);
    public static Movement RIGHT = new Movement(1, 0);
    public static Movement UP = new Movement(0, -1);
    public static Movement DOWN = new Movement(0, 1);
}
