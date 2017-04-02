package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-04-01.
 */
public class TestFaculty {
    private FacultyOfInformaticsAndDesign facultyOfInformaticsAndDesign;
    private FacultyOfInformaticsAndDesign design = null;
    private FacultyOfInformaticsAndDesign informationtechnology = null;
    private FacultyOfInformaticsAndDesign journalism = null;
    private FacultyOfInformaticsAndDesign multimedia = null;


    @Before
    public void setUp() {
        design = new Design();
        informationtechnology = new InformationTechnology();
        journalism = new Journalism();
        multimedia = new Multimedia();

        design.setFaculty(informationtechnology);
        informationtechnology.setFaculty(journalism);
        journalism.setFaculty(multimedia);

        facultyOfInformaticsAndDesign = design;
    }

    @Test
    public void testDESIGN() {
        Assert.assertEquals(false, facultyOfInformaticsAndDesign.faculty(Courses.DESIGN).equalsIgnoreCase("Design"));
    }

    @Test
    public void testINFORMATIONTECHNOLOGY() {
        Assert.assertEquals(false, facultyOfInformaticsAndDesign.faculty(Courses.INFORMATIONTECHNOLOGY).equalsIgnoreCase("Not design. information technology "));
    }

    @Test
    public void testJOURNALISM() {
        Assert.assertEquals(false, facultyOfInformaticsAndDesign.faculty(Courses.JOURNALISM).equalsIgnoreCase("Not design. Not information technology. journalism "));
    }

    @Test
    public void testMULTIMEDIA() {
        Assert.assertEquals(false, facultyOfInformaticsAndDesign.faculty(Courses.MULTIMEDIA).equalsIgnoreCase("Not design. Not information technology. Not journalism. multimedia "));
    }
}
