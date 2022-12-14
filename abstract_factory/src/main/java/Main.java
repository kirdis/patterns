import studentProject.factories.MsStudentFactory;
import studentProject.factories.StudentFactory;

public class Main {
    public static void main(String[] args) {
        StudentFactory msStudentFactory = new MsStudentFactory();

        Student msStudent = new Student()
                .withType("Ms Student")
                .withDocument(msStudentFactory.createDegreeDocument())
                .withCourse(msStudentFactory.createCourse())
                .withPaper(msStudentFactory.createPaper());
        System.out.println(msStudent.toString());
    }
}
