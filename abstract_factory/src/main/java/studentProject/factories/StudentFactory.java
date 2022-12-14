package studentProject.factories;

import studentProject.products.coursesProducts.Course;
import studentProject.products.degreeDocumentProducts.DegreeDocument;
import studentProject.products.paperProducts.Paper;

public interface StudentFactory {
    Course createCourse();
    DegreeDocument createDegreeDocument();
    Paper createPaper();
}
