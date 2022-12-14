package studentProject.factories;

import studentProject.products.coursesProducts.Course;
import studentProject.products.coursesProducts.PhdCourse;
import studentProject.products.degreeDocumentProducts.DegreeDocument;
import studentProject.products.degreeDocumentProducts.Dissertation;
import studentProject.products.paperProducts.JournalPaper;
import studentProject.products.paperProducts.Paper;

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
