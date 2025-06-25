package lab02.prob2A;

public class GradeReport {
    private Student student;
    private String grade;

    public GradeReport(Student student) {
        this.student = student;
        this.grade = "";
    }

    public Student getStudent() {
        return student;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void printGrade() {
        System.out.println("Grade for " + student.getName() + " is " + grade);
    }
}
