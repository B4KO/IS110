import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Grade> grades = new ArrayList<Grade>();
    private ArrayList<Subject> subjects = new ArrayList<Subject>();

    public Student(String iname) {
        name = iname;
    }

    public void getSubjects() {
        for (Grade grade : grades) {
            grade.
        }

    }

    public void addGrade() {

    }

    public void addSubject() {

    }

    public void removeGrade() {

    }

    public void removeSubject() {

    }

}

class Grade {
    private Subject subject;
    private String grade;

    public Grade(Subject isubject,String igrade) {
        subject = isubject;
        grade = igrade;
    }
}

class Subject {
    private String name;
    private int points;

    public Subject(String iname, int ipoints) {
        name = iname;
        points = ipoints;
    }
}



class Main {
public static void main(String[] args) {
    System.out.println("Works")
    
}
}