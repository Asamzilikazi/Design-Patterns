package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Mercedes implements Prototype {

    private String model;

    public Mercedes(String model) {
        this.model = model;
    }

    public Prototype copy() {
        return new Mercedes(this.model);
    }

    public String toString() {
        return "Mercedes Benz model: " + this.model;
    }
}
