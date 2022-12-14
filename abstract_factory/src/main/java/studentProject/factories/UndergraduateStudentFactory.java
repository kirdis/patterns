package studentProject.factories;

import studentProject.products.coursesProducts.Course;
import studentProject.products.coursesProducts.UndergraduateStudentCourse;
import studentProject.products.degreeDocumentProducts.DegreeDocument;
import studentProject.products.degreeDocumentProducts.ProjectReport;
import studentProject.products.paperProducts.Paper;
import studentProject.products.paperProducts.TechnicalReport;

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
