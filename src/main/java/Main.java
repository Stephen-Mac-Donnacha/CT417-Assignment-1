import org.joda.time.DateTime;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Create some mock Objects for each of the classes

        Course c1 = new Course(
                "Computer Science and IT",
                new ArrayList<Module>(),
                new ArrayList<Student>(),
                DateTime.parse("2021-09-01"),
                DateTime.parse("2022-05-29")
        );

        Course c2 = new Course("Mathematical Sciences",
                new ArrayList<Module>(),
                new ArrayList<Student>(),
                DateTime.parse("2021-09-01"),
                DateTime.parse("2022-05-29")
        );

        Student s1 = new Student("Stephen",
                21,
                2144141,
                c1,
                new ArrayList<Module>()
        );

        Student s2 = new Student("Ewan",
                22,
                21421444,
                c2,
                new ArrayList<Module>()
        );

        Module m1 = new Module("Machine Learning",
                "CT5161",
                new ArrayList<Student>(),
                new ArrayList<Course>()
        );

        Module m2 = new Module("Software Engineering III",
                "CT437",
                new ArrayList<Student>(),
                new ArrayList<Course>()
        );

        // Create an arrayList for the modules and add them to the students

        ArrayList<Module> mList1 = new ArrayList<>();
        ArrayList<Module> mList2 = new ArrayList<>();

        mList1.add(m1);
        mList2.add(m2);

        c1.addModule(m1);
        c2.addModule(m1);
        c1.addModule(m2);

        m1.addStudent(s1);
        m2.addStudent(s2);
        m2.addStudent(s2);

        s1.addModule(m1);
        s2.addModule(m2);

        System.out.println("Student one has the following information");
        System.out.println("==========================================");
        System.out.println(s1);
        s1.printModules();
        System.out.println("==========================================");

        System.out.println("Student two has the following information");
        System.out.println("==========================================");
        System.out.println(s2);
        s2.printModules();
        System.out.println("===========================================");

        System.out.println("Module one has the following information");
        System.out.println("==========================================");
        System.out.println(m1);
        m1.printCourses();
        m1.printStudents();
        System.out.println("===========================================");

        System.out.println("Module two has the following information");
        System.out.println("==========================================");
        System.out.println(m2);
        m2.printCourses();
        m2.printStudents();
        System.out.println("===========================================");

        System.out.println("Course one has the following information");
        System.out.println("========================================");
        System.out.println(c1);
        c1.printModules();
        c1.printStudents();
        System.out.println("=========================================");

        System.out.println("Course two has the following information");
        System.out.println("========================================");
        System.out.println(c2);
        c2.printModules();
        c2.printStudents();
        System.out.println("=========================================");

    }
}
