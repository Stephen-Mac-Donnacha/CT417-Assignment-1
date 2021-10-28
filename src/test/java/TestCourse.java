import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCourse {
    @Test
    public void testCourse(){
        // Create course object
        Course c1 = new Course("BA&IT",
                new ArrayList<Module>(),
                new ArrayList<Student>(),
                DateTime.parse("2020-01-09"),
                DateTime.parse("2021-11-05")
        );

        // Test that the values are as expected
        assertEquals("BA&IT",c1.getCourseName());
        assertEquals(new ArrayList<Module>(), c1.getModules());
        assertEquals(new ArrayList<Student>(), c1.getStudents());
        assertEquals(DateTime.parse("2020-01-09"), c1.getStartDate());
        assertEquals(DateTime.parse("2021-11-05"), c1.getEndDate());
    }


}
