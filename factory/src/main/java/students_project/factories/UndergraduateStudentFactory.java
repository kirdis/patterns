package students_project.factories;

import students_project.products.coursesProducts.Course;
import students_project.products.coursesProducts.UndergraduateStudentCourse;
import students_project.products.degreeDocumentProducts.DegreeDocument;
import students_project.products.degreeDocumentProducts.ProjectReport;
import students_project.products.paperProducts.Paper;
import students_project.products.paperProducts.TechnicalReport;

public class UndergraduateStudentFactory implements StudentFactory {
    public Course createCourse() {
        return new UndergraduateStudentCourse();
    }

    public DegreeDocument createDegreeDocument() {
        return new ProjectReport();
    }

    public Paper createPaper() {
        return new TechnicalReport();
    }
}
