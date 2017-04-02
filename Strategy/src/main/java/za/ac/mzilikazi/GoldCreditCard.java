package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class GoldCreditCard implements SalaryRequired {

    public GoldCreditCard() {
    }

    public boolean salaryRequired(double salary) {
        return salary >= 5000;
    }
}
