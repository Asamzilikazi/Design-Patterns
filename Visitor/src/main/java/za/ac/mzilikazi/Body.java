package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Body implements BodyPart{
    BodyPart[] parts = new BodyPart[]{new Arms(), new Legs()};

    public Body() {
    }

    public String move(BodyMovement bodyMovement) {
        String str = "";

        for(int i = 0; i < this.parts.length; ++i) {
            str = str + this.parts[i].move(bodyMovement);
        }

        return str + bodyMovement.movePart(this);
    }
}
