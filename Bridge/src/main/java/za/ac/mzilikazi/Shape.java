package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public abstract class Shape {
    protected ShapeInterface shapeInterface;

    protected Shape(ShapeInterface shapeInterface) {
        this.shapeInterface = shapeInterface;
    }

    public abstract String draw();
}
