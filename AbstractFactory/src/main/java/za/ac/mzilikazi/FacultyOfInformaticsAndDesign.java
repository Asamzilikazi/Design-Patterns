package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-01.
 */
public abstract class FacultyOfInformaticsAndDesign {
    FacultyOfInformaticsAndDesign facultyOfInformaticsAndDesign;

    public FacultyOfInformaticsAndDesign(){}

    public void setFaculty(FacultyOfInformaticsAndDesign facultyOfInformaticsAndDesign) {
        this.facultyOfInformaticsAndDesign = facultyOfInformaticsAndDesign;
    }

    public abstract String faculty(Courses courses);
}
