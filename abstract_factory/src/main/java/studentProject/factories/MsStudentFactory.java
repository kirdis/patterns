package studentProject.factories;

import studentProject.products.coursesProducts.Course;
import studentProject.products.coursesProducts.MsStudentCourse;
import studentProject.products.degreeDocumentProducts.DegreeDocument;
import studentProject.products.degreeDocumentProducts.MsThesis;
import studentProject.products.paperProducts.ConferencePaper;
import studentProject.products.paperProducts.Paper;

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
