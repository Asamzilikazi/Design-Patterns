package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-01.
 */
public class Journalism extends FacultyOfInformaticsAndDesign {

    public Journalism() {
    }

    public String faculty(Courses courseOffered) {
        String str = null;
        if(courseOffered == Courses.JOURNALISM) {
            return "Journalism ";
        } else {
            if(this.facultyOfInformaticsAndDesign != null) {
                str = this.facultyOfInformaticsAndDesign.faculty(courseOffered);
            }

            return "Not Journalism " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
