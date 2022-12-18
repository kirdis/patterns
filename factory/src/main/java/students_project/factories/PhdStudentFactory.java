package students_project.factories;

import students_project.products.coursesProducts.Course;
import students_project.products.coursesProducts.PhdCourse;
import students_project.products.degreeDocumentProducts.DegreeDocument;
import students_project.products.degreeDocumentProducts.Dissertation;
import students_project.products.paperProducts.JournalPaper;
import students_project.products.paperProducts.Paper;

public class PhdStudentFactory implements StudentFactory {
    public Course createCourse() {
        return new PhdCourse();
    }

    public DegreeDocument createDegreeDocument() {
        return new Dissertation();
    }

    public Paper createPaper() {
        return new JournalPaper();
    }
}
