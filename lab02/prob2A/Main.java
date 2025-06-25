package lab02.prob2A;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Anna");
        student.printInfo();

        GradeReport report = student.getGradeReport();
        report.setGrade("A");

        student.printInfo();
    }
}
