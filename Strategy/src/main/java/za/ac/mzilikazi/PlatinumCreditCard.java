package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class PlatinumCreditCard implements SalaryRequired {

    public PlatinumCreditCard() {
    }

    public boolean salaryRequired(double salary) {
        return salary >= 58000;
    }

}
