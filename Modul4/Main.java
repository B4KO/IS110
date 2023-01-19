import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private String name;
    private ArrayList<Grade> grades = new ArrayList<Grade>();
    private ArrayList<Subject> subjects = new ArrayList<Subject>();

    Student(String iname) {
        name = iname;
    }

    public void printGrades() {
        int iteration = 0;
        for (Grade grade : grades) {
            System.out.println(grade.getGrade()+" in "+grade.getSubject().getName()+". Index: "+iteration+"\n");
            ++iteration;
        }

    }

    public void getGrade(Subject subject) {
        Iterator<Grade> itr = grades.iterator();
        Grade gradeItr;

        while (itr.hasNext()) {
            gradeItr = itr.next();
            if (gradeItr.getSubject().getName() == subject.getName()) {
                gradeItr.printGrade();
                break;
            }
        }
        

    }

    public void printSubjects() {
        int len = subjects.size();
        int iteration = 0;
        while (len != iteration) {
            System.out.println(subjects.get(iteration).getName()+" is in your profile at index "+iteration+"\n");
            ++iteration;
        }
        
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
        
    }

    public void addGrade(Grade grade) {
        grades.add(grade);

    }

    public void removeGrade(int index) {
        grades.remove(index);
    }

    public void removeSubject(int index) {
        subjects.remove(index);
    }

}

class Grade {
    private Subject subject;
    private Student student; 
    private String grade;

    Grade(Subject isubject, Student istudent, String igrade) {
        subject = isubject;
        grade = igrade;
    }

    public Student getStudent() {
        return student;
    }

    public String getGrade() {
        return grade;
    }
    
    public Subject getSubject() {
        return subject;
    }

    public void printGrade() {
        System.out.println(grade +"\n");
    }

}

class Subject {
    private String name;
    private int points;

    Subject(String iname, int ipoints) {
        name = iname;
        points = ipoints;
    }

    public String getName() {
        return name;
    }
}



class Main {
public static void main(String[] args) {
    
    Student karl = new Student("Karl");
    Subject is100 = new Subject("IS100", 10);
    Subject is101 = new Subject("IS101", 10);
    Subject is102 = new Subject("IS102", 10);
    Subject is103 = new Subject("IS103", 10);
    
    Grade is100karl = new Grade(is100, karl, "A");
    Grade is101karl = new Grade(is101, karl, "B");
    Grade is102karl = new Grade(is102, karl, "C");

    karl.addGrade(is100karl);
    karl.addGrade(is101karl);
    karl.addGrade(is102karl);

    karl.addSubject(is100);
    karl.addSubject(is101);
    karl.addSubject(is102);
    karl.addSubject(is103);

    karl.printGrades();
    karl.printSubjects();

    karl.removeGrade(1);
    karl.removeSubject(2);

    karl.printGrades();
    karl.printSubjects();

    karl.getGrade(is100);
    
    
}
}