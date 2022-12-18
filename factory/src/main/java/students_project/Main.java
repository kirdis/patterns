package students_project;

import students_project.factories.MsStudentFactory;

public class Main {

    public static void main(String[] args) {
        MsStudentFactory msStudentFactory = new MsStudentFactory();
        Student msStudent = new Student()
                .withType("MsStudent")
                .withCourse(msStudentFactory.createCourse())
                .withDocument(msStudentFactory.createDegreeDocument())
                .withPaper(msStudentFactory.createPaper());
        System.out.println(msStudent);
    }
}
