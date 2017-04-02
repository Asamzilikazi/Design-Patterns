package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Legs implements BodyPart {
    public Legs() {
    }

    public String move(BodyMovement bodyMovement) {
        return bodyMovement.movePart(this);
    }

}
