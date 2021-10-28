import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
    public String courseName;
    public ArrayList<Module> modules = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();
    public DateTime startDate = new DateTime();
    public DateTime endDate = new DateTime();

    //constructor for the Course class
    public Course(String courseName, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate){
        setCourseName(courseName);
        setModules(modules);
        setStudents(students);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    //setter method for the courseName variable
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //getter method for the courseName variable
    public String getCourseName(){
        return this.courseName;
    }

    //getter and setter and methods to add/remove modules from the module list
    public void setModules(ArrayList<Module> modules){
        this.modules = modules;
    }

    public ArrayList<Module> getModules(){
        return this.modules;
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public void removeModule(Module module){
        modules.remove(module);
    }

    //getter and setter and methods to add/remove students from the student list
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    //getter and setter for the startDate variable
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    //getter and setter for the endDate variable
    public void setEndDate(DateTime endDate){
        this.endDate = endDate;
    }

    public DateTime getEndDate(){return this.endDate;}

    //print the information in the Modules arrayList
    public void printModules(){
        for(Module m: modules){
            System.out.println(m);
        }
    }

    public void printStudents(){
        for(Student s: students){
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + students +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
