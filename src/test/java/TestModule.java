import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestModule {
    @Test
    public void testModule(){
        // Create Module m1 for testing purposes
        Module m1 = new Module("Machine Learning",
                "CT5161",
                new ArrayList<Student>(),
                new ArrayList<Course>()
        );

        // Check that the values are as expected
        assertEquals("Machine Learning", m1.getMName());
        assertEquals("CT5161", m1.getmID());
        assertEquals(new ArrayList<Course>(), m1.getCourses());
        assertEquals(new ArrayList<Student>(), m1.getStudents());
    }
}
