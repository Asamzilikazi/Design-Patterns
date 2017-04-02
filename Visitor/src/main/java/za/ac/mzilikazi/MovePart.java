package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class MovePart implements BodyMovement {
    public MovePart() {
    }

    public String movePart(Body body) {
        return "Moving body ";
    }

    public String movePart(Arms arms) {
        return "Moving arms ";
    }

    public String movePart(Legs legs) {
        return "Moving legs ";
    }

}
