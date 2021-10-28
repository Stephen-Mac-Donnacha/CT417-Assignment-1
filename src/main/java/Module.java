import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

public class Module {
    private String mName;
    private String mID;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public Module(String mName, String mID, ArrayList<Student> students, ArrayList<Course> courses){
        setMName(mName);
        setMID(mID);
        setStudents(students);
        setCourses(courses);
    }

    //getter and setter for the mName variable
    public void setMName(String mName){
        this.mName = mName;
    }

    public String getMName(){
        return this.mName;
    }

    //getter and setter for the mID variable
    public void setMID(String mID){
        this.mID = mID;
    }

    public String getmID(){
        return mID;
    }

    //methods for manipulating the student ArrayList
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public ArrayList getStudents(){
        return this.students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    //getter and setter and methods to manipulate course arrayList
    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void printCourses(){
        for (Course c: courses){
            System.out.println(c);
        }
    }

    public void printStudents(){
        for (Student s: students){
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "Module{" +
                "mName='" + mName + '\'' +
                ", mID='" + mID + '\'' +
                '}';
    }
}
