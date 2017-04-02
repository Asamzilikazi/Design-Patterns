package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Bmw implements Prototype {

    private String model;

    public Bmw(String model) {
        this.model = model;
    }

    public Prototype copy() {
        return new Bmw(this.model);
    }

    public String toString() {
        return "BMW model: " + this.model;
    }
}
