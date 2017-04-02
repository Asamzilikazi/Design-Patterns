package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width, ShapeInterface shapeInterface) {
        super(shapeInterface);
        this.height = height;
        this.width = width;
    }

    public String draw() {
        return this.shapeInterface.drawings(this.height, this.width);
    }
}
