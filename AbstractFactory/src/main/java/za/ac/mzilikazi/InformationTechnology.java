package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-01.
 */

public class InformationTechnology extends FacultyOfInformaticsAndDesign {

    public InformationTechnology() {
    }

    public String faculty(Courses courseOffered) {
        String str = null;
        if(courseOffered == Courses.INFORMATIONTECHNOLOGY) {
            return "Information Technology ";
        } else {
            if(this.facultyOfInformaticsAndDesign != null) {
                str = this.facultyOfInformaticsAndDesign.faculty(courseOffered);
            }

            return "Not Information Technology " + str;
        }
    }

    public String toString(String string) {
        return string;
    }


}
