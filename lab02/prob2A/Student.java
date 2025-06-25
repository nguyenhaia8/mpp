package lab02.prob2A;

public class Student {
    private String name;
    private GradeReport gradeReport;

    public Student(String name) {
        this.name = name;
        this.gradeReport = new GradeReport(this);
    }

    public String getName() {
        return name;
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        gradeReport.printGrade();
    }
}
