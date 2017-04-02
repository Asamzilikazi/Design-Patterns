package za.ac.mzilikazi;

import java.util.Date;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Proxy {
    Phone phone;

    public Proxy(){
        System.out.println("Creating Proxy at " + new Date());
    }

    public String insertDevice(){
        if(phone == null){
            phone = new Phone();
        }
        phone.deviceInserted();

        return null;
    }
}
