//import neccessary packages
import org.joda.time.DateTime;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestStudent {
    public void testStudent(){
        // Create Course c1 and Student s1
        Course c1 = new Course("CS&IT",
                new ArrayList<Module>(),
                new ArrayList<Student>(),
                DateTime.parse("2020-01-09"),
                DateTime.parse("2021-11-05")
        );

        Student s1 = new Student("Carl",
                19,
                12334,
                c1,
                new ArrayList<Module>()
        );

        // Check that the values of Student s1 are as expected
        assertEquals("Carl",s1.getSName());
        assertEquals(19,s1.getAge());
        assertEquals(12334,s1.getId());
        assertEquals(new ArrayList<Module>(), new ArrayList<Module>());
    }

}
