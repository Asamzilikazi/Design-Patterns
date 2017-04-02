package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-04-01.
 */
public class Design extends FacultyOfInformaticsAndDesign{
    public Design() {
    }

    public String faculty(Courses courseOffered) {
        String str = null;
        if(courseOffered == Courses.DESIGN) {
            return "Design ";
        } else {
            if(this.facultyOfInformaticsAndDesign != null) {
                str = this.facultyOfInformaticsAndDesign.faculty(courseOffered);
            }

            return "Not Design " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
