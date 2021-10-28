
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Student {
    private String sName;
    private int id;
    private int age;
    private LocalDateTime dob;
    private ArrayList <Module> modules = new ArrayList<>();
    private Course course;

    public Student(String sName, int age, int id, Course course, ArrayList<Module> modules){
        setSName(sName);
        setAge(age);
        setId(id);
        setCourse(course);
        setModules(modules);
    }

    //getters and setters for the sName variable
    public void setSName(String sName){
        this.sName = sName;
    }

    public String getSName(){
        return this.sName;
    }

    //getters and setters for the id variable
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    //getters and setters for the age variable
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    //getters and setters for the dob variable
    public void setDob(LocalDateTime dob){
        this.dob = dob;
    }

    public LocalDateTime getDob(){
        return this.dob;
    }

    //getters and setters for the Course variable
    public void setCourse(Course course){
        this.course = course;
    }

    public Course getCourse(){
        return this.course;
    }

    //getters and setters and methods to add/remove modules from the module arrayList
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

    public void printModules(){
        for (Module m: modules){
            System.out.println(modules);
        }
    }

    //toString method
    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", dob=" + dob +
                ", course=" + course;
    }
}

