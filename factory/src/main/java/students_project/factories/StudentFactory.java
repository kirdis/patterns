package students_project.factories;

import students_project.products.coursesProducts.Course;
import students_project.products.degreeDocumentProducts.DegreeDocument;
import students_project.products.paperProducts.Paper;

public interface StudentFactory {
    Course createCourse();
    DegreeDocument createDegreeDocument();
    Paper createPaper();
}
