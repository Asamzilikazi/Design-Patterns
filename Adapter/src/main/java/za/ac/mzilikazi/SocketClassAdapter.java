package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017/03/30.
 */
public class SocketClassAdapter extends Socket implements SocketAdapter {

    public Voltage get240Volt() {
        return getVoltage();
    }

    public Voltage get12Volt() {
        Voltage v= getVoltage();
        return convertVolt(v,10);
    }


    public Voltage get3Volt() {
        Voltage v= getVoltage();
        return convertVolt(v,40);
    }

    private Voltage convertVolt(Voltage v, int i) {
        return new Voltage(v.getVolts()/i);
    }
}
