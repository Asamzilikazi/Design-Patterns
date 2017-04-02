package za.ac.mzilikazi;

import java.util.Date;

/**
 * Created by mandisi on 2017-04-02.
 */
public abstract class Device {
    public String deviceInserted(){
        return "New Device inserted at " + new Date();
    }
}

