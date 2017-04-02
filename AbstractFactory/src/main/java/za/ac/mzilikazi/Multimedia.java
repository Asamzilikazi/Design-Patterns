package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-01.
 */
public class Multimedia extends FacultyOfInformaticsAndDesign {

    public Multimedia() {
    }

    public String faculty(Courses courseOffered) {
        String str = null;
        if(courseOffered == Courses.MULTIMEDIA) {
            return "Multimedia ";
        } else {
            if(this.facultyOfInformaticsAndDesign != null) {
                str = this.facultyOfInformaticsAndDesign.faculty(courseOffered);
            }

            return "Not Multimedia " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
