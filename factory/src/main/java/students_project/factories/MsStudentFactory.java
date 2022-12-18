package students_project.factories;

import students_project.products.coursesProducts.Course;
import students_project.products.coursesProducts.MsStudentCourse;
import students_project.products.degreeDocumentProducts.DegreeDocument;
import students_project.products.degreeDocumentProducts.MsThesis;
import students_project.products.paperProducts.ConferencePaper;
import students_project.products.paperProducts.Paper;

public class MsStudentFactory implements StudentFactory {
    public Course createCourse() {
        return new MsStudentCourse();
    }

    public DegreeDocument createDegreeDocument() {
        return new MsThesis();
    }

    public Paper createPaper() {
        return new ConferencePaper();
    }
}
