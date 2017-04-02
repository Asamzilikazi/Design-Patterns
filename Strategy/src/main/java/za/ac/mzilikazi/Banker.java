package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-02.
 */
public class Banker {
    double salary;
    SalaryRequired salaryRequired;

    public Banker(double salary, SalaryRequired salaryRequired) {
        this.salary = salary;
        this.salaryRequired = salaryRequired;
    }

    public void setSalaryRequired(SalaryRequired salaryRequired) {
        this.salaryRequired = salaryRequired;
    }

    public double getSalary() {
        return this.salary;
    }

    public boolean result() {
        return this.salaryRequired.salaryRequired(this.salary);
    }
}
