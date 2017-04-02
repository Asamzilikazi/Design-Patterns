package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Arms implements BodyPart {
    public Arms() {
    }

    public String move(BodyMovement bodyMovement) {
        return bodyMovement.movePart(this);
    }

}
